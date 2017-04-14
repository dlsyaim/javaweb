package com.ks.monitor.pojo;

public class SystemParameters {
    private Integer object_id;

    private String name;

    private Integer parameter_id;

    private Byte system_type_id;

    private Integer user_type_id;

    private Short max_length;

    private Byte precision;

    private Byte scale;

    private Boolean is_output;

    private Boolean is_cursor_ref;

    private Boolean has_default_value;

    private Boolean is_xml_document;

    private String default_value;

    private Integer xml_collection_id;

    private Boolean is_readonly;

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
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

    public Boolean getHas_default_value() {
        return has_default_value;
    }

    public void setHas_default_value(Boolean has_default_value) {
        this.has_default_value = has_default_value;
    }

    public Boolean getIs_xml_document() {
        return is_xml_document;
    }

    public void setIs_xml_document(Boolean is_xml_document) {
        this.is_xml_document = is_xml_document;
    }

    public String getDefault_value() {
        return default_value;
    }

    public void setDefault_value(String default_value) {
        this.default_value = default_value == null ? null : default_value.trim();
    }

    public Integer getXml_collection_id() {
        return xml_collection_id;
    }

    public void setXml_collection_id(Integer xml_collection_id) {
        this.xml_collection_id = xml_collection_id;
    }

    public Boolean getIs_readonly() {
        return is_readonly;
    }

    public void setIs_readonly(Boolean is_readonly) {
        this.is_readonly = is_readonly;
    }
}