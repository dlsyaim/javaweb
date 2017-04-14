package com.ks.monitor.pojo;

public class DmOsPerformanceCounters {
    private String object_name;

    private String counter_name;

    private String instance_name;

    private Long cntr_value;

    private Integer cntr_type;

    public String getObject_name() {
        return object_name;
    }

    public void setObject_name(String object_name) {
        this.object_name = object_name == null ? null : object_name.trim();
    }

    public String getCounter_name() {
        return counter_name;
    }

    public void setCounter_name(String counter_name) {
        this.counter_name = counter_name == null ? null : counter_name.trim();
    }

    public String getInstance_name() {
        return instance_name;
    }

    public void setInstance_name(String instance_name) {
        this.instance_name = instance_name == null ? null : instance_name.trim();
    }

    public Long getCntr_value() {
        return cntr_value;
    }

    public void setCntr_value(Long cntr_value) {
        this.cntr_value = cntr_value;
    }

    public Integer getCntr_type() {
        return cntr_type;
    }

    public void setCntr_type(Integer cntr_type) {
        this.cntr_type = cntr_type;
    }
}