package com.ks.monitor.pojo;

import java.util.Date;

public class DmDbMirroringAutoPageRepair {
    private Integer database_id;

    private Integer file_id;

    private Long page_id;

    private Short error_type;

    private Byte page_status;

    private Date modification_time;

    public Integer getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Integer database_id) {
        this.database_id = database_id;
    }

    public Integer getFile_id() {
        return file_id;
    }

    public void setFile_id(Integer file_id) {
        this.file_id = file_id;
    }

    public Long getPage_id() {
        return page_id;
    }

    public void setPage_id(Long page_id) {
        this.page_id = page_id;
    }

    public Short getError_type() {
        return error_type;
    }

    public void setError_type(Short error_type) {
        this.error_type = error_type;
    }

    public Byte getPage_status() {
        return page_status;
    }

    public void setPage_status(Byte page_status) {
        this.page_status = page_status;
    }

    public Date getModification_time() {
        return modification_time;
    }

    public void setModification_time(Date modification_time) {
        this.modification_time = modification_time;
    }
}