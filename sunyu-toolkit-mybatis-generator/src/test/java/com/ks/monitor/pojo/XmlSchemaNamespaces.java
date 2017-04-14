package com.ks.monitor.pojo;

public class XmlSchemaNamespaces {
    private Integer xml_collection_id;

    private String name;

    private Integer xml_namespace_id;

    public Integer getXml_collection_id() {
        return xml_collection_id;
    }

    public void setXml_collection_id(Integer xml_collection_id) {
        this.xml_collection_id = xml_collection_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getXml_namespace_id() {
        return xml_namespace_id;
    }

    public void setXml_namespace_id(Integer xml_namespace_id) {
        this.xml_namespace_id = xml_namespace_id;
    }
}