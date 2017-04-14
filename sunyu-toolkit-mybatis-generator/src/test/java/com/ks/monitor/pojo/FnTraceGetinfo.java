package com.ks.monitor.pojo;

public class FnTraceGetinfo {
    private Integer traceid;

    private Integer property;

    private String value;

    public Integer getTraceid() {
        return traceid;
    }

    public void setTraceid(Integer traceid) {
        this.traceid = traceid;
    }

    public Integer getProperty() {
        return property;
    }

    public void setProperty(Integer property) {
        this.property = property;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}