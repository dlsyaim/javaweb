package com.ks.monitor.pojo;

import java.util.Date;

public class XmlSchemaCollections {
    private Integer xml_collection_id;

    private Integer schema_id;

    private Integer principal_id;

    private String name;

    private Date create_date;

    private Date modify_date;

    public Integer getXml_collection_id() {
        return xml_collection_id;
    }

    public void setXml_collection_id(Integer xml_collection_id) {
        this.xml_collection_id = xml_collection_id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getModify_date() {
        return modify_date;
    }

    public void setModify_date(Date modify_date) {
        this.modify_date = modify_date;
    }
}