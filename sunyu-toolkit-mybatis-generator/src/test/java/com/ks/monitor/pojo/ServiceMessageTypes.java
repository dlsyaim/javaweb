package com.ks.monitor.pojo;

public class ServiceMessageTypes {
    private String name;

    private Integer message_type_id;

    private Integer principal_id;

    private String validation;

    private String validation_desc;

    private Integer xml_collection_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getMessage_type_id() {
        return message_type_id;
    }

    public void setMessage_type_id(Integer message_type_id) {
        this.message_type_id = message_type_id;
    }

    public Integer getPrincipal_id() {
        return principal_id;
    }

    public void setPrincipal_id(Integer principal_id) {
        this.principal_id = principal_id;
    }

    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation == null ? null : validation.trim();
    }

    public String getValidation_desc() {
        return validation_desc;
    }

    public void setValidation_desc(String validation_desc) {
        this.validation_desc = validation_desc == null ? null : validation_desc.trim();
    }

    public Integer getXml_collection_id() {
        return xml_collection_id;
    }

    public void setXml_collection_id(Integer xml_collection_id) {
        this.xml_collection_id = xml_collection_id;
    }
}