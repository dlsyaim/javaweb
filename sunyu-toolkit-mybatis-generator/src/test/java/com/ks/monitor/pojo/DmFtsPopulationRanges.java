package com.ks.monitor.pojo;

public class DmFtsPopulationRanges {
    private Boolean is_retry;

    private Short session_id;

    private Integer processed_row_count;

    private Integer error_count;

    public Boolean getIs_retry() {
        return is_retry;
    }

    public void setIs_retry(Boolean is_retry) {
        this.is_retry = is_retry;
    }

    public Short getSession_id() {
        return session_id;
    }

    public void setSession_id(Short session_id) {
        this.session_id = session_id;
    }

    public Integer getProcessed_row_count() {
        return processed_row_count;
    }

    public void setProcessed_row_count(Integer processed_row_count) {
        this.processed_row_count = processed_row_count;
    }

    public Integer getError_count() {
        return error_count;
    }

    public void setError_count(Integer error_count) {
        this.error_count = error_count;
    }
}