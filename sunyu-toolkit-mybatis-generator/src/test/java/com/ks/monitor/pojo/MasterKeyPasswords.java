package com.ks.monitor.pojo;

public class MasterKeyPasswords {
    private Integer credential_id;

    private String family_guid;

    public Integer getCredential_id() {
        return credential_id;
    }

    public void setCredential_id(Integer credential_id) {
        this.credential_id = credential_id;
    }

    public String getFamily_guid() {
        return family_guid;
    }

    public void setFamily_guid(String family_guid) {
        this.family_guid = family_guid == null ? null : family_guid.trim();
    }
}