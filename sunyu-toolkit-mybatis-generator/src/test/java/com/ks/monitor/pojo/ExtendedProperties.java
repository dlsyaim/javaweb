package com.ks.monitor.pojo;

public class ExtendedProperties {
    private Byte class;

    private String class_desc;

    private Integer major_id;

    private Integer minor_id;

    private String name;

    private String value;

    public Byte getClass() {
        return class;
    }

    public void setClass(Byte class) {
        this.class = class;
    }

    public String getClass_desc() {
        return class_desc;
    }

    public void setClass_desc(String class_desc) {
        this.class_desc = class_desc == null ? null : class_desc.trim();
    }

    public Integer getMajor_id() {
        return major_id;
    }

    public void setMajor_id(Integer major_id) {
        this.major_id = major_id;
    }

    public Integer getMinor_id() {
        return minor_id;
    }

    public void setMinor_id(Integer minor_id) {
        this.minor_id = minor_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}