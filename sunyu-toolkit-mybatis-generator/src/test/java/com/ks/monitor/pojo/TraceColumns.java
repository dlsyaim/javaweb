package com.ks.monitor.pojo;

public class TraceColumns {
    private Short trace_column_id;

    private String name;

    private String type_name;

    private Integer max_size;

    private Boolean is_filterable;

    private Boolean is_repeatable;

    private Boolean is_repeated_base;

    public Short getTrace_column_id() {
        return trace_column_id;
    }

    public void setTrace_column_id(Short trace_column_id) {
        this.trace_column_id = trace_column_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name == null ? null : type_name.trim();
    }

    public Integer getMax_size() {
        return max_size;
    }

    public void setMax_size(Integer max_size) {
        this.max_size = max_size;
    }

    public Boolean getIs_filterable() {
        return is_filterable;
    }

    public void setIs_filterable(Boolean is_filterable) {
        this.is_filterable = is_filterable;
    }

    public Boolean getIs_repeatable() {
        return is_repeatable;
    }

    public void setIs_repeatable(Boolean is_repeatable) {
        this.is_repeatable = is_repeatable;
    }

    public Boolean getIs_repeated_base() {
        return is_repeated_base;
    }

    public void setIs_repeated_base(Boolean is_repeated_base) {
        this.is_repeated_base = is_repeated_base;
    }
}