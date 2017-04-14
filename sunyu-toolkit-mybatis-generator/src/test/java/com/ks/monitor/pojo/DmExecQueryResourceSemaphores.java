package com.ks.monitor.pojo;

public class DmExecQueryResourceSemaphores {
    private Short resource_semaphore_id;

    private Long target_memory_kb;

    private Long max_target_memory_kb;

    private Long total_memory_kb;

    private Long available_memory_kb;

    private Long granted_memory_kb;

    private Long used_memory_kb;

    private Integer grantee_count;

    private Integer waiter_count;

    private Long timeout_error_count;

    private Long forced_grant_count;

    private Integer pool_id;

    public Short getResource_semaphore_id() {
        return resource_semaphore_id;
    }

    public void setResource_semaphore_id(Short resource_semaphore_id) {
        this.resource_semaphore_id = resource_semaphore_id;
    }

    public Long getTarget_memory_kb() {
        return target_memory_kb;
    }

    public void setTarget_memory_kb(Long target_memory_kb) {
        this.target_memory_kb = target_memory_kb;
    }

    public Long getMax_target_memory_kb() {
        return max_target_memory_kb;
    }

    public void setMax_target_memory_kb(Long max_target_memory_kb) {
        this.max_target_memory_kb = max_target_memory_kb;
    }

    public Long getTotal_memory_kb() {
        return total_memory_kb;
    }

    public void setTotal_memory_kb(Long total_memory_kb) {
        this.total_memory_kb = total_memory_kb;
    }

    public Long getAvailable_memory_kb() {
        return available_memory_kb;
    }

    public void setAvailable_memory_kb(Long available_memory_kb) {
        this.available_memory_kb = available_memory_kb;
    }

    public Long getGranted_memory_kb() {
        return granted_memory_kb;
    }

    public void setGranted_memory_kb(Long granted_memory_kb) {
        this.granted_memory_kb = granted_memory_kb;
    }

    public Long getUsed_memory_kb() {
        return used_memory_kb;
    }

    public void setUsed_memory_kb(Long used_memory_kb) {
        this.used_memory_kb = used_memory_kb;
    }

    public Integer getGrantee_count() {
        return grantee_count;
    }

    public void setGrantee_count(Integer grantee_count) {
        this.grantee_count = grantee_count;
    }

    public Integer getWaiter_count() {
        return waiter_count;
    }

    public void setWaiter_count(Integer waiter_count) {
        this.waiter_count = waiter_count;
    }

    public Long getTimeout_error_count() {
        return timeout_error_count;
    }

    public void setTimeout_error_count(Long timeout_error_count) {
        this.timeout_error_count = timeout_error_count;
    }

    public Long getForced_grant_count() {
        return forced_grant_count;
    }

    public void setForced_grant_count(Long forced_grant_count) {
        this.forced_grant_count = forced_grant_count;
    }

    public Integer getPool_id() {
        return pool_id;
    }

    public void setPool_id(Integer pool_id) {
        this.pool_id = pool_id;
    }
}