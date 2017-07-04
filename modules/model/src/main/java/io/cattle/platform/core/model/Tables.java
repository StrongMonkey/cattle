/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model;


import io.cattle.platform.core.model.tables.AccountTable;
import io.cattle.platform.core.model.tables.AgentTable;
import io.cattle.platform.core.model.tables.AuditLogTable;
import io.cattle.platform.core.model.tables.AuthTokenTable;
import io.cattle.platform.core.model.tables.CertificateTable;
import io.cattle.platform.core.model.tables.ClusterMembershipTable;
import io.cattle.platform.core.model.tables.CredentialTable;
import io.cattle.platform.core.model.tables.DataTable;
import io.cattle.platform.core.model.tables.DatabasechangelogTable;
import io.cattle.platform.core.model.tables.DatabasechangeloglockTable;
import io.cattle.platform.core.model.tables.DeploymentUnitTable;
import io.cattle.platform.core.model.tables.DynamicSchemaRoleTable;
import io.cattle.platform.core.model.tables.DynamicSchemaTable;
import io.cattle.platform.core.model.tables.ExternalEventTable;
import io.cattle.platform.core.model.tables.GenericObjectTable;
import io.cattle.platform.core.model.tables.HostTable;
import io.cattle.platform.core.model.tables.HostTemplateTable;
import io.cattle.platform.core.model.tables.InstanceTable;
import io.cattle.platform.core.model.tables.MachineDriverTable;
import io.cattle.platform.core.model.tables.MountTable;
import io.cattle.platform.core.model.tables.NetworkDriverTable;
import io.cattle.platform.core.model.tables.NetworkTable;
import io.cattle.platform.core.model.tables.ProcessExecutionTable;
import io.cattle.platform.core.model.tables.ProcessInstanceTable;
import io.cattle.platform.core.model.tables.ProjectMemberTable;
import io.cattle.platform.core.model.tables.ProjectTemplateTable;
import io.cattle.platform.core.model.tables.ResourcePoolTable;
import io.cattle.platform.core.model.tables.RevisionTable;
import io.cattle.platform.core.model.tables.ScheduledUpgradeTable;
import io.cattle.platform.core.model.tables.SecretTable;
import io.cattle.platform.core.model.tables.ServiceEventTable;
import io.cattle.platform.core.model.tables.ServiceLogTable;
import io.cattle.platform.core.model.tables.ServiceTable;
import io.cattle.platform.core.model.tables.SettingTable;
import io.cattle.platform.core.model.tables.StackTable;
import io.cattle.platform.core.model.tables.StorageDriverTable;
import io.cattle.platform.core.model.tables.StoragePoolHostMapTable;
import io.cattle.platform.core.model.tables.StoragePoolTable;
import io.cattle.platform.core.model.tables.SubnetTable;
import io.cattle.platform.core.model.tables.UserPreferenceTable;
import io.cattle.platform.core.model.tables.VolumeStoragePoolMapTable;
import io.cattle.platform.core.model.tables.VolumeTable;
import io.cattle.platform.core.model.tables.VolumeTemplateTable;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in cattle
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>cattle.account</code>.
     */
    public static final AccountTable ACCOUNT = io.cattle.platform.core.model.tables.AccountTable.ACCOUNT;

    /**
     * The table <code>cattle.agent</code>.
     */
    public static final AgentTable AGENT = io.cattle.platform.core.model.tables.AgentTable.AGENT;

    /**
     * The table <code>cattle.audit_log</code>.
     */
    public static final AuditLogTable AUDIT_LOG = io.cattle.platform.core.model.tables.AuditLogTable.AUDIT_LOG;

    /**
     * The table <code>cattle.auth_token</code>.
     */
    public static final AuthTokenTable AUTH_TOKEN = io.cattle.platform.core.model.tables.AuthTokenTable.AUTH_TOKEN;

    /**
     * The table <code>cattle.certificate</code>.
     */
    public static final CertificateTable CERTIFICATE = io.cattle.platform.core.model.tables.CertificateTable.CERTIFICATE;

    /**
     * The table <code>cattle.cluster_membership</code>.
     */
    public static final ClusterMembershipTable CLUSTER_MEMBERSHIP = io.cattle.platform.core.model.tables.ClusterMembershipTable.CLUSTER_MEMBERSHIP;

    /**
     * The table <code>cattle.credential</code>.
     */
    public static final CredentialTable CREDENTIAL = io.cattle.platform.core.model.tables.CredentialTable.CREDENTIAL;

    /**
     * The table <code>cattle.data</code>.
     */
    public static final DataTable DATA = io.cattle.platform.core.model.tables.DataTable.DATA;

    /**
     * The table <code>cattle.DATABASECHANGELOG</code>.
     */
    public static final DatabasechangelogTable DATABASECHANGELOG = io.cattle.platform.core.model.tables.DatabasechangelogTable.DATABASECHANGELOG;

    /**
     * The table <code>cattle.DATABASECHANGELOGLOCK</code>.
     */
    public static final DatabasechangeloglockTable DATABASECHANGELOGLOCK = io.cattle.platform.core.model.tables.DatabasechangeloglockTable.DATABASECHANGELOGLOCK;

    /**
     * The table <code>cattle.deployment_unit</code>.
     */
    public static final DeploymentUnitTable DEPLOYMENT_UNIT = io.cattle.platform.core.model.tables.DeploymentUnitTable.DEPLOYMENT_UNIT;

    /**
     * The table <code>cattle.dynamic_schema</code>.
     */
    public static final DynamicSchemaTable DYNAMIC_SCHEMA = io.cattle.platform.core.model.tables.DynamicSchemaTable.DYNAMIC_SCHEMA;

    /**
     * The table <code>cattle.dynamic_schema_role</code>.
     */
    public static final DynamicSchemaRoleTable DYNAMIC_SCHEMA_ROLE = io.cattle.platform.core.model.tables.DynamicSchemaRoleTable.DYNAMIC_SCHEMA_ROLE;

    /**
     * The table <code>cattle.environment</code>.
     */
    public static final StackTable STACK = io.cattle.platform.core.model.tables.StackTable.STACK;

    /**
     * The table <code>cattle.external_event</code>.
     */
    public static final ExternalEventTable EXTERNAL_EVENT = io.cattle.platform.core.model.tables.ExternalEventTable.EXTERNAL_EVENT;

    /**
     * The table <code>cattle.generic_object</code>.
     */
    public static final GenericObjectTable GENERIC_OBJECT = io.cattle.platform.core.model.tables.GenericObjectTable.GENERIC_OBJECT;

    /**
     * The table <code>cattle.host</code>.
     */
    public static final HostTable HOST = io.cattle.platform.core.model.tables.HostTable.HOST;

    /**
     * The table <code>cattle.host_template</code>.
     */
    public static final HostTemplateTable HOST_TEMPLATE = io.cattle.platform.core.model.tables.HostTemplateTable.HOST_TEMPLATE;

    /**
     * The table <code>cattle.instance</code>.
     */
    public static final InstanceTable INSTANCE = io.cattle.platform.core.model.tables.InstanceTable.INSTANCE;

    /**
     * The table <code>cattle.machine_driver</code>.
     */
    public static final MachineDriverTable MACHINE_DRIVER = io.cattle.platform.core.model.tables.MachineDriverTable.MACHINE_DRIVER;

    /**
     * The table <code>cattle.mount</code>.
     */
    public static final MountTable MOUNT = io.cattle.platform.core.model.tables.MountTable.MOUNT;

    /**
     * The table <code>cattle.network</code>.
     */
    public static final NetworkTable NETWORK = io.cattle.platform.core.model.tables.NetworkTable.NETWORK;

    /**
     * The table <code>cattle.network_driver</code>.
     */
    public static final NetworkDriverTable NETWORK_DRIVER = io.cattle.platform.core.model.tables.NetworkDriverTable.NETWORK_DRIVER;

    /**
     * The table <code>cattle.process_execution</code>.
     */
    public static final ProcessExecutionTable PROCESS_EXECUTION = io.cattle.platform.core.model.tables.ProcessExecutionTable.PROCESS_EXECUTION;

    /**
     * The table <code>cattle.process_instance</code>.
     */
    public static final ProcessInstanceTable PROCESS_INSTANCE = io.cattle.platform.core.model.tables.ProcessInstanceTable.PROCESS_INSTANCE;

    /**
     * The table <code>cattle.project_member</code>.
     */
    public static final ProjectMemberTable PROJECT_MEMBER = io.cattle.platform.core.model.tables.ProjectMemberTable.PROJECT_MEMBER;

    /**
     * The table <code>cattle.project_template</code>.
     */
    public static final ProjectTemplateTable PROJECT_TEMPLATE = io.cattle.platform.core.model.tables.ProjectTemplateTable.PROJECT_TEMPLATE;

    /**
     * The table <code>cattle.resource_pool</code>.
     */
    public static final ResourcePoolTable RESOURCE_POOL = io.cattle.platform.core.model.tables.ResourcePoolTable.RESOURCE_POOL;

    /**
     * The table <code>cattle.revision</code>.
     */
    public static final RevisionTable REVISION = io.cattle.platform.core.model.tables.RevisionTable.REVISION;

    /**
     * The table <code>cattle.scheduled_upgrade</code>.
     */
    public static final ScheduledUpgradeTable SCHEDULED_UPGRADE = io.cattle.platform.core.model.tables.ScheduledUpgradeTable.SCHEDULED_UPGRADE;

    /**
     * The table <code>cattle.secret</code>.
     */
    public static final SecretTable SECRET = io.cattle.platform.core.model.tables.SecretTable.SECRET;

    /**
     * The table <code>cattle.service</code>.
     */
    public static final ServiceTable SERVICE = io.cattle.platform.core.model.tables.ServiceTable.SERVICE;

    /**
     * The table <code>cattle.service_event</code>.
     */
    public static final ServiceEventTable SERVICE_EVENT = io.cattle.platform.core.model.tables.ServiceEventTable.SERVICE_EVENT;

    /**
     * The table <code>cattle.service_log</code>.
     */
    public static final ServiceLogTable SERVICE_LOG = io.cattle.platform.core.model.tables.ServiceLogTable.SERVICE_LOG;

    /**
     * The table <code>cattle.setting</code>.
     */
    public static final SettingTable SETTING = io.cattle.platform.core.model.tables.SettingTable.SETTING;

    /**
     * The table <code>cattle.storage_driver</code>.
     */
    public static final StorageDriverTable STORAGE_DRIVER = io.cattle.platform.core.model.tables.StorageDriverTable.STORAGE_DRIVER;

    /**
     * The table <code>cattle.storage_pool</code>.
     */
    public static final StoragePoolTable STORAGE_POOL = io.cattle.platform.core.model.tables.StoragePoolTable.STORAGE_POOL;

    /**
     * The table <code>cattle.storage_pool_host_map</code>.
     */
    public static final StoragePoolHostMapTable STORAGE_POOL_HOST_MAP = io.cattle.platform.core.model.tables.StoragePoolHostMapTable.STORAGE_POOL_HOST_MAP;

    /**
     * The table <code>cattle.subnet</code>.
     */
    public static final SubnetTable SUBNET = io.cattle.platform.core.model.tables.SubnetTable.SUBNET;

    /**
     * The table <code>cattle.user_preference</code>.
     */
    public static final UserPreferenceTable USER_PREFERENCE = io.cattle.platform.core.model.tables.UserPreferenceTable.USER_PREFERENCE;

    /**
     * The table <code>cattle.volume</code>.
     */
    public static final VolumeTable VOLUME = io.cattle.platform.core.model.tables.VolumeTable.VOLUME;

    /**
     * The table <code>cattle.volume_storage_pool_map</code>.
     */
    public static final VolumeStoragePoolMapTable VOLUME_STORAGE_POOL_MAP = io.cattle.platform.core.model.tables.VolumeStoragePoolMapTable.VOLUME_STORAGE_POOL_MAP;

    /**
     * The table <code>cattle.volume_template</code>.
     */
    public static final VolumeTemplateTable VOLUME_TEMPLATE = io.cattle.platform.core.model.tables.VolumeTemplateTable.VOLUME_TEMPLATE;
}
