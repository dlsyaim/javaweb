package com.ks.monitor.pojo;

public class PartitionParameters {
    private Integer function_id;

    private Integer parameter_id;

    private Byte system_type_id;

    private Short max_length;

    private Byte precision;

    private Byte scale;

    private String collation_name;

    private Integer user_type_id;

    public Integer getFunction_id() {
        return function_id;
    }

    public void setFunction_id(Integer function_id) {
        this.function_id = function_id;
    }

    public Integer getParameter_id() {
        return parameter_id;
    }

    public void setParameter_id(Integer parameter_id) {
        this.parameter_id = parameter_id;
    }

    public Byte getSystem_type_id() {
        return system_type_id;
    }

    public void setSystem_type_id(Byte system_type_id) {
        this.system_type_id = system_type_id;
    }

    public Short getMax_length() {
        return max_length;
    }

    public void setMax_length(Short max_length) {
        this.max_length = max_length;
    }

    public Byte getPrecision() {
        return precision;
    }

    public void setPrecision(Byte precision) {
        this.precision = precision;
    }

    public Byte getScale() {
        return scale;
    }

    public void setScale(Byte scale) {
        this.scale = scale;
    }

    public String getCollation_name() {
        return collation_name;
    }

    public void setCollation_name(String collation_name) {
        this.collation_name = collation_name == null ? null : collation_name.trim();
    }

    public Integer getUser_type_id() {
        return user_type_id;
    }

    public void setUser_type_id(Integer user_type_id) {
        this.user_type_id = user_type_id;
    }
}