package com.ks.monitor.pojo;

public class DmExecQueryStatsWithBLOBs extends DmExecQueryStats {
    private byte[] sql_handle;

    private byte[] plan_handle;

    private byte[] query_hash;

    private byte[] query_plan_hash;

    public byte[] getSql_handle() {
        return sql_handle;
    }

    public void setSql_handle(byte[] sql_handle) {
        this.sql_handle = sql_handle;
    }

    public byte[] getPlan_handle() {
        return plan_handle;
    }

    public void setPlan_handle(byte[] plan_handle) {
        this.plan_handle = plan_handle;
    }

    public byte[] getQuery_hash() {
        return query_hash;
    }

    public void setQuery_hash(byte[] query_hash) {
        this.query_hash = query_hash;
    }

    public byte[] getQuery_plan_hash() {
        return query_plan_hash;
    }

    public void setQuery_plan_hash(byte[] query_plan_hash) {
        this.query_plan_hash = query_plan_hash;
    }
}