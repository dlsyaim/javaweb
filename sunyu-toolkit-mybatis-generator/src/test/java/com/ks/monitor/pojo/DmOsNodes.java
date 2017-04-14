package com.ks.monitor.pojo;

public class DmOsNodes {
    private Short node_id;

    private String node_state_desc;

    private Short memory_node_id;

    private Long cpu_affinity_mask;

    private Short online_scheduler_count;

    private Short idle_scheduler_count;

    private Integer active_worker_count;

    private Integer avg_load_balance;

    private Long timer_task_affinity_mask;

    private Long permanent_task_affinity_mask;

    private Boolean resource_monitor_state;

    private Long online_scheduler_mask;

    private Short processor_group;

    public Short getNode_id() {
        return node_id;
    }

    public void setNode_id(Short node_id) {
        this.node_id = node_id;
    }

    public String getNode_state_desc() {
        return node_state_desc;
    }

    public void setNode_state_desc(String node_state_desc) {
        this.node_state_desc = node_state_desc == null ? null : node_state_desc.trim();
    }

    public Short getMemory_node_id() {
        return memory_node_id;
    }

    public void setMemory_node_id(Short memory_node_id) {
        this.memory_node_id = memory_node_id;
    }

    public Long getCpu_affinity_mask() {
        return cpu_affinity_mask;
    }

    public void setCpu_affinity_mask(Long cpu_affinity_mask) {
        this.cpu_affinity_mask = cpu_affinity_mask;
    }

    public Short getOnline_scheduler_count() {
        return online_scheduler_count;
    }

    public void setOnline_scheduler_count(Short online_scheduler_count) {
        this.online_scheduler_count = online_scheduler_count;
    }

    public Short getIdle_scheduler_count() {
        return idle_scheduler_count;
    }

    public void setIdle_scheduler_count(Short idle_scheduler_count) {
        this.idle_scheduler_count = idle_scheduler_count;
    }

    public Integer getActive_worker_count() {
        return active_worker_count;
    }

    public void setActive_worker_count(Integer active_worker_count) {
        this.active_worker_count = active_worker_count;
    }

    public Integer getAvg_load_balance() {
        return avg_load_balance;
    }

    public void setAvg_load_balance(Integer avg_load_balance) {
        this.avg_load_balance = avg_load_balance;
    }

    public Long getTimer_task_affinity_mask() {
        return timer_task_affinity_mask;
    }

    public void setTimer_task_affinity_mask(Long timer_task_affinity_mask) {
        this.timer_task_affinity_mask = timer_task_affinity_mask;
    }

    public Long getPermanent_task_affinity_mask() {
        return permanent_task_affinity_mask;
    }

    public void setPermanent_task_affinity_mask(Long permanent_task_affinity_mask) {
        this.permanent_task_affinity_mask = permanent_task_affinity_mask;
    }

    public Boolean getResource_monitor_state() {
        return resource_monitor_state;
    }

    public void setResource_monitor_state(Boolean resource_monitor_state) {
        this.resource_monitor_state = resource_monitor_state;
    }

    public Long getOnline_scheduler_mask() {
        return online_scheduler_mask;
    }

    public void setOnline_scheduler_mask(Long online_scheduler_mask) {
        this.online_scheduler_mask = online_scheduler_mask;
    }

    public Short getProcessor_group() {
        return processor_group;
    }

    public void setProcessor_group(Short processor_group) {
        this.processor_group = processor_group;
    }
}