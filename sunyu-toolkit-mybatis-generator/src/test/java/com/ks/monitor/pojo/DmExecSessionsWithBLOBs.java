package com.ks.monitor.pojo;

public class DmExecSessionsWithBLOBs extends DmExecSessions {
    private byte[] security_id;

    private byte[] context_info;

    private byte[] original_security_id;

    public byte[] getSecurity_id() {
        return security_id;
    }

    public void setSecurity_id(byte[] security_id) {
        this.security_id = security_id;
    }

    public byte[] getContext_info() {
        return context_info;
    }

    public void setContext_info(byte[] context_info) {
        this.context_info = context_info;
    }

    public byte[] getOriginal_security_id() {
        return original_security_id;
    }

    public void setOriginal_security_id(byte[] original_security_id) {
        this.original_security_id = original_security_id;
    }
}