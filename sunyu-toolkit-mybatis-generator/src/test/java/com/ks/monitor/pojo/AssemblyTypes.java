package com.ks.monitor.pojo;

public class AssemblyTypes {
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

    private Integer assembly_id;

    private String assembly_class;

    private Boolean is_binary_ordered;

    private Boolean is_fixed_length;

    private String prog_id;

    private String assembly_qualified_name;

    private Boolean is_table_type;

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

    public Integer getAssembly_id() {
        return assembly_id;
    }

    public void setAssembly_id(Integer assembly_id) {
        this.assembly_id = assembly_id;
    }

    public String getAssembly_class() {
        return assembly_class;
    }

    public void setAssembly_class(String assembly_class) {
        this.assembly_class = assembly_class == null ? null : assembly_class.trim();
    }

    public Boolean getIs_binary_ordered() {
        return is_binary_ordered;
    }

    public void setIs_binary_ordered(Boolean is_binary_ordered) {
        this.is_binary_ordered = is_binary_ordered;
    }

    public Boolean getIs_fixed_length() {
        return is_fixed_length;
    }

    public void setIs_fixed_length(Boolean is_fixed_length) {
        this.is_fixed_length = is_fixed_length;
    }

    public String getProg_id() {
        return prog_id;
    }

    public void setProg_id(String prog_id) {
        this.prog_id = prog_id == null ? null : prog_id.trim();
    }

    public String getAssembly_qualified_name() {
        return assembly_qualified_name;
    }

    public void setAssembly_qualified_name(String assembly_qualified_name) {
        this.assembly_qualified_name = assembly_qualified_name == null ? null : assembly_qualified_name.trim();
    }

    public Boolean getIs_table_type() {
        return is_table_type;
    }

    public void setIs_table_type(Boolean is_table_type) {
        this.is_table_type = is_table_type;
    }
}