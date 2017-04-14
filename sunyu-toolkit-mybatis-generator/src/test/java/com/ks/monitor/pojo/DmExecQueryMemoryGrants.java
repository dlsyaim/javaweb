package com.ks.monitor.pojo;

import java.util.Date;

public class DmExecQueryMemoryGrants {
    private Short session_id;

    private Integer request_id;

    private Integer scheduler_id;

    private Short dop;

    private Date request_time;

    private Date grant_time;

    private Long requested_memory_kb;

    private Long granted_memory_kb;

    private Long required_memory_kb;

    private Long used_memory_kb;

    private Long max_used_memory_kb;

    private Double query_cost;

    private Integer timeout_sec;

    private Short resource_semaphore_id;

    private Short queue_id;

    private Integer wait_order;

    private Boolean is_next_candidate;

    private Long wait_time_ms;

    private Integer group_id;

    private Integer pool_id;

    private Boolean is_small;

    private Long ideal_memory_kb;

    public Short getSession_id() {
        return session_id;
    }

    public void setSession_id(Short session_id) {
        this.session_id = session_id;
    }

    public Integer getRequest_id() {
        return request_id;
    }

    public void setRequest_id(Integer request_id) {
        this.request_id = request_id;
    }

    public Integer getScheduler_id() {
        return scheduler_id;
    }

    public void setScheduler_id(Integer scheduler_id) {
        this.scheduler_id = scheduler_id;
    }

    public Short getDop() {
        return dop;
    }

    public void setDop(Short dop) {
        this.dop = dop;
    }

    public Date getRequest_time() {
        return request_time;
    }

    public void setRequest_time(Date request_time) {
        this.request_time = request_time;
    }

    public Date getGrant_time() {
        return grant_time;
    }

    public void setGrant_time(Date grant_time) {
        this.grant_time = grant_time;
    }

    public Long getRequested_memory_kb() {
        return requested_memory_kb;
    }

    public void setRequested_memory_kb(Long requested_memory_kb) {
        this.requested_memory_kb = requested_memory_kb;
    }

    public Long getGranted_memory_kb() {
        return granted_memory_kb;
    }

    public void setGranted_memory_kb(Long granted_memory_kb) {
        this.granted_memory_kb = granted_memory_kb;
    }

    public Long getRequired_memory_kb() {
        return required_memory_kb;
    }

    public void setRequired_memory_kb(Long required_memory_kb) {
        this.required_memory_kb = required_memory_kb;
    }

    public Long getUsed_memory_kb() {
        return used_memory_kb;
    }

    public void setUsed_memory_kb(Long used_memory_kb) {
        this.used_memory_kb = used_memory_kb;
    }

    public Long getMax_used_memory_kb() {
        return max_used_memory_kb;
    }

    public void setMax_used_memory_kb(Long max_used_memory_kb) {
        this.max_used_memory_kb = max_used_memory_kb;
    }

    public Double getQuery_cost() {
        return query_cost;
    }

    public void setQuery_cost(Double query_cost) {
        this.query_cost = query_cost;
    }

    public Integer getTimeout_sec() {
        return timeout_sec;
    }

    public void setTimeout_sec(Integer timeout_sec) {
        this.timeout_sec = timeout_sec;
    }

    public Short getResource_semaphore_id() {
        return resource_semaphore_id;
    }

    public void setResource_semaphore_id(Short resource_semaphore_id) {
        this.resource_semaphore_id = resource_semaphore_id;
    }

    public Short getQueue_id() {
        return queue_id;
    }

    public void setQueue_id(Short queue_id) {
        this.queue_id = queue_id;
    }

    public Integer getWait_order() {
        return wait_order;
    }

    public void setWait_order(Integer wait_order) {
        this.wait_order = wait_order;
    }

    public Boolean getIs_next_candidate() {
        return is_next_candidate;
    }

    public void setIs_next_candidate(Boolean is_next_candidate) {
        this.is_next_candidate = is_next_candidate;
    }

    public Long getWait_time_ms() {
        return wait_time_ms;
    }

    public void setWait_time_ms(Long wait_time_ms) {
        this.wait_time_ms = wait_time_ms;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    public Integer getPool_id() {
        return pool_id;
    }

    public void setPool_id(Integer pool_id) {
        this.pool_id = pool_id;
    }

    public Boolean getIs_small() {
        return is_small;
    }

    public void setIs_small(Boolean is_small) {
        this.is_small = is_small;
    }

    public Long getIdeal_memory_kb() {
        return ideal_memory_kb;
    }

    public void setIdeal_memory_kb(Long ideal_memory_kb) {
        this.ideal_memory_kb = ideal_memory_kb;
    }
}