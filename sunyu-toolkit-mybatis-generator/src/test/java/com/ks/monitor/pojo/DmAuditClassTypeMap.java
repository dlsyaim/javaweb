package com.ks.monitor.pojo;

public class DmAuditClassTypeMap {
    private String class_type;

    private String class_type_desc;

    private String securable_class_desc;

    public String getClass_type() {
        return class_type;
    }

    public void setClass_type(String class_type) {
        this.class_type = class_type == null ? null : class_type.trim();
    }

    public String getClass_type_desc() {
        return class_type_desc;
    }

    public void setClass_type_desc(String class_type_desc) {
        this.class_type_desc = class_type_desc == null ? null : class_type_desc.trim();
    }

    public String getSecurable_class_desc() {
        return securable_class_desc;
    }

    public void setSecurable_class_desc(String securable_class_desc) {
        this.securable_class_desc = securable_class_desc == null ? null : securable_class_desc.trim();
    }
}