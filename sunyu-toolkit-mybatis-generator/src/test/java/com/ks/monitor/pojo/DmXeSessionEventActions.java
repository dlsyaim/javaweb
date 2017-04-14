package com.ks.monitor.pojo;

public class DmXeSessionEventActions {
    private String action_name;

    private String action_package_guid;

    private String event_name;

    private String event_package_guid;

    private byte[] event_session_address;

    public String getAction_name() {
        return action_name;
    }

    public void setAction_name(String action_name) {
        this.action_name = action_name == null ? null : action_name.trim();
    }

    public String getAction_package_guid() {
        return action_package_guid;
    }

    public void setAction_package_guid(String action_package_guid) {
        this.action_package_guid = action_package_guid == null ? null : action_package_guid.trim();
    }

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

    public byte[] getEvent_session_address() {
        return event_session_address;
    }

    public void setEvent_session_address(byte[] event_session_address) {
        this.event_session_address = event_session_address;
    }
}