package com.ks.monitor.pojo;

public class Services {
    private String name;

    private Integer service_id;

    private Integer principal_id;

    private Integer service_queue_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getService_id() {
        return service_id;
    }

    public void setService_id(Integer service_id) {
        this.service_id = service_id;
    }

    public Integer getPrincipal_id() {
        return principal_id;
    }

    public void setPrincipal_id(Integer principal_id) {
        this.principal_id = principal_id;
    }

    public Integer getService_queue_id() {
        return service_queue_id;
    }

    public void setService_queue_id(Integer service_queue_id) {
        this.service_queue_id = service_queue_id;
    }
}