package com.ks.monitor.pojo;

public class DmExecQueryMemoryGrantsWithBLOBs extends DmExecQueryMemoryGrants {
    private byte[] plan_handle;

    private byte[] sql_handle;

    public byte[] getPlan_handle() {
        return plan_handle;
    }

    public void setPlan_handle(byte[] plan_handle) {
        this.plan_handle = plan_handle;
    }

    public byte[] getSql_handle() {
        return sql_handle;
    }

    public void setSql_handle(byte[] sql_handle) {
        this.sql_handle = sql_handle;
    }
}