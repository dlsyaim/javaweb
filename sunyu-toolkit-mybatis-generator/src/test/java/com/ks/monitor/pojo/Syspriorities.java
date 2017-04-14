package com.ks.monitor.pojo;

public class Syspriorities {
    private Integer priority_id;

    private String name;

    private Integer service_contract_id;

    private Integer local_service_id;

    private String remote_service_name;

    private Byte priority;

    public Integer getPriority_id() {
        return priority_id;
    }

    public void setPriority_id(Integer priority_id) {
        this.priority_id = priority_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getService_contract_id() {
        return service_contract_id;
    }

    public void setService_contract_id(Integer service_contract_id) {
        this.service_contract_id = service_contract_id;
    }

    public Integer getLocal_service_id() {
        return local_service_id;
    }

    public void setLocal_service_id(Integer local_service_id) {
        this.local_service_id = local_service_id;
    }

    public String getRemote_service_name() {
        return remote_service_name;
    }

    public void setRemote_service_name(String remote_service_name) {
        this.remote_service_name = remote_service_name == null ? null : remote_service_name.trim();
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }
}