package com.ks.monitor.pojo;

import java.util.Date;

public class DmCdcErrors {
    private Integer session_id;

    private Integer phase_number;

    private Date entry_time;

    private Integer error_number;

    private Integer error_severity;

    private Integer error_state;

    private String error_message;

    private String start_lsn;

    private String begin_lsn;

    private String sequence_value;

    public Integer getSession_id() {
        return session_id;
    }

    public void setSession_id(Integer session_id) {
        this.session_id = session_id;
    }

    public Integer getPhase_number() {
        return phase_number;
    }

    public void setPhase_number(Integer phase_number) {
        this.phase_number = phase_number;
    }

    public Date getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(Date entry_time) {
        this.entry_time = entry_time;
    }

    public Integer getError_number() {
        return error_number;
    }

    public void setError_number(Integer error_number) {
        this.error_number = error_number;
    }

    public Integer getError_severity() {
        return error_severity;
    }

    public void setError_severity(Integer error_severity) {
        this.error_severity = error_severity;
    }

    public Integer getError_state() {
        return error_state;
    }

    public void setError_state(Integer error_state) {
        this.error_state = error_state;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message == null ? null : error_message.trim();
    }

    public String getStart_lsn() {
        return start_lsn;
    }

    public void setStart_lsn(String start_lsn) {
        this.start_lsn = start_lsn == null ? null : start_lsn.trim();
    }

    public String getBegin_lsn() {
        return begin_lsn;
    }

    public void setBegin_lsn(String begin_lsn) {
        this.begin_lsn = begin_lsn == null ? null : begin_lsn.trim();
    }

    public String getSequence_value() {
        return sequence_value;
    }

    public void setSequence_value(String sequence_value) {
        this.sequence_value = sequence_value == null ? null : sequence_value.trim();
    }
}