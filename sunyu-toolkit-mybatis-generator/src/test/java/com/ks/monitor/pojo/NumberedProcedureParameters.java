package com.ks.monitor.pojo;

public class NumberedProcedureParameters {
    private Integer object_id;

    private Short procedure_number;

    private String name;

    private Integer parameter_id;

    private Byte system_type_id;

    private Integer user_type_id;

    private Short max_length;

    private Byte precision;

    private Byte scale;

    private Boolean is_output;

    private Boolean is_cursor_ref;

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public Short getProcedure_number() {
        return procedure_number;
    }

    public void setProcedure_number(Short procedure_number) {
        this.procedure_number = procedure_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Integer getUser_type_id() {
        return user_type_id;
    }

    public void setUser_type_id(Integer user_type_id) {
        this.user_type_id = user_type_id;
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

    public Boolean getIs_output() {
        return is_output;
    }

    public void setIs_output(Boolean is_output) {
        this.is_output = is_output;
    }

    public Boolean getIs_cursor_ref() {
        return is_cursor_ref;
    }

    public void setIs_cursor_ref(Boolean is_cursor_ref) {
        this.is_cursor_ref = is_cursor_ref;
    }
}