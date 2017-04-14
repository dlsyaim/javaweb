package com.ks.monitor.pojo;

import java.util.Date;

public class ServerTriggers {
    private String name;

    private Integer object_id;

    private Byte parent_class;

    private String parent_class_desc;

    private Integer parent_id;

    private String type;

    private String type_desc;

    private Date create_date;

    private Date modify_date;

    private Boolean is_ms_shipped;

    private Boolean is_disabled;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public Byte getParent_class() {
        return parent_class;
    }

    public void setParent_class(Byte parent_class) {
        this.parent_class = parent_class;
    }

    public String getParent_class_desc() {
        return parent_class_desc;
    }

    public void setParent_class_desc(String parent_class_desc) {
        this.parent_class_desc = parent_class_desc == null ? null : parent_class_desc.trim();
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getType_desc() {
        return type_desc;
    }

    public void setType_desc(String type_desc) {
        this.type_desc = type_desc == null ? null : type_desc.trim();
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

    public Boolean getIs_ms_shipped() {
        return is_ms_shipped;
    }

    public void setIs_ms_shipped(Boolean is_ms_shipped) {
        this.is_ms_shipped = is_ms_shipped;
    }

    public Boolean getIs_disabled() {
        return is_disabled;
    }

    public void setIs_disabled(Boolean is_disabled) {
        this.is_disabled = is_disabled;
    }
}