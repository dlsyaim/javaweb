package com.ks.monitor.pojo;

public class PartitionRangeValues {
    private Integer function_id;

    private Integer boundary_id;

    private Integer parameter_id;

    private String value;

    public Integer getFunction_id() {
        return function_id;
    }

    public void setFunction_id(Integer function_id) {
        this.function_id = function_id;
    }

    public Integer getBoundary_id() {
        return boundary_id;
    }

    public void setBoundary_id(Integer boundary_id) {
        this.boundary_id = boundary_id;
    }

    public Integer getParameter_id() {
        return parameter_id;
    }

    public void setParameter_id(Integer parameter_id) {
        this.parameter_id = parameter_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}