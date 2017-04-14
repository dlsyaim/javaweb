package com.ks.monitor.pojo;

public class DmClrTasks {
    private String state;

    private String abort_state;

    private String type;

    private Integer affinity_count;

    private Integer forced_yield_count;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getAbort_state() {
        return abort_state;
    }

    public void setAbort_state(String abort_state) {
        this.abort_state = abort_state == null ? null : abort_state.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getAffinity_count() {
        return affinity_count;
    }

    public void setAffinity_count(Integer affinity_count) {
        this.affinity_count = affinity_count;
    }

    public Integer getForced_yield_count() {
        return forced_yield_count;
    }

    public void setForced_yield_count(Integer forced_yield_count) {
        this.forced_yield_count = forced_yield_count;
    }
}