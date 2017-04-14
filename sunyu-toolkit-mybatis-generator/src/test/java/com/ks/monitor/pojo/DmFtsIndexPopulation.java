package com.ks.monitor.pojo;

import java.util.Date;

public class DmFtsIndexPopulation {
    private Integer database_id;

    private Integer catalog_id;

    private Integer table_id;

    private Integer population_type;

    private String population_type_description;

    private Boolean is_clustered_index_scan;

    private Integer range_count;

    private Integer completed_range_count;

    private Integer outstanding_batch_count;

    private Integer status;

    private String status_description;

    private Integer completion_type;

    private String completion_type_description;

    private Integer worker_count;

    private Integer queued_population_type;

    private String queued_population_type_description;

    private Date start_time;

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

    public Integer getPopulation_type() {
        return population_type;
    }

    public void setPopulation_type(Integer population_type) {
        this.population_type = population_type;
    }

    public String getPopulation_type_description() {
        return population_type_description;
    }

    public void setPopulation_type_description(String population_type_description) {
        this.population_type_description = population_type_description == null ? null : population_type_description.trim();
    }

    public Boolean getIs_clustered_index_scan() {
        return is_clustered_index_scan;
    }

    public void setIs_clustered_index_scan(Boolean is_clustered_index_scan) {
        this.is_clustered_index_scan = is_clustered_index_scan;
    }

    public Integer getRange_count() {
        return range_count;
    }

    public void setRange_count(Integer range_count) {
        this.range_count = range_count;
    }

    public Integer getCompleted_range_count() {
        return completed_range_count;
    }

    public void setCompleted_range_count(Integer completed_range_count) {
        this.completed_range_count = completed_range_count;
    }

    public Integer getOutstanding_batch_count() {
        return outstanding_batch_count;
    }

    public void setOutstanding_batch_count(Integer outstanding_batch_count) {
        this.outstanding_batch_count = outstanding_batch_count;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatus_description() {
        return status_description;
    }

    public void setStatus_description(String status_description) {
        this.status_description = status_description == null ? null : status_description.trim();
    }

    public Integer getCompletion_type() {
        return completion_type;
    }

    public void setCompletion_type(Integer completion_type) {
        this.completion_type = completion_type;
    }

    public String getCompletion_type_description() {
        return completion_type_description;
    }

    public void setCompletion_type_description(String completion_type_description) {
        this.completion_type_description = completion_type_description == null ? null : completion_type_description.trim();
    }

    public Integer getWorker_count() {
        return worker_count;
    }

    public void setWorker_count(Integer worker_count) {
        this.worker_count = worker_count;
    }

    public Integer getQueued_population_type() {
        return queued_population_type;
    }

    public void setQueued_population_type(Integer queued_population_type) {
        this.queued_population_type = queued_population_type;
    }

    public String getQueued_population_type_description() {
        return queued_population_type_description;
    }

    public void setQueued_population_type_description(String queued_population_type_description) {
        this.queued_population_type_description = queued_population_type_description == null ? null : queued_population_type_description.trim();
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }
}