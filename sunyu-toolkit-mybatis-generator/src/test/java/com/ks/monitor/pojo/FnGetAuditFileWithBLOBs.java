package com.ks.monitor.pojo;

public class FnGetAuditFileWithBLOBs extends FnGetAuditFile {
    private byte[] server_principal_sid;

    private byte[] target_server_principal_sid;

    public byte[] getServer_principal_sid() {
        return server_principal_sid;
    }

    public void setServer_principal_sid(byte[] server_principal_sid) {
        this.server_principal_sid = server_principal_sid;
    }

    public byte[] getTarget_server_principal_sid() {
        return target_server_principal_sid;
    }

    public void setTarget_server_principal_sid(byte[] target_server_principal_sid) {
        this.target_server_principal_sid = target_server_principal_sid;
    }
}