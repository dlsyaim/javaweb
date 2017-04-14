package com.ks.monitor.pojo;

import java.util.Date;

public class DmResourceGovernorWorkloadGroups {
    private Integer group_id;

    private String name;

    private Integer pool_id;

    private Date statistics_start_time;

    private Long total_request_count;

    private Long total_queued_request_count;

    private Integer active_request_count;

    private Integer queued_request_count;

    private Long total_cpu_limit_violation_count;

    private Long total_cpu_usage_ms;

    private Long max_request_cpu_time_ms;

    private Integer blocked_task_count;

    private Long total_lock_wait_count;

    private Long total_lock_wait_time_ms;

    private Long total_query_optimization_count;

    private Long total_suboptimal_plan_generation_count;

    private Long total_reduced_memgrant_count;

    private Long max_request_grant_memory_kb;

    private Long active_parallel_thread_count;

    private String importance;

    private Integer request_max_memory_grant_percent;

    private Integer request_max_cpu_time_sec;

    private Integer request_memory_grant_timeout_sec;

    private Integer group_max_requests;

    private Integer max_dop;

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

    public Integer getPool_id() {
        return pool_id;
    }

    public void setPool_id(Integer pool_id) {
        this.pool_id = pool_id;
    }

    public Date getStatistics_start_time() {
        return statistics_start_time;
    }

    public void setStatistics_start_time(Date statistics_start_time) {
        this.statistics_start_time = statistics_start_time;
    }

    public Long getTotal_request_count() {
        return total_request_count;
    }

    public void setTotal_request_count(Long total_request_count) {
        this.total_request_count = total_request_count;
    }

    public Long getTotal_queued_request_count() {
        return total_queued_request_count;
    }

    public void setTotal_queued_request_count(Long total_queued_request_count) {
        this.total_queued_request_count = total_queued_request_count;
    }

    public Integer getActive_request_count() {
        return active_request_count;
    }

    public void setActive_request_count(Integer active_request_count) {
        this.active_request_count = active_request_count;
    }

    public Integer getQueued_request_count() {
        return queued_request_count;
    }

    public void setQueued_request_count(Integer queued_request_count) {
        this.queued_request_count = queued_request_count;
    }

    public Long getTotal_cpu_limit_violation_count() {
        return total_cpu_limit_violation_count;
    }

    public void setTotal_cpu_limit_violation_count(Long total_cpu_limit_violation_count) {
        this.total_cpu_limit_violation_count = total_cpu_limit_violation_count;
    }

    public Long getTotal_cpu_usage_ms() {
        return total_cpu_usage_ms;
    }

    public void setTotal_cpu_usage_ms(Long total_cpu_usage_ms) {
        this.total_cpu_usage_ms = total_cpu_usage_ms;
    }

    public Long getMax_request_cpu_time_ms() {
        return max_request_cpu_time_ms;
    }

    public void setMax_request_cpu_time_ms(Long max_request_cpu_time_ms) {
        this.max_request_cpu_time_ms = max_request_cpu_time_ms;
    }

    public Integer getBlocked_task_count() {
        return blocked_task_count;
    }

    public void setBlocked_task_count(Integer blocked_task_count) {
        this.blocked_task_count = blocked_task_count;
    }

    public Long getTotal_lock_wait_count() {
        return total_lock_wait_count;
    }

    public void setTotal_lock_wait_count(Long total_lock_wait_count) {
        this.total_lock_wait_count = total_lock_wait_count;
    }

    public Long getTotal_lock_wait_time_ms() {
        return total_lock_wait_time_ms;
    }

    public void setTotal_lock_wait_time_ms(Long total_lock_wait_time_ms) {
        this.total_lock_wait_time_ms = total_lock_wait_time_ms;
    }

    public Long getTotal_query_optimization_count() {
        return total_query_optimization_count;
    }

    public void setTotal_query_optimization_count(Long total_query_optimization_count) {
        this.total_query_optimization_count = total_query_optimization_count;
    }

    public Long getTotal_suboptimal_plan_generation_count() {
        return total_suboptimal_plan_generation_count;
    }

    public void setTotal_suboptimal_plan_generation_count(Long total_suboptimal_plan_generation_count) {
        this.total_suboptimal_plan_generation_count = total_suboptimal_plan_generation_count;
    }

    public Long getTotal_reduced_memgrant_count() {
        return total_reduced_memgrant_count;
    }

    public void setTotal_reduced_memgrant_count(Long total_reduced_memgrant_count) {
        this.total_reduced_memgrant_count = total_reduced_memgrant_count;
    }

    public Long getMax_request_grant_memory_kb() {
        return max_request_grant_memory_kb;
    }

    public void setMax_request_grant_memory_kb(Long max_request_grant_memory_kb) {
        this.max_request_grant_memory_kb = max_request_grant_memory_kb;
    }

    public Long getActive_parallel_thread_count() {
        return active_parallel_thread_count;
    }

    public void setActive_parallel_thread_count(Long active_parallel_thread_count) {
        this.active_parallel_thread_count = active_parallel_thread_count;
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

    public Integer getGroup_max_requests() {
        return group_max_requests;
    }

    public void setGroup_max_requests(Integer group_max_requests) {
        this.group_max_requests = group_max_requests;
    }

    public Integer getMax_dop() {
        return max_dop;
    }

    public void setMax_dop(Integer max_dop) {
        this.max_dop = max_dop;
    }
}