package com.ks.monitor.pojo;

import java.util.Date;

public class Openkeys {
    private Integer database_id;

    private String database_name;

    private Integer key_id;

    private String key_name;

    private String key_guid;

    private Date opened_date;

    private Short status;

    public Integer getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Integer database_id) {
        this.database_id = database_id;
    }

    public String getDatabase_name() {
        return database_name;
    }

    public void setDatabase_name(String database_name) {
        this.database_name = database_name == null ? null : database_name.trim();
    }

    public Integer getKey_id() {
        return key_id;
    }

    public void setKey_id(Integer key_id) {
        this.key_id = key_id;
    }

    public String getKey_name() {
        return key_name;
    }

    public void setKey_name(String key_name) {
        this.key_name = key_name == null ? null : key_name.trim();
    }

    public String getKey_guid() {
        return key_guid;
    }

    public void setKey_guid(String key_guid) {
        this.key_guid = key_guid == null ? null : key_guid.trim();
    }

    public Date getOpened_date() {
        return opened_date;
    }

    public void setOpened_date(Date opened_date) {
        this.opened_date = opened_date;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}