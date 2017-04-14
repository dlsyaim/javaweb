package com.ks.monitor.pojo;

import java.util.Date;

public class DmExecBackgroundJobQueue {
    private Date time_queued;

    private Integer job_id;

    private Integer database_id;

    private Integer object_id1;

    private Integer object_id2;

    private Integer object_id3;

    private Integer object_id4;

    private Integer error_code;

    private Short request_type;

    private Short retry_count;

    private Short in_progress;

    private Short session_id;

    public Date getTime_queued() {
        return time_queued;
    }

    public void setTime_queued(Date time_queued) {
        this.time_queued = time_queued;
    }

    public Integer getJob_id() {
        return job_id;
    }

    public void setJob_id(Integer job_id) {
        this.job_id = job_id;
    }

    public Integer getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Integer database_id) {
        this.database_id = database_id;
    }

    public Integer getObject_id1() {
        return object_id1;
    }

    public void setObject_id1(Integer object_id1) {
        this.object_id1 = object_id1;
    }

    public Integer getObject_id2() {
        return object_id2;
    }

    public void setObject_id2(Integer object_id2) {
        this.object_id2 = object_id2;
    }

    public Integer getObject_id3() {
        return object_id3;
    }

    public void setObject_id3(Integer object_id3) {
        this.object_id3 = object_id3;
    }

    public Integer getObject_id4() {
        return object_id4;
    }

    public void setObject_id4(Integer object_id4) {
        this.object_id4 = object_id4;
    }

    public Integer getError_code() {
        return error_code;
    }

    public void setError_code(Integer error_code) {
        this.error_code = error_code;
    }

    public Short getRequest_type() {
        return request_type;
    }

    public void setRequest_type(Short request_type) {
        this.request_type = request_type;
    }

    public Short getRetry_count() {
        return retry_count;
    }

    public void setRetry_count(Short retry_count) {
        this.retry_count = retry_count;
    }

    public Short getIn_progress() {
        return in_progress;
    }

    public void setIn_progress(Short in_progress) {
        this.in_progress = in_progress;
    }

    public Short getSession_id() {
        return session_id;
    }

    public void setSession_id(Short session_id) {
        this.session_id = session_id;
    }
}