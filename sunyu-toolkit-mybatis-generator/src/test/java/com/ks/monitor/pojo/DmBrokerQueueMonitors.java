package com.ks.monitor.pojo;

import java.util.Date;

public class DmBrokerQueueMonitors {
    private Integer database_id;

    private Integer queue_id;

    private String state;

    private Date last_empty_rowset_time;

    private Date last_activated_time;

    private Integer tasks_waiting;

    public Integer getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Integer database_id) {
        this.database_id = database_id;
    }

    public Integer getQueue_id() {
        return queue_id;
    }

    public void setQueue_id(Integer queue_id) {
        this.queue_id = queue_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getLast_empty_rowset_time() {
        return last_empty_rowset_time;
    }

    public void setLast_empty_rowset_time(Date last_empty_rowset_time) {
        this.last_empty_rowset_time = last_empty_rowset_time;
    }

    public Date getLast_activated_time() {
        return last_activated_time;
    }

    public void setLast_activated_time(Date last_activated_time) {
        this.last_activated_time = last_activated_time;
    }

    public Integer getTasks_waiting() {
        return tasks_waiting;
    }

    public void setTasks_waiting(Integer tasks_waiting) {
        this.tasks_waiting = tasks_waiting;
    }
}