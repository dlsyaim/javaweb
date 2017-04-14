package com.ks.monitor.pojo;

public class DmFtsActiveCatalogs {
    private Integer database_id;

    private Integer catalog_id;

    private String name;

    private Boolean is_paused;

    private Integer status;

    private String status_description;

    private Integer previous_status;

    private String previous_status_description;

    private Integer worker_count;

    private Integer active_fts_index_count;

    private Integer auto_population_count;

    private Integer manual_population_count;

    private Integer full_incremental_population_count;

    private Integer row_count_in_thousands;

    private Boolean is_importing;

    private byte[] memory_address;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getIs_paused() {
        return is_paused;
    }

    public void setIs_paused(Boolean is_paused) {
        this.is_paused = is_paused;
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

    public Integer getPrevious_status() {
        return previous_status;
    }

    public void setPrevious_status(Integer previous_status) {
        this.previous_status = previous_status;
    }

    public String getPrevious_status_description() {
        return previous_status_description;
    }

    public void setPrevious_status_description(String previous_status_description) {
        this.previous_status_description = previous_status_description == null ? null : previous_status_description.trim();
    }

    public Integer getWorker_count() {
        return worker_count;
    }

    public void setWorker_count(Integer worker_count) {
        this.worker_count = worker_count;
    }

    public Integer getActive_fts_index_count() {
        return active_fts_index_count;
    }

    public void setActive_fts_index_count(Integer active_fts_index_count) {
        this.active_fts_index_count = active_fts_index_count;
    }

    public Integer getAuto_population_count() {
        return auto_population_count;
    }

    public void setAuto_population_count(Integer auto_population_count) {
        this.auto_population_count = auto_population_count;
    }

    public Integer getManual_population_count() {
        return manual_population_count;
    }

    public void setManual_population_count(Integer manual_population_count) {
        this.manual_population_count = manual_population_count;
    }

    public Integer getFull_incremental_population_count() {
        return full_incremental_population_count;
    }

    public void setFull_incremental_population_count(Integer full_incremental_population_count) {
        this.full_incremental_population_count = full_incremental_population_count;
    }

    public Integer getRow_count_in_thousands() {
        return row_count_in_thousands;
    }

    public void setRow_count_in_thousands(Integer row_count_in_thousands) {
        this.row_count_in_thousands = row_count_in_thousands;
    }

    public Boolean getIs_importing() {
        return is_importing;
    }

    public void setIs_importing(Boolean is_importing) {
        this.is_importing = is_importing;
    }

    public byte[] getMemory_address() {
        return memory_address;
    }

    public void setMemory_address(byte[] memory_address) {
        this.memory_address = memory_address;
    }
}