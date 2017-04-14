package com.ks.monitor.pojo;

import java.util.Date;

public class EventNotifications {
    private String name;

    private Integer object_id;

    private Byte parent_class;

    private String parent_class_desc;

    private Integer parent_id;

    private Date create_date;

    private Date modify_date;

    private String service_name;

    private String broker_instance;

    private Integer principal_id;

    private byte[] creator_sid;

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

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name == null ? null : service_name.trim();
    }

    public String getBroker_instance() {
        return broker_instance;
    }

    public void setBroker_instance(String broker_instance) {
        this.broker_instance = broker_instance == null ? null : broker_instance.trim();
    }

    public Integer getPrincipal_id() {
        return principal_id;
    }

    public void setPrincipal_id(Integer principal_id) {
        this.principal_id = principal_id;
    }

    public byte[] getCreator_sid() {
        return creator_sid;
    }

    public void setCreator_sid(byte[] creator_sid) {
        this.creator_sid = creator_sid;
    }
}