package com.ks.monitor.pojo;

public class DmExecRequestsWithBLOBs extends DmExecRequests {
    private byte[] sql_handle;

    private byte[] plan_handle;

    private byte[] context_info;

    private byte[] task_address;

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

    public byte[] getContext_info() {
        return context_info;
    }

    public void setContext_info(byte[] context_info) {
        this.context_info = context_info;
    }

    public byte[] getTask_address() {
        return task_address;
    }

    public void setTask_address(byte[] task_address) {
        this.task_address = task_address;
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