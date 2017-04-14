package com.ks.monitor.pojo;

public class DmCryptographicProviderSessions {
    private Integer provider_id;

    private String identity;

    private Short spid;

    private byte[] session_handle;

    public Integer getProvider_id() {
        return provider_id;
    }

    public void setProvider_id(Integer provider_id) {
        this.provider_id = provider_id;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public Short getSpid() {
        return spid;
    }

    public void setSpid(Short spid) {
        this.spid = spid;
    }

    public byte[] getSession_handle() {
        return session_handle;
    }

    public void setSession_handle(byte[] session_handle) {
        this.session_handle = session_handle;
    }
}