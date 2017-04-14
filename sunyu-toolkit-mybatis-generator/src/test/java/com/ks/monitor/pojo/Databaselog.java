package com.ks.monitor.pojo;

import java.util.Date;

public class Databaselog {
    private Integer databaseLogID;

    private Date postTime;

    private String databaseUser;

    private String event;

    private String schema;

    private String object;

    public Integer getDatabaseLogID() {
        return databaseLogID;
    }

    public void setDatabaseLogID(Integer databaseLogID) {
        this.databaseLogID = databaseLogID;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public String getDatabaseUser() {
        return databaseUser;
    }

    public void setDatabaseUser(String databaseUser) {
        this.databaseUser = databaseUser == null ? null : databaseUser.trim();
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event == null ? null : event.trim();
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema == null ? null : schema.trim();
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object == null ? null : object.trim();
    }
}