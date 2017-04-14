package com.ks.monitor.pojo;

import java.util.Date;

public class Traces {
    private Integer id;

    private Integer status;

    private String path;

    private Long max_size;

    private Date stop_time;

    private Integer max_files;

    private Boolean is_rowset;

    private Boolean is_rollover;

    private Boolean is_shutdown;

    private Boolean is_default;

    private Integer buffer_count;

    private Integer buffer_size;

    private Long file_position;

    private Integer reader_spid;

    private Date start_time;

    private Date last_event_time;

    private Long event_count;

    private Integer dropped_event_count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Long getMax_size() {
        return max_size;
    }

    public void setMax_size(Long max_size) {
        this.max_size = max_size;
    }

    public Date getStop_time() {
        return stop_time;
    }

    public void setStop_time(Date stop_time) {
        this.stop_time = stop_time;
    }

    public Integer getMax_files() {
        return max_files;
    }

    public void setMax_files(Integer max_files) {
        this.max_files = max_files;
    }

    public Boolean getIs_rowset() {
        return is_rowset;
    }

    public void setIs_rowset(Boolean is_rowset) {
        this.is_rowset = is_rowset;
    }

    public Boolean getIs_rollover() {
        return is_rollover;
    }

    public void setIs_rollover(Boolean is_rollover) {
        this.is_rollover = is_rollover;
    }

    public Boolean getIs_shutdown() {
        return is_shutdown;
    }

    public void setIs_shutdown(Boolean is_shutdown) {
        this.is_shutdown = is_shutdown;
    }

    public Boolean getIs_default() {
        return is_default;
    }

    public void setIs_default(Boolean is_default) {
        this.is_default = is_default;
    }

    public Integer getBuffer_count() {
        return buffer_count;
    }

    public void setBuffer_count(Integer buffer_count) {
        this.buffer_count = buffer_count;
    }

    public Integer getBuffer_size() {
        return buffer_size;
    }

    public void setBuffer_size(Integer buffer_size) {
        this.buffer_size = buffer_size;
    }

    public Long getFile_position() {
        return file_position;
    }

    public void setFile_position(Long file_position) {
        this.file_position = file_position;
    }

    public Integer getReader_spid() {
        return reader_spid;
    }

    public void setReader_spid(Integer reader_spid) {
        this.reader_spid = reader_spid;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getLast_event_time() {
        return last_event_time;
    }

    public void setLast_event_time(Date last_event_time) {
        this.last_event_time = last_event_time;
    }

    public Long getEvent_count() {
        return event_count;
    }

    public void setEvent_count(Long event_count) {
        this.event_count = event_count;
    }

    public Integer getDropped_event_count() {
        return dropped_event_count;
    }

    public void setDropped_event_count(Integer dropped_event_count) {
        this.dropped_event_count = dropped_event_count;
    }
}