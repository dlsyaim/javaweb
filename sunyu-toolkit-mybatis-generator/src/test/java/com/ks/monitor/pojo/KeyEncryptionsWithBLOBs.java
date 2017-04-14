package com.ks.monitor.pojo;

public class KeyEncryptionsWithBLOBs extends KeyEncryptions {
    private byte[] thumbprint;

    private byte[] crypt_property;

    public byte[] getThumbprint() {
        return thumbprint;
    }

    public void setThumbprint(byte[] thumbprint) {
        this.thumbprint = thumbprint;
    }

    public byte[] getCrypt_property() {
        return crypt_property;
    }

    public void setCrypt_property(byte[] crypt_property) {
        this.crypt_property = crypt_property;
    }
}