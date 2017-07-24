package io.cattle.platform.core.addon;

import io.cattle.platform.core.model.Credential;
import io.cattle.platform.core.model.DeploymentUnit;
import io.cattle.platform.core.model.Instance;
import io.cattle.platform.core.model.Volume;
import io.github.ibuildthecloud.gdapi.annotation.Field;
import io.github.ibuildthecloud.gdapi.annotation.Type;

import java.util.List;

@Type(list = false)
public class DeploymentSyncRequest {

    String deploymentUnitUuid;
    String revision;

    List<Instance> containers;
    List<Volume> volumes;
    List<Credential> registryCredentials;

    public DeploymentSyncRequest() {
    }

    public DeploymentSyncRequest(DeploymentUnit unit, String revision, List<Instance> containers, List<Volume> volumes, List<Credential> registryCredentials) {
        this.deploymentUnitUuid = deploymentUnitUuid;
        this.revision = revision;
        this.containers = containers;
        this.volumes = volumes;
        this.registryCredentials = registryCredentials;
    }

    public String getDeploymentUnitUuid() {
        return deploymentUnitUuid;
    }

    public void setDeploymentUnitUuid(String deploymentUnitUuid) {
        this.deploymentUnitUuid = deploymentUnitUuid;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    @Field(typeString = "array[container]")
    public List<Instance> getContainers() {
        return containers;
    }

    public void setContainers(List<Instance> containers) {
        this.containers = containers;
    }

    public List<Volume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<Volume> volumes) {
        this.volumes = volumes;
    }

    public List<Credential> getRegistryCredentials() {
        return registryCredentials;
    }

    public void setRegistryCredentials(List<Credential> registryCredentials) {
        this.registryCredentials = registryCredentials;
    }

}
