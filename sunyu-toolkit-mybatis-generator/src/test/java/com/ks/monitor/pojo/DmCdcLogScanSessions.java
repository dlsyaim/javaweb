package com.ks.monitor.pojo;

import java.util.Date;

public class DmCdcLogScanSessions {
    private Integer session_id;

    private Date start_time;

    private Date end_time;

    private Integer duration;

    private String scan_phase;

    private Integer error_count;

    private String start_lsn;

    private String current_lsn;

    private String end_lsn;

    private Long tran_count;

    private String last_commit_lsn;

    private Date last_commit_time;

    private Long log_record_count;

    private Integer schema_change_count;

    private Long command_count;

    private String first_begin_cdc_lsn;

    private String last_commit_cdc_lsn;

    private Date last_commit_cdc_time;

    private Integer latency;

    private Integer empty_scan_count;

    private Integer failed_sessions_count;

    public Integer getSession_id() {
        return session_id;
    }

    public void setSession_id(Integer session_id) {
        this.session_id = session_id;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getScan_phase() {
        return scan_phase;
    }

    public void setScan_phase(String scan_phase) {
        this.scan_phase = scan_phase == null ? null : scan_phase.trim();
    }

    public Integer getError_count() {
        return error_count;
    }

    public void setError_count(Integer error_count) {
        this.error_count = error_count;
    }

    public String getStart_lsn() {
        return start_lsn;
    }

    public void setStart_lsn(String start_lsn) {
        this.start_lsn = start_lsn == null ? null : start_lsn.trim();
    }

    public String getCurrent_lsn() {
        return current_lsn;
    }

    public void setCurrent_lsn(String current_lsn) {
        this.current_lsn = current_lsn == null ? null : current_lsn.trim();
    }

    public String getEnd_lsn() {
        return end_lsn;
    }

    public void setEnd_lsn(String end_lsn) {
        this.end_lsn = end_lsn == null ? null : end_lsn.trim();
    }

    public Long getTran_count() {
        return tran_count;
    }

    public void setTran_count(Long tran_count) {
        this.tran_count = tran_count;
    }

    public String getLast_commit_lsn() {
        return last_commit_lsn;
    }

    public void setLast_commit_lsn(String last_commit_lsn) {
        this.last_commit_lsn = last_commit_lsn == null ? null : last_commit_lsn.trim();
    }

    public Date getLast_commit_time() {
        return last_commit_time;
    }

    public void setLast_commit_time(Date last_commit_time) {
        this.last_commit_time = last_commit_time;
    }

    public Long getLog_record_count() {
        return log_record_count;
    }

    public void setLog_record_count(Long log_record_count) {
        this.log_record_count = log_record_count;
    }

    public Integer getSchema_change_count() {
        return schema_change_count;
    }

    public void setSchema_change_count(Integer schema_change_count) {
        this.schema_change_count = schema_change_count;
    }

    public Long getCommand_count() {
        return command_count;
    }

    public void setCommand_count(Long command_count) {
        this.command_count = command_count;
    }

    public String getFirst_begin_cdc_lsn() {
        return first_begin_cdc_lsn;
    }

    public void setFirst_begin_cdc_lsn(String first_begin_cdc_lsn) {
        this.first_begin_cdc_lsn = first_begin_cdc_lsn == null ? null : first_begin_cdc_lsn.trim();
    }

    public String getLast_commit_cdc_lsn() {
        return last_commit_cdc_lsn;
    }

    public void setLast_commit_cdc_lsn(String last_commit_cdc_lsn) {
        this.last_commit_cdc_lsn = last_commit_cdc_lsn == null ? null : last_commit_cdc_lsn.trim();
    }

    public Date getLast_commit_cdc_time() {
        return last_commit_cdc_time;
    }

    public void setLast_commit_cdc_time(Date last_commit_cdc_time) {
        this.last_commit_cdc_time = last_commit_cdc_time;
    }

    public Integer getLatency() {
        return latency;
    }

    public void setLatency(Integer latency) {
        this.latency = latency;
    }

    public Integer getEmpty_scan_count() {
        return empty_scan_count;
    }

    public void setEmpty_scan_count(Integer empty_scan_count) {
        this.empty_scan_count = empty_scan_count;
    }

    public Integer getFailed_sessions_count() {
        return failed_sessions_count;
    }

    public void setFailed_sessions_count(Integer failed_sessions_count) {
        this.failed_sessions_count = failed_sessions_count;
    }
}