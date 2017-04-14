package com.ks.monitor.pojo;

import java.util.Date;

public class DmOsThreads {
    private Boolean started_by_sqlservr;

    private Integer os_thread_id;

    private Integer status;

    private Date creation_time;

    private Long kernel_time;

    private Long usermode_time;

    private Integer stack_bytes_committed;

    private Integer stack_bytes_used;

    private Long affinity;

    private Integer priority;

    private Integer locale;

    private Integer is_impersonating;

    private Integer is_waiting_on_loader_lock;

    private Short processor_group;

    public Boolean getStarted_by_sqlservr() {
        return started_by_sqlservr;
    }

    public void setStarted_by_sqlservr(Boolean started_by_sqlservr) {
        this.started_by_sqlservr = started_by_sqlservr;
    }

    public Integer getOs_thread_id() {
        return os_thread_id;
    }

    public void setOs_thread_id(Integer os_thread_id) {
        this.os_thread_id = os_thread_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }

    public Long getKernel_time() {
        return kernel_time;
    }

    public void setKernel_time(Long kernel_time) {
        this.kernel_time = kernel_time;
    }

    public Long getUsermode_time() {
        return usermode_time;
    }

    public void setUsermode_time(Long usermode_time) {
        this.usermode_time = usermode_time;
    }

    public Integer getStack_bytes_committed() {
        return stack_bytes_committed;
    }

    public void setStack_bytes_committed(Integer stack_bytes_committed) {
        this.stack_bytes_committed = stack_bytes_committed;
    }

    public Integer getStack_bytes_used() {
        return stack_bytes_used;
    }

    public void setStack_bytes_used(Integer stack_bytes_used) {
        this.stack_bytes_used = stack_bytes_used;
    }

    public Long getAffinity() {
        return affinity;
    }

    public void setAffinity(Long affinity) {
        this.affinity = affinity;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getLocale() {
        return locale;
    }

    public void setLocale(Integer locale) {
        this.locale = locale;
    }

    public Integer getIs_impersonating() {
        return is_impersonating;
    }

    public void setIs_impersonating(Integer is_impersonating) {
        this.is_impersonating = is_impersonating;
    }

    public Integer getIs_waiting_on_loader_lock() {
        return is_waiting_on_loader_lock;
    }

    public void setIs_waiting_on_loader_lock(Integer is_waiting_on_loader_lock) {
        this.is_waiting_on_loader_lock = is_waiting_on_loader_lock;
    }

    public Short getProcessor_group() {
        return processor_group;
    }

    public void setProcessor_group(Short processor_group) {
        this.processor_group = processor_group;
    }
}