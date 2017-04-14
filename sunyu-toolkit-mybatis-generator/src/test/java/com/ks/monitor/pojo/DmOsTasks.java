package com.ks.monitor.pojo;

public class DmOsTasks {
    private String task_state;

    private Integer context_switches_count;

    private Integer pending_io_count;

    private Long pending_io_byte_count;

    private Integer pending_io_byte_average;

    private Integer scheduler_id;

    private Short session_id;

    private Integer exec_context_id;

    private Integer request_id;

    public String getTask_state() {
        return task_state;
    }

    public void setTask_state(String task_state) {
        this.task_state = task_state == null ? null : task_state.trim();
    }

    public Integer getContext_switches_count() {
        return context_switches_count;
    }

    public void setContext_switches_count(Integer context_switches_count) {
        this.context_switches_count = context_switches_count;
    }

    public Integer getPending_io_count() {
        return pending_io_count;
    }

    public void setPending_io_count(Integer pending_io_count) {
        this.pending_io_count = pending_io_count;
    }

    public Long getPending_io_byte_count() {
        return pending_io_byte_count;
    }

    public void setPending_io_byte_count(Long pending_io_byte_count) {
        this.pending_io_byte_count = pending_io_byte_count;
    }

    public Integer getPending_io_byte_average() {
        return pending_io_byte_average;
    }

    public void setPending_io_byte_average(Integer pending_io_byte_average) {
        this.pending_io_byte_average = pending_io_byte_average;
    }

    public Integer getScheduler_id() {
        return scheduler_id;
    }

    public void setScheduler_id(Integer scheduler_id) {
        this.scheduler_id = scheduler_id;
    }

    public Short getSession_id() {
        return session_id;
    }

    public void setSession_id(Short session_id) {
        this.session_id = session_id;
    }

    public Integer getExec_context_id() {
        return exec_context_id;
    }

    public void setExec_context_id(Integer exec_context_id) {
        this.exec_context_id = exec_context_id;
    }

    public Integer getRequest_id() {
        return request_id;
    }

    public void setRequest_id(Integer request_id) {
        this.request_id = request_id;
    }
}