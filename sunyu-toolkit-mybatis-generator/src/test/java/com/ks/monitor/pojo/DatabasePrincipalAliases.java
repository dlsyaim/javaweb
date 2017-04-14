package com.ks.monitor.pojo;

public class DatabasePrincipalAliases {
    private String name;

    private Boolean is_windows_sid;

    private Integer alias_principal_id;

    private byte[] sid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getIs_windows_sid() {
        return is_windows_sid;
    }

    public void setIs_windows_sid(Boolean is_windows_sid) {
        this.is_windows_sid = is_windows_sid;
    }

    public Integer getAlias_principal_id() {
        return alias_principal_id;
    }

    public void setAlias_principal_id(Integer alias_principal_id) {
        this.alias_principal_id = alias_principal_id;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }
}