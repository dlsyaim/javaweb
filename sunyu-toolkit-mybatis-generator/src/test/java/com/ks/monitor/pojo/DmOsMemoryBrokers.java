package com.ks.monitor.pojo;

public class DmOsMemoryBrokers {
    private Integer pool_id;

    private String memory_broker_type;

    private Long allocations_kb;

    private Long allocations_kb_per_sec;

    private Long predicted_allocations_kb;

    private Long target_allocations_kb;

    private Long future_allocations_kb;

    private Long overall_limit_kb;

    private String last_notification;

    public Integer getPool_id() {
        return pool_id;
    }

    public void setPool_id(Integer pool_id) {
        this.pool_id = pool_id;
    }

    public String getMemory_broker_type() {
        return memory_broker_type;
    }

    public void setMemory_broker_type(String memory_broker_type) {
        this.memory_broker_type = memory_broker_type == null ? null : memory_broker_type.trim();
    }

    public Long getAllocations_kb() {
        return allocations_kb;
    }

    public void setAllocations_kb(Long allocations_kb) {
        this.allocations_kb = allocations_kb;
    }

    public Long getAllocations_kb_per_sec() {
        return allocations_kb_per_sec;
    }

    public void setAllocations_kb_per_sec(Long allocations_kb_per_sec) {
        this.allocations_kb_per_sec = allocations_kb_per_sec;
    }

    public Long getPredicted_allocations_kb() {
        return predicted_allocations_kb;
    }

    public void setPredicted_allocations_kb(Long predicted_allocations_kb) {
        this.predicted_allocations_kb = predicted_allocations_kb;
    }

    public Long getTarget_allocations_kb() {
        return target_allocations_kb;
    }

    public void setTarget_allocations_kb(Long target_allocations_kb) {
        this.target_allocations_kb = target_allocations_kb;
    }

    public Long getFuture_allocations_kb() {
        return future_allocations_kb;
    }

    public void setFuture_allocations_kb(Long future_allocations_kb) {
        this.future_allocations_kb = future_allocations_kb;
    }

    public Long getOverall_limit_kb() {
        return overall_limit_kb;
    }

    public void setOverall_limit_kb(Long overall_limit_kb) {
        this.overall_limit_kb = overall_limit_kb;
    }

    public String getLast_notification() {
        return last_notification;
    }

    public void setLast_notification(String last_notification) {
        this.last_notification = last_notification == null ? null : last_notification.trim();
    }
}