package com.ks.monitor.pojo;

public class TriggerEventTypes {
    private Integer type;

    private String type_name;

    private Integer parent_type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name == null ? null : type_name.trim();
    }

    public Integer getParent_type() {
        return parent_type;
    }

    public void setParent_type(Integer parent_type) {
        this.parent_type = parent_type;
    }
}