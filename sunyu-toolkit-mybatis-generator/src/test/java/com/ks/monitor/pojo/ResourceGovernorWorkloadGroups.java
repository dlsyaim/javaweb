package com.ks.monitor.pojo;

public class ResourceGovernorWorkloadGroups {
    private Integer group_id;

    private String name;

    private String importance;

    private Integer request_max_memory_grant_percent;

    private Integer request_max_cpu_time_sec;

    private Integer request_memory_grant_timeout_sec;

    private Integer max_dop;

    private Integer group_max_requests;

    private Integer pool_id;

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance == null ? null : importance.trim();
    }

    public Integer getRequest_max_memory_grant_percent() {
        return request_max_memory_grant_percent;
    }

    public void setRequest_max_memory_grant_percent(Integer request_max_memory_grant_percent) {
        this.request_max_memory_grant_percent = request_max_memory_grant_percent;
    }

    public Integer getRequest_max_cpu_time_sec() {
        return request_max_cpu_time_sec;
    }

    public void setRequest_max_cpu_time_sec(Integer request_max_cpu_time_sec) {
        this.request_max_cpu_time_sec = request_max_cpu_time_sec;
    }

    public Integer getRequest_memory_grant_timeout_sec() {
        return request_memory_grant_timeout_sec;
    }

    public void setRequest_memory_grant_timeout_sec(Integer request_memory_grant_timeout_sec) {
        this.request_memory_grant_timeout_sec = request_memory_grant_timeout_sec;
    }

    public Integer getMax_dop() {
        return max_dop;
    }

    public void setMax_dop(Integer max_dop) {
        this.max_dop = max_dop;
    }

    public Integer getGroup_max_requests() {
        return group_max_requests;
    }

    public void setGroup_max_requests(Integer group_max_requests) {
        this.group_max_requests = group_max_requests;
    }

    public Integer getPool_id() {
        return pool_id;
    }

    public void setPool_id(Integer pool_id) {
        this.pool_id = pool_id;
    }
}