package com.ks.monitor.pojo;

public class DmExecTextQueryPlan {
    private Short dbid;

    private Integer objectid;

    private Short number;

    private Boolean encrypted;

    private String query_plan;

    public Short getDbid() {
        return dbid;
    }

    public void setDbid(Short dbid) {
        this.dbid = dbid;
    }

    public Integer getObjectid() {
        return objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public String getQuery_plan() {
        return query_plan;
    }

    public void setQuery_plan(String query_plan) {
        this.query_plan = query_plan == null ? null : query_plan.trim();
    }
}