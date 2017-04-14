package com.ks.monitor.pojo;

public class AsymmetricKeysWithBLOBs extends AsymmetricKeys {
    private byte[] thumbprint;

    private byte[] sid;

    private byte[] public_key;

    public byte[] getThumbprint() {
        return thumbprint;
    }

    public void setThumbprint(byte[] thumbprint) {
        this.thumbprint = thumbprint;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public byte[] getPublic_key() {
        return public_key;
    }

    public void setPublic_key(byte[] public_key) {
        this.public_key = public_key;
    }
}