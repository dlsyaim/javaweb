package com.ks.monitor.pojo;

public class Events {
    private Integer object_id;

    private Integer type;

    private String type_desc;

    private Boolean is_trigger_event;

    private Integer event_group_type;

    private String event_group_type_desc;

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getType_desc() {
        return type_desc;
    }

    public void setType_desc(String type_desc) {
        this.type_desc = type_desc == null ? null : type_desc.trim();
    }

    public Boolean getIs_trigger_event() {
        return is_trigger_event;
    }

    public void setIs_trigger_event(Boolean is_trigger_event) {
        this.is_trigger_event = is_trigger_event;
    }

    public Integer getEvent_group_type() {
        return event_group_type;
    }

    public void setEvent_group_type(Integer event_group_type) {
        this.event_group_type = event_group_type;
    }

    public String getEvent_group_type_desc() {
        return event_group_type_desc;
    }

    public void setEvent_group_type_desc(String event_group_type_desc) {
        this.event_group_type_desc = event_group_type_desc == null ? null : event_group_type_desc.trim();
    }
}