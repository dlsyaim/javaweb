package com.ks.monitor.pojo;

public class TriggerEvents {
    private Integer object_id;

    private Integer type;

    private String type_desc;

    private Boolean is_first;

    private Boolean is_last;

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

    public Boolean getIs_first() {
        return is_first;
    }

    public void setIs_first(Boolean is_first) {
        this.is_first = is_first;
    }

    public Boolean getIs_last() {
        return is_last;
    }

    public void setIs_last(Boolean is_last) {
        this.is_last = is_last;
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