package com.ks.monitor.pojo;

public class ServerEventSessionFields {
    private Integer event_session_id;

    private Integer object_id;

    private String name;

    private String value;

    public Integer getEvent_session_id() {
        return event_session_id;
    }

    public void setEvent_session_id(Integer event_session_id) {
        this.event_session_id = event_session_id;
    }

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}