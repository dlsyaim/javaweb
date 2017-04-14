package com.ks.monitor.pojo;

public class DmOsSchedulers {
    private Integer parent_node_id;

    private Integer scheduler_id;

    private Integer cpu_id;

    private String status;

    private Boolean is_online;

    private Boolean is_idle;

    private Integer preemptive_switches_count;

    private Integer context_switches_count;

    private Integer idle_switches_count;

    private Integer current_tasks_count;

    private Integer runnable_tasks_count;

    private Integer current_workers_count;

    private Integer active_workers_count;

    private Long work_queue_count;

    private Integer pending_disk_io_count;

    private Integer load_factor;

    private Integer yield_count;

    private Long last_timer_activity;

    private Boolean failed_to_create_worker;

    private Long quantum_length_us;

    public Integer getParent_node_id() {
        return parent_node_id;
    }

    public void setParent_node_id(Integer parent_node_id) {
        this.parent_node_id = parent_node_id;
    }

    public Integer getScheduler_id() {
        return scheduler_id;
    }

    public void setScheduler_id(Integer scheduler_id) {
        this.scheduler_id = scheduler_id;
    }

    public Integer getCpu_id() {
        return cpu_id;
    }

    public void setCpu_id(Integer cpu_id) {
        this.cpu_id = cpu_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Boolean getIs_online() {
        return is_online;
    }

    public void setIs_online(Boolean is_online) {
        this.is_online = is_online;
    }

    public Boolean getIs_idle() {
        return is_idle;
    }

    public void setIs_idle(Boolean is_idle) {
        this.is_idle = is_idle;
    }

    public Integer getPreemptive_switches_count() {
        return preemptive_switches_count;
    }

    public void setPreemptive_switches_count(Integer preemptive_switches_count) {
        this.preemptive_switches_count = preemptive_switches_count;
    }

    public Integer getContext_switches_count() {
        return context_switches_count;
    }

    public void setContext_switches_count(Integer context_switches_count) {
        this.context_switches_count = context_switches_count;
    }

    public Integer getIdle_switches_count() {
        return idle_switches_count;
    }

    public void setIdle_switches_count(Integer idle_switches_count) {
        this.idle_switches_count = idle_switches_count;
    }

    public Integer getCurrent_tasks_count() {
        return current_tasks_count;
    }

    public void setCurrent_tasks_count(Integer current_tasks_count) {
        this.current_tasks_count = current_tasks_count;
    }

    public Integer getRunnable_tasks_count() {
        return runnable_tasks_count;
    }

    public void setRunnable_tasks_count(Integer runnable_tasks_count) {
        this.runnable_tasks_count = runnable_tasks_count;
    }

    public Integer getCurrent_workers_count() {
        return current_workers_count;
    }

    public void setCurrent_workers_count(Integer current_workers_count) {
        this.current_workers_count = current_workers_count;
    }

    public Integer getActive_workers_count() {
        return active_workers_count;
    }

    public void setActive_workers_count(Integer active_workers_count) {
        this.active_workers_count = active_workers_count;
    }

    public Long getWork_queue_count() {
        return work_queue_count;
    }

    public void setWork_queue_count(Long work_queue_count) {
        this.work_queue_count = work_queue_count;
    }

    public Integer getPending_disk_io_count() {
        return pending_disk_io_count;
    }

    public void setPending_disk_io_count(Integer pending_disk_io_count) {
        this.pending_disk_io_count = pending_disk_io_count;
    }

    public Integer getLoad_factor() {
        return load_factor;
    }

    public void setLoad_factor(Integer load_factor) {
        this.load_factor = load_factor;
    }

    public Integer getYield_count() {
        return yield_count;
    }

    public void setYield_count(Integer yield_count) {
        this.yield_count = yield_count;
    }

    public Long getLast_timer_activity() {
        return last_timer_activity;
    }

    public void setLast_timer_activity(Long last_timer_activity) {
        this.last_timer_activity = last_timer_activity;
    }

    public Boolean getFailed_to_create_worker() {
        return failed_to_create_worker;
    }

    public void setFailed_to_create_worker(Boolean failed_to_create_worker) {
        this.failed_to_create_worker = failed_to_create_worker;
    }

    public Long getQuantum_length_us() {
        return quantum_length_us;
    }

    public void setQuantum_length_us(Long quantum_length_us) {
        this.quantum_length_us = quantum_length_us;
    }
}