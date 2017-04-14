package com.ks.monitor.pojo;

public class DmBrokerActivatedTasks {
    private Integer spid;

    private Short database_id;

    private Integer queue_id;

    private String procedure_name;

    private Integer execute_as;

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public Short getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Short database_id) {
        this.database_id = database_id;
    }

    public Integer getQueue_id() {
        return queue_id;
    }

    public void setQueue_id(Integer queue_id) {
        this.queue_id = queue_id;
    }

    public String getProcedure_name() {
        return procedure_name;
    }

    public void setProcedure_name(String procedure_name) {
        this.procedure_name = procedure_name == null ? null : procedure_name.trim();
    }

    public Integer getExecute_as() {
        return execute_as;
    }

    public void setExecute_as(Integer execute_as) {
        this.execute_as = execute_as;
    }
}