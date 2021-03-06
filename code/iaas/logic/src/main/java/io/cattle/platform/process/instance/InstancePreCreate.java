package io.cattle.platform.process.instance;

import io.cattle.platform.core.addon.LogConfig;
import io.cattle.platform.core.addon.SecretReference;
import io.cattle.platform.core.constants.AgentConstants;
import io.cattle.platform.core.constants.DockerInstanceConstants;
import io.cattle.platform.core.constants.InstanceConstants;
import io.cattle.platform.core.constants.NetworkConstants;
import io.cattle.platform.core.dao.ServiceDao;
import io.cattle.platform.core.dao.StorageDriverDao;
import io.cattle.platform.core.model.Instance;
import io.cattle.platform.core.model.Network;
import io.cattle.platform.core.model.Stack;
import io.cattle.platform.core.model.StorageDriver;
import io.cattle.platform.core.model.Volume;
import io.cattle.platform.core.util.ServiceUtil;
import io.cattle.platform.core.util.SystemLabels;
import io.cattle.platform.engine.handler.HandlerResult;
import io.cattle.platform.engine.handler.ProcessPreListener;
import io.cattle.platform.engine.process.ProcessInstance;
import io.cattle.platform.engine.process.ProcessState;
import io.cattle.platform.engine.process.impl.ProcessCancelException;
import io.cattle.platform.json.JsonMapper;
import io.cattle.platform.object.meta.ObjectMetaDataManager;
import io.cattle.platform.object.util.DataAccessor;
import io.cattle.platform.object.util.ObjectUtils;
import io.cattle.platform.process.common.handler.AbstractObjectProcessLogic;
import io.cattle.platform.token.TokenService;
import io.cattle.platform.util.type.CollectionUtils;
import io.cattle.platform.util.type.Priority;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Joiner;

@Named
public class InstancePreCreate extends AbstractObjectProcessLogic implements ProcessPreListener, Priority {

    @Inject
    JsonMapper jsonMapper;
    @Inject
    StorageDriverDao storageDriverDao;
    @Inject
    TokenService tokenService;
    @Inject
    ServiceDao svcDao;

    @Override
    public String[] getProcessNames() {
        return new String[] { InstanceConstants.PROCESS_CREATE };
    }

    @Override
    public HandlerResult handle(ProcessState state, ProcessInstance process) {
        Instance instance = (Instance)state.getResource();
        if (!InstanceConstants.CONTAINER_LIKE.contains(instance.getKind())) {
            return null;
        }
        Map<String, Object> labels = DataAccessor.fieldMap(instance, InstanceConstants.FIELD_LABELS);
        Map<Object, Object> data = new HashMap<>();
        setAgentVolumes(instance, labels, data);
        setName(instance, labels, data);
        setLogConfig(instance, data);
        setSecrets(instance, data);
        setSystemLabel(instance, labels);
        Stack stack = setStack(instance, data);
        setDns(instance, labels, data, stack);

        if (!data.isEmpty()) {
            return new HandlerResult(data);
        }
        return null;
    }

    protected Stack setStack(Instance instance, Map<Object, Object> data) {
        Long stackId = instance.getStackId();
        if (stackId != null) {
            data.put(InstanceConstants.FIELD_STACK_ID, stackId);
            return objectManager.loadResource(Stack.class, stackId);
        }
        Stack stack = svcDao.getOrCreateDefaultStack(instance.getAccountId());
        data.put(InstanceConstants.FIELD_STACK_ID, stack.getId());
        return stack;
    }

    protected void setName(Instance instance, Map<String, Object> labels, Map<Object, Object> data) {
        String name = ObjectUtils.toString(labels.get(SystemLabels.LABEL_DISPLAY_NAME));
        if (StringUtils.isBlank(name)) {
            name = instance.getName();
        }

        if (StringUtils.isBlank(name)) {
            name = "r-" + instance.getUuid().substring(0, 8);
        }

        data.put(ObjectMetaDataManager.NAME_FIELD, name.replaceFirst("/", ""));
    }

    protected void setAgentVolumes(Instance instance, Map<String, Object> labels, Map<Object, Object> data) {
        if (!"true".equals(labels.get(SystemLabels.LABEL_AGENT_CREATE))) {
            return;
        }

        List<String> dataVolumes = DataAccessor.appendToFieldStringList(instance, InstanceConstants.FIELD_DATA_VOLUMES,
            AgentConstants.AGENT_INSTANCE_BIND_MOUNT);
        data.put(InstanceConstants.FIELD_DATA_VOLUMES, dataVolumes);
    }

    protected void setSecrets(Instance instance, Map<Object, Object> data) {
        List<SecretReference> secrets = DataAccessor.fieldObjectList(instance, InstanceConstants.FIELD_SECRETS,
                SecretReference.class, jsonMapper);
        if (secrets == null || secrets.isEmpty()) {
            return;
        }

        StorageDriver driver = storageDriverDao.findSecretsDriver(instance.getAccountId());
        if (driver == null) {
            return;
        }

        String token = tokenService.generateToken(CollectionUtils.asMap("uuid", instance.getUuid()),
                new Date(System.currentTimeMillis() + 31556926000L));

        try {
            Volume vol = storageDriverDao.createSecretsVolume(instance, driver, token);
            createIfNot(vol, null);
        } catch (ProcessCancelException e) {
            // ignore
        }
    }

    protected void setLogConfig(Instance instance, Map<Object, Object> data) {
        LogConfig logConfig = DataAccessor.field(instance,
                InstanceConstants.FIELD_LOG_CONFIG, jsonMapper, LogConfig.class);
        if (logConfig != null && !StringUtils.isEmpty(logConfig.getDriver()) && logConfig.getConfig() == null) {
            logConfig.setConfig(new HashMap<String, String>());
            data.put(InstanceConstants.FIELD_LOG_CONFIG, logConfig);
        }
    }

    protected void setDns(Instance instance, Map<String, Object> labels, Map<Object, Object> data, Stack stack) {
        if (!InstanceConstants.KIND_CONTAINER.equals(instance.getKind())) {
            return;
        }

        boolean addDns = DataAccessor.fromMap(labels).withKey(SystemLabels.LABEL_USE_RANCHER_DNS).withDefault(true).as(Boolean.class);
        if (!addDns) {
            return;
        }

        List<Long> networkIds = DataAccessor.fieldLongList(instance, InstanceConstants.FIELD_NETWORK_IDS);
        if (networkIds == null || networkIds.size() == 0) {
            return;
        }

        for (Long networkId : networkIds) {
            Network network = objectManager.loadResource(Network.class, networkId);
            for (String dns : DataAccessor.fieldStringList(network, NetworkConstants.FIELD_DNS)) {
                List<String> dnsList = DataAccessor.appendToFieldStringList(instance, DockerInstanceConstants.FIELD_DNS, dns);
                data.put(DockerInstanceConstants.FIELD_DNS, dnsList);
                data.put(InstanceConstants.FIELD_DNS_INTERNAL, Joiner.on(",").join(dnsList));
            }
            for (String dnsSearch : DataAccessor.fieldStringList(network, NetworkConstants.FIELD_DNS_SEARCH)) {
                List<String> dnsSearchList = DataAccessor.appendToFieldStringList(instance, DockerInstanceConstants.FIELD_DNS_SEARCH, dnsSearch);
                data.put(DockerInstanceConstants.FIELD_DNS_SEARCH, dnsSearchList);
                String stackDns = null;
                if (stack != null) {
                    stackDns = ServiceUtil.getStackNamespace(stack.getName());
                }
                if (!dnsSearchList.contains(stackDns)) {
                    dnsSearchList.add(stackDns);
                }
                data.put(InstanceConstants.FIELD_DNS_SEARCH_INTERNAL, Joiner.on(",").join(dnsSearchList));
            }
        }
    }

    protected void setSystemLabel(Instance instance, Map<String, Object> labels) {
        if(Boolean.TRUE.equals(instance.getSystem()) && !labels.containsKey(SystemLabels.LABEL_CONTAINER_SYSTEM)) {
            labels.put(SystemLabels.LABEL_CONTAINER_SYSTEM, "true");
        }
    }

    @Override
    public int getPriority() {
        return Priority.PRE;
    }

}
