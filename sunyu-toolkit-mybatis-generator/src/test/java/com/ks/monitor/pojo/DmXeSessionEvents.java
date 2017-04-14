package com.ks.monitor.pojo;

public class DmXeSessionEvents {
    private String event_name;

    private String event_package_guid;

    private String event_predicate;

    private byte[] event_session_address;

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name == null ? null : event_name.trim();
    }

    public String getEvent_package_guid() {
        return event_package_guid;
    }

    public void setEvent_package_guid(String event_package_guid) {
        this.event_package_guid = event_package_guid == null ? null : event_package_guid.trim();
    }

    public String getEvent_predicate() {
        return event_predicate;
    }

    public void setEvent_predicate(String event_predicate) {
        this.event_predicate = event_predicate == null ? null : event_predicate.trim();
    }

    public byte[] getEvent_session_address() {
        return event_session_address;
    }

    public void setEvent_session_address(byte[] event_session_address) {
        this.event_session_address = event_session_address;
    }
}