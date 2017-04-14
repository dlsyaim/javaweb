package com.ks.monitor.pojo;

public class DmFtsOutstandingBatches {
    private Integer database_id;

    private Integer catalog_id;

    private Integer table_id;

    private Integer batch_id;

    private Integer hr_batch;

    private Boolean is_retry_batch;

    private Integer retry_hints;

    private String retry_hints_description;

    private Long doc_failed;

    public Integer getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Integer database_id) {
        this.database_id = database_id;
    }

    public Integer getCatalog_id() {
        return catalog_id;
    }

    public void setCatalog_id(Integer catalog_id) {
        this.catalog_id = catalog_id;
    }

    public Integer getTable_id() {
        return table_id;
    }

    public void setTable_id(Integer table_id) {
        this.table_id = table_id;
    }

    public Integer getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(Integer batch_id) {
        this.batch_id = batch_id;
    }

    public Integer getHr_batch() {
        return hr_batch;
    }

    public void setHr_batch(Integer hr_batch) {
        this.hr_batch = hr_batch;
    }

    public Boolean getIs_retry_batch() {
        return is_retry_batch;
    }

    public void setIs_retry_batch(Boolean is_retry_batch) {
        this.is_retry_batch = is_retry_batch;
    }

    public Integer getRetry_hints() {
        return retry_hints;
    }

    public void setRetry_hints(Integer retry_hints) {
        this.retry_hints = retry_hints;
    }

    public String getRetry_hints_description() {
        return retry_hints_description;
    }

    public void setRetry_hints_description(String retry_hints_description) {
        this.retry_hints_description = retry_hints_description == null ? null : retry_hints_description.trim();
    }

    public Long getDoc_failed() {
        return doc_failed;
    }

    public void setDoc_failed(Long doc_failed) {
        this.doc_failed = doc_failed;
    }
}