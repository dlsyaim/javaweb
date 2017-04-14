package com.ks.monitor.pojo;

public class TableTypes {
    private String name;

    private Byte system_type_id;

    private Integer user_type_id;

    private Integer schema_id;

    private Integer principal_id;

    private Short max_length;

    private Byte precision;

    private Byte scale;

    private String collation_name;

    private Boolean is_nullable;

    private Boolean is_user_defined;

    private Boolean is_assembly_type;

    private Integer default_object_id;

    private Integer rule_object_id;

    private Boolean is_table_type;

    private Integer type_table_object_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Integer getSchema_id() {
        return schema_id;
    }

    public void setSchema_id(Integer schema_id) {
        this.schema_id = schema_id;
    }

    public Integer getPrincipal_id() {
        return principal_id;
    }

    public void setPrincipal_id(Integer principal_id) {
        this.principal_id = principal_id;
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

    public Boolean getIs_nullable() {
        return is_nullable;
    }

    public void setIs_nullable(Boolean is_nullable) {
        this.is_nullable = is_nullable;
    }

    public Boolean getIs_user_defined() {
        return is_user_defined;
    }

    public void setIs_user_defined(Boolean is_user_defined) {
        this.is_user_defined = is_user_defined;
    }

    public Boolean getIs_assembly_type() {
        return is_assembly_type;
    }

    public void setIs_assembly_type(Boolean is_assembly_type) {
        this.is_assembly_type = is_assembly_type;
    }

    public Integer getDefault_object_id() {
        return default_object_id;
    }

    public void setDefault_object_id(Integer default_object_id) {
        this.default_object_id = default_object_id;
    }

    public Integer getRule_object_id() {
        return rule_object_id;
    }

    public void setRule_object_id(Integer rule_object_id) {
        this.rule_object_id = rule_object_id;
    }

    public Boolean getIs_table_type() {
        return is_table_type;
    }

    public void setIs_table_type(Boolean is_table_type) {
        this.is_table_type = is_table_type;
    }

    public Integer getType_table_object_id() {
        return type_table_object_id;
    }

    public void setType_table_object_id(Integer type_table_object_id) {
        this.type_table_object_id = type_table_object_id;
    }
}