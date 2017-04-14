package com.ks.monitor.pojo;

public class Sysconvgroup {
    private String id;

    private Integer service_id;

    private Integer status;

    private Integer refcount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getService_id() {
        return service_id;
    }

    public void setService_id(Integer service_id) {
        this.service_id = service_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRefcount() {
        return refcount;
    }

    public void setRefcount(Integer refcount) {
        this.refcount = refcount;
    }
}