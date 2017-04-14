package com.ks.monitor.pojo;

public class SecurableClasses {
    private String class_desc;

    private Integer class;

    public String getClass_desc() {
        return class_desc;
    }

    public void setClass_desc(String class_desc) {
        this.class_desc = class_desc == null ? null : class_desc.trim();
    }

    public Integer getClass() {
        return class;
    }

    public void setClass(Integer class) {
        this.class = class;
    }
}