package com.ks.monitor.pojo;

public class DmOsWaitingTasks {
    private Short session_id;

    private Integer exec_context_id;

    private Long wait_duration_ms;

    private String wait_type;

    private Short blocking_session_id;

    private Integer blocking_exec_context_id;

    private String resource_description;

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

    public Long getWait_duration_ms() {
        return wait_duration_ms;
    }

    public void setWait_duration_ms(Long wait_duration_ms) {
        this.wait_duration_ms = wait_duration_ms;
    }

    public String getWait_type() {
        return wait_type;
    }

    public void setWait_type(String wait_type) {
        this.wait_type = wait_type == null ? null : wait_type.trim();
    }

    public Short getBlocking_session_id() {
        return blocking_session_id;
    }

    public void setBlocking_session_id(Short blocking_session_id) {
        this.blocking_session_id = blocking_session_id;
    }

    public Integer getBlocking_exec_context_id() {
        return blocking_exec_context_id;
    }

    public void setBlocking_exec_context_id(Integer blocking_exec_context_id) {
        this.blocking_exec_context_id = blocking_exec_context_id;
    }

    public String getResource_description() {
        return resource_description;
    }

    public void setResource_description(String resource_description) {
        this.resource_description = resource_description == null ? null : resource_description.trim();
    }
}