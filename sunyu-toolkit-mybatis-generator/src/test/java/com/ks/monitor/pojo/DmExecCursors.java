package com.ks.monitor.pojo;

import java.util.Date;

public class DmExecCursors {
    private Integer session_id;

    private Integer cursor_id;

    private String name;

    private String properties;

    private Integer statement_start_offset;

    private Integer statement_end_offset;

    private Long plan_generation_num;

    private Date creation_time;

    private Boolean is_open;

    private Boolean is_async_population;

    private Boolean is_close_on_commit;

    private Integer fetch_status;

    private Integer fetch_buffer_size;

    private Integer fetch_buffer_start;

    private Integer ansi_position;

    private Long worker_time;

    private Long reads;

    private Long writes;

    private Long dormant_duration;

    private byte[] sql_handle;

    public Integer getSession_id() {
        return session_id;
    }

    public void setSession_id(Integer session_id) {
        this.session_id = session_id;
    }

    public Integer getCursor_id() {
        return cursor_id;
    }

    public void setCursor_id(Integer cursor_id) {
        this.cursor_id = cursor_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties == null ? null : properties.trim();
    }

    public Integer getStatement_start_offset() {
        return statement_start_offset;
    }

    public void setStatement_start_offset(Integer statement_start_offset) {
        this.statement_start_offset = statement_start_offset;
    }

    public Integer getStatement_end_offset() {
        return statement_end_offset;
    }

    public void setStatement_end_offset(Integer statement_end_offset) {
        this.statement_end_offset = statement_end_offset;
    }

    public Long getPlan_generation_num() {
        return plan_generation_num;
    }

    public void setPlan_generation_num(Long plan_generation_num) {
        this.plan_generation_num = plan_generation_num;
    }

    public Date getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }

    public Boolean getIs_open() {
        return is_open;
    }

    public void setIs_open(Boolean is_open) {
        this.is_open = is_open;
    }

    public Boolean getIs_async_population() {
        return is_async_population;
    }

    public void setIs_async_population(Boolean is_async_population) {
        this.is_async_population = is_async_population;
    }

    public Boolean getIs_close_on_commit() {
        return is_close_on_commit;
    }

    public void setIs_close_on_commit(Boolean is_close_on_commit) {
        this.is_close_on_commit = is_close_on_commit;
    }

    public Integer getFetch_status() {
        return fetch_status;
    }

    public void setFetch_status(Integer fetch_status) {
        this.fetch_status = fetch_status;
    }

    public Integer getFetch_buffer_size() {
        return fetch_buffer_size;
    }

    public void setFetch_buffer_size(Integer fetch_buffer_size) {
        this.fetch_buffer_size = fetch_buffer_size;
    }

    public Integer getFetch_buffer_start() {
        return fetch_buffer_start;
    }

    public void setFetch_buffer_start(Integer fetch_buffer_start) {
        this.fetch_buffer_start = fetch_buffer_start;
    }

    public Integer getAnsi_position() {
        return ansi_position;
    }

    public void setAnsi_position(Integer ansi_position) {
        this.ansi_position = ansi_position;
    }

    public Long getWorker_time() {
        return worker_time;
    }

    public void setWorker_time(Long worker_time) {
        this.worker_time = worker_time;
    }

    public Long getReads() {
        return reads;
    }

    public void setReads(Long reads) {
        this.reads = reads;
    }

    public Long getWrites() {
        return writes;
    }

    public void setWrites(Long writes) {
        this.writes = writes;
    }

    public Long getDormant_duration() {
        return dormant_duration;
    }

    public void setDormant_duration(Long dormant_duration) {
        this.dormant_duration = dormant_duration;
    }

    public byte[] getSql_handle() {
        return sql_handle;
    }

    public void setSql_handle(byte[] sql_handle) {
        this.sql_handle = sql_handle;
    }
}