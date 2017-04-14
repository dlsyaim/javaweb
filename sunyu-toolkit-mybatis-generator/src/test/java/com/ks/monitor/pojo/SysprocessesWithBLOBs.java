package com.ks.monitor.pojo;

public class SysprocessesWithBLOBs extends Sysprocesses {
    private byte[] waittype;

    private byte[] sid;

    private byte[] context_info;

    private byte[] sql_handle;

    public byte[] getWaittype() {
        return waittype;
    }

    public void setWaittype(byte[] waittype) {
        this.waittype = waittype;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public byte[] getContext_info() {
        return context_info;
    }

    public void setContext_info(byte[] context_info) {
        this.context_info = context_info;
    }

    public byte[] getSql_handle() {
        return sql_handle;
    }

    public void setSql_handle(byte[] sql_handle) {
        this.sql_handle = sql_handle;
    }
}