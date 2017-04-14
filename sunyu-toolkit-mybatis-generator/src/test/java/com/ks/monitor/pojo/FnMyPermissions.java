package com.ks.monitor.pojo;

public class FnMyPermissions {
    private String entity_name;

    private String subentity_name;

    private String permission_name;

    public String getEntity_name() {
        return entity_name;
    }

    public void setEntity_name(String entity_name) {
        this.entity_name = entity_name == null ? null : entity_name.trim();
    }

    public String getSubentity_name() {
        return subentity_name;
    }

    public void setSubentity_name(String subentity_name) {
        this.subentity_name = subentity_name == null ? null : subentity_name.trim();
    }

    public String getPermission_name() {
        return permission_name;
    }

    public void setPermission_name(String permission_name) {
        this.permission_name = permission_name == null ? null : permission_name.trim();
    }
}