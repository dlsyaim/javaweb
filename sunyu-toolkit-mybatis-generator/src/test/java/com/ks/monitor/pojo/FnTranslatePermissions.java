package com.ks.monitor.pojo;

public class FnTranslatePermissions {
    private String permission_name;

    private String type;

    public String getPermission_name() {
        return permission_name;
    }

    public void setPermission_name(String permission_name) {
        this.permission_name = permission_name == null ? null : permission_name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}