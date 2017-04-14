package com.ks.monitor.pojo;

public class DmExecPlanAttributes {
    private String attribute;

    private String value;

    private Boolean is_cache_key;

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Boolean getIs_cache_key() {
        return is_cache_key;
    }

    public void setIs_cache_key(Boolean is_cache_key) {
        this.is_cache_key = is_cache_key;
    }
}