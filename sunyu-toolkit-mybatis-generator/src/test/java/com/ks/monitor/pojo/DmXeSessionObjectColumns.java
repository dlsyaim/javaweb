package com.ks.monitor.pojo;

public class DmXeSessionObjectColumns {
    private String column_name;

    private Integer column_id;

    private String column_value;

    private String object_type;

    private String object_name;

    private String object_package_guid;

    private byte[] event_session_address;

    public String getColumn_name() {
        return column_name;
    }

    public void setColumn_name(String column_name) {
        this.column_name = column_name == null ? null : column_name.trim();
    }

    public Integer getColumn_id() {
        return column_id;
    }

    public void setColumn_id(Integer column_id) {
        this.column_id = column_id;
    }

    public String getColumn_value() {
        return column_value;
    }

    public void setColumn_value(String column_value) {
        this.column_value = column_value == null ? null : column_value.trim();
    }

    public String getObject_type() {
        return object_type;
    }

    public void setObject_type(String object_type) {
        this.object_type = object_type == null ? null : object_type.trim();
    }

    public String getObject_name() {
        return object_name;
    }

    public void setObject_name(String object_name) {
        this.object_name = object_name == null ? null : object_name.trim();
    }

    public String getObject_package_guid() {
        return object_package_guid;
    }

    public void setObject_package_guid(String object_package_guid) {
        this.object_package_guid = object_package_guid == null ? null : object_package_guid.trim();
    }

    public byte[] getEvent_session_address() {
        return event_session_address;
    }

    public void setEvent_session_address(byte[] event_session_address) {
        this.event_session_address = event_session_address;
    }
}