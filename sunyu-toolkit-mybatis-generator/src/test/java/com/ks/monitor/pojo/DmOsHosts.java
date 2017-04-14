package com.ks.monitor.pojo;

public class DmOsHosts {
    private String type;

    private String name;

    private Integer enqueued_tasks_count;

    private Integer active_tasks_count;

    private Integer completed_ios_count;

    private Long completed_ios_in_bytes;

    private Integer active_ios_count;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getEnqueued_tasks_count() {
        return enqueued_tasks_count;
    }

    public void setEnqueued_tasks_count(Integer enqueued_tasks_count) {
        this.enqueued_tasks_count = enqueued_tasks_count;
    }

    public Integer getActive_tasks_count() {
        return active_tasks_count;
    }

    public void setActive_tasks_count(Integer active_tasks_count) {
        this.active_tasks_count = active_tasks_count;
    }

    public Integer getCompleted_ios_count() {
        return completed_ios_count;
    }

    public void setCompleted_ios_count(Integer completed_ios_count) {
        this.completed_ios_count = completed_ios_count;
    }

    public Long getCompleted_ios_in_bytes() {
        return completed_ios_in_bytes;
    }

    public void setCompleted_ios_in_bytes(Long completed_ios_in_bytes) {
        this.completed_ios_in_bytes = completed_ios_in_bytes;
    }

    public Integer getActive_ios_count() {
        return active_ios_count;
    }

    public void setActive_ios_count(Integer active_ios_count) {
        this.active_ios_count = active_ios_count;
    }
}