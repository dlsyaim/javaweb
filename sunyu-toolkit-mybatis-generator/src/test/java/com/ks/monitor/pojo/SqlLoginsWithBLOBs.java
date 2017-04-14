package com.ks.monitor.pojo;

public class SqlLoginsWithBLOBs extends SqlLogins {
    private byte[] sid;

    private byte[] password_hash;

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public byte[] getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(byte[] password_hash) {
        this.password_hash = password_hash;
    }
}