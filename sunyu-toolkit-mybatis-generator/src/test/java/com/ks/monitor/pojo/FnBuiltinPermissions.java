package com.ks.monitor.pojo;

public class FnBuiltinPermissions {
    private String class_desc;

    private String permission_name;

    private String type;

    private String covering_permission_name;

    private String parent_class_desc;

    private String parent_covering_permission_name;

    public String getClass_desc() {
        return class_desc;
    }

    public void setClass_desc(String class_desc) {
        this.class_desc = class_desc == null ? null : class_desc.trim();
    }

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

    public String getCovering_permission_name() {
        return covering_permission_name;
    }

    public void setCovering_permission_name(String covering_permission_name) {
        this.covering_permission_name = covering_permission_name == null ? null : covering_permission_name.trim();
    }

    public String getParent_class_desc() {
        return parent_class_desc;
    }

    public void setParent_class_desc(String parent_class_desc) {
        this.parent_class_desc = parent_class_desc == null ? null : parent_class_desc.trim();
    }

    public String getParent_covering_permission_name() {
        return parent_covering_permission_name;
    }

    public void setParent_covering_permission_name(String parent_covering_permission_name) {
        this.parent_covering_permission_name = parent_covering_permission_name == null ? null : parent_covering_permission_name.trim();
    }
}