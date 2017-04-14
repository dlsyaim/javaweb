package com.ks.monitor.pojo;

import java.util.Date;

public class DmOsSysInfo {
    private Long cpu_ticks;

    private Long ms_ticks;

    private Integer cpu_count;

    private Integer hyperthread_ratio;

    private Long physical_memory_in_bytes;

    private Long virtual_memory_in_bytes;

    private Integer bpool_committed;

    private Integer bpool_commit_target;

    private Integer bpool_visible;

    private Integer stack_size_in_bytes;

    private Long os_quantum;

    private Integer os_error_mode;

    private Integer os_priority_class;

    private Integer max_workers_count;

    private Integer scheduler_count;

    private Integer scheduler_total_count;

    private Integer deadlock_monitor_serial_number;

    private Long sqlserver_start_time_ms_ticks;

    private Date sqlserver_start_time;

    private Integer affinity_type;

    private String affinity_type_desc;

    private Long process_kernel_time_ms;

    private Long process_user_time_ms;

    private Integer time_source;

    private String time_source_desc;

    public Long getCpu_ticks() {
        return cpu_ticks;
    }

    public void setCpu_ticks(Long cpu_ticks) {
        this.cpu_ticks = cpu_ticks;
    }

    public Long getMs_ticks() {
        return ms_ticks;
    }

    public void setMs_ticks(Long ms_ticks) {
        this.ms_ticks = ms_ticks;
    }

    public Integer getCpu_count() {
        return cpu_count;
    }

    public void setCpu_count(Integer cpu_count) {
        this.cpu_count = cpu_count;
    }

    public Integer getHyperthread_ratio() {
        return hyperthread_ratio;
    }

    public void setHyperthread_ratio(Integer hyperthread_ratio) {
        this.hyperthread_ratio = hyperthread_ratio;
    }

    public Long getPhysical_memory_in_bytes() {
        return physical_memory_in_bytes;
    }

    public void setPhysical_memory_in_bytes(Long physical_memory_in_bytes) {
        this.physical_memory_in_bytes = physical_memory_in_bytes;
    }

    public Long getVirtual_memory_in_bytes() {
        return virtual_memory_in_bytes;
    }

    public void setVirtual_memory_in_bytes(Long virtual_memory_in_bytes) {
        this.virtual_memory_in_bytes = virtual_memory_in_bytes;
    }

    public Integer getBpool_committed() {
        return bpool_committed;
    }

    public void setBpool_committed(Integer bpool_committed) {
        this.bpool_committed = bpool_committed;
    }

    public Integer getBpool_commit_target() {
        return bpool_commit_target;
    }

    public void setBpool_commit_target(Integer bpool_commit_target) {
        this.bpool_commit_target = bpool_commit_target;
    }

    public Integer getBpool_visible() {
        return bpool_visible;
    }

    public void setBpool_visible(Integer bpool_visible) {
        this.bpool_visible = bpool_visible;
    }

    public Integer getStack_size_in_bytes() {
        return stack_size_in_bytes;
    }

    public void setStack_size_in_bytes(Integer stack_size_in_bytes) {
        this.stack_size_in_bytes = stack_size_in_bytes;
    }

    public Long getOs_quantum() {
        return os_quantum;
    }

    public void setOs_quantum(Long os_quantum) {
        this.os_quantum = os_quantum;
    }

    public Integer getOs_error_mode() {
        return os_error_mode;
    }

    public void setOs_error_mode(Integer os_error_mode) {
        this.os_error_mode = os_error_mode;
    }

    public Integer getOs_priority_class() {
        return os_priority_class;
    }

    public void setOs_priority_class(Integer os_priority_class) {
        this.os_priority_class = os_priority_class;
    }

    public Integer getMax_workers_count() {
        return max_workers_count;
    }

    public void setMax_workers_count(Integer max_workers_count) {
        this.max_workers_count = max_workers_count;
    }

    public Integer getScheduler_count() {
        return scheduler_count;
    }

    public void setScheduler_count(Integer scheduler_count) {
        this.scheduler_count = scheduler_count;
    }

    public Integer getScheduler_total_count() {
        return scheduler_total_count;
    }

    public void setScheduler_total_count(Integer scheduler_total_count) {
        this.scheduler_total_count = scheduler_total_count;
    }

    public Integer getDeadlock_monitor_serial_number() {
        return deadlock_monitor_serial_number;
    }

    public void setDeadlock_monitor_serial_number(Integer deadlock_monitor_serial_number) {
        this.deadlock_monitor_serial_number = deadlock_monitor_serial_number;
    }

    public Long getSqlserver_start_time_ms_ticks() {
        return sqlserver_start_time_ms_ticks;
    }

    public void setSqlserver_start_time_ms_ticks(Long sqlserver_start_time_ms_ticks) {
        this.sqlserver_start_time_ms_ticks = sqlserver_start_time_ms_ticks;
    }

    public Date getSqlserver_start_time() {
        return sqlserver_start_time;
    }

    public void setSqlserver_start_time(Date sqlserver_start_time) {
        this.sqlserver_start_time = sqlserver_start_time;
    }

    public Integer getAffinity_type() {
        return affinity_type;
    }

    public void setAffinity_type(Integer affinity_type) {
        this.affinity_type = affinity_type;
    }

    public String getAffinity_type_desc() {
        return affinity_type_desc;
    }

    public void setAffinity_type_desc(String affinity_type_desc) {
        this.affinity_type_desc = affinity_type_desc == null ? null : affinity_type_desc.trim();
    }

    public Long getProcess_kernel_time_ms() {
        return process_kernel_time_ms;
    }

    public void setProcess_kernel_time_ms(Long process_kernel_time_ms) {
        this.process_kernel_time_ms = process_kernel_time_ms;
    }

    public Long getProcess_user_time_ms() {
        return process_user_time_ms;
    }

    public void setProcess_user_time_ms(Long process_user_time_ms) {
        this.process_user_time_ms = process_user_time_ms;
    }

    public Integer getTime_source() {
        return time_source;
    }

    public void setTime_source(Integer time_source) {
        this.time_source = time_source;
    }

    public String getTime_source_desc() {
        return time_source_desc;
    }

    public void setTime_source_desc(String time_source_desc) {
        this.time_source_desc = time_source_desc == null ? null : time_source_desc.trim();
    }
}