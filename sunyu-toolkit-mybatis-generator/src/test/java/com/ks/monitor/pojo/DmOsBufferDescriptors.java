package com.ks.monitor.pojo;

public class DmOsBufferDescriptors {
    private Integer database_id;

    private Integer file_id;

    private Integer page_id;

    private Integer page_level;

    private Long allocation_unit_id;

    private String page_type;

    private Integer row_count;

    private Integer free_space_in_bytes;

    private Boolean is_modified;

    private Integer numa_node;

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

    public Integer getPage_id() {
        return page_id;
    }

    public void setPage_id(Integer page_id) {
        this.page_id = page_id;
    }

    public Integer getPage_level() {
        return page_level;
    }

    public void setPage_level(Integer page_level) {
        this.page_level = page_level;
    }

    public Long getAllocation_unit_id() {
        return allocation_unit_id;
    }

    public void setAllocation_unit_id(Long allocation_unit_id) {
        this.allocation_unit_id = allocation_unit_id;
    }

    public String getPage_type() {
        return page_type;
    }

    public void setPage_type(String page_type) {
        this.page_type = page_type == null ? null : page_type.trim();
    }

    public Integer getRow_count() {
        return row_count;
    }

    public void setRow_count(Integer row_count) {
        this.row_count = row_count;
    }

    public Integer getFree_space_in_bytes() {
        return free_space_in_bytes;
    }

    public void setFree_space_in_bytes(Integer free_space_in_bytes) {
        this.free_space_in_bytes = free_space_in_bytes;
    }

    public Boolean getIs_modified() {
        return is_modified;
    }

    public void setIs_modified(Boolean is_modified) {
        this.is_modified = is_modified;
    }

    public Integer getNuma_node() {
        return numa_node;
    }

    public void setNuma_node(Integer numa_node) {
        this.numa_node = numa_node;
    }
}