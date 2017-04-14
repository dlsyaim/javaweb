package com.ks.monitor.pojo;

public class SystemInternalsPartitions {
    private Long partition_id;

    private Integer object_id;

    private Integer index_id;

    private Integer partition_number;

    private Long rows;

    private Short filestream_filegroup_id;

    private Boolean is_orphaned;

    private Byte dropped_lob_column_state;

    private Boolean is_unique;

    private Boolean is_replicated;

    private Boolean is_logged_for_replication;

    private Short max_null_bit_used;

    private Integer max_leaf_length;

    private Short min_leaf_length;

    private Short max_internal_length;

    private Short min_internal_length;

    private Boolean allows_nullable_keys;

    private Boolean allow_row_locks;

    private Boolean allow_page_locks;

    private Boolean is_data_row_format;

    private Boolean is_not_versioned;

    private String filestream_guid;

    public Long getPartition_id() {
        return partition_id;
    }

    public void setPartition_id(Long partition_id) {
        this.partition_id = partition_id;
    }

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public Integer getIndex_id() {
        return index_id;
    }

    public void setIndex_id(Integer index_id) {
        this.index_id = index_id;
    }

    public Integer getPartition_number() {
        return partition_number;
    }

    public void setPartition_number(Integer partition_number) {
        this.partition_number = partition_number;
    }

    public Long getRows() {
        return rows;
    }

    public void setRows(Long rows) {
        this.rows = rows;
    }

    public Short getFilestream_filegroup_id() {
        return filestream_filegroup_id;
    }

    public void setFilestream_filegroup_id(Short filestream_filegroup_id) {
        this.filestream_filegroup_id = filestream_filegroup_id;
    }

    public Boolean getIs_orphaned() {
        return is_orphaned;
    }

    public void setIs_orphaned(Boolean is_orphaned) {
        this.is_orphaned = is_orphaned;
    }

    public Byte getDropped_lob_column_state() {
        return dropped_lob_column_state;
    }

    public void setDropped_lob_column_state(Byte dropped_lob_column_state) {
        this.dropped_lob_column_state = dropped_lob_column_state;
    }

    public Boolean getIs_unique() {
        return is_unique;
    }

    public void setIs_unique(Boolean is_unique) {
        this.is_unique = is_unique;
    }

    public Boolean getIs_replicated() {
        return is_replicated;
    }

    public void setIs_replicated(Boolean is_replicated) {
        this.is_replicated = is_replicated;
    }

    public Boolean getIs_logged_for_replication() {
        return is_logged_for_replication;
    }

    public void setIs_logged_for_replication(Boolean is_logged_for_replication) {
        this.is_logged_for_replication = is_logged_for_replication;
    }

    public Short getMax_null_bit_used() {
        return max_null_bit_used;
    }

    public void setMax_null_bit_used(Short max_null_bit_used) {
        this.max_null_bit_used = max_null_bit_used;
    }

    public Integer getMax_leaf_length() {
        return max_leaf_length;
    }

    public void setMax_leaf_length(Integer max_leaf_length) {
        this.max_leaf_length = max_leaf_length;
    }

    public Short getMin_leaf_length() {
        return min_leaf_length;
    }

    public void setMin_leaf_length(Short min_leaf_length) {
        this.min_leaf_length = min_leaf_length;
    }

    public Short getMax_internal_length() {
        return max_internal_length;
    }

    public void setMax_internal_length(Short max_internal_length) {
        this.max_internal_length = max_internal_length;
    }

    public Short getMin_internal_length() {
        return min_internal_length;
    }

    public void setMin_internal_length(Short min_internal_length) {
        this.min_internal_length = min_internal_length;
    }

    public Boolean getAllows_nullable_keys() {
        return allows_nullable_keys;
    }

    public void setAllows_nullable_keys(Boolean allows_nullable_keys) {
        this.allows_nullable_keys = allows_nullable_keys;
    }

    public Boolean getAllow_row_locks() {
        return allow_row_locks;
    }

    public void setAllow_row_locks(Boolean allow_row_locks) {
        this.allow_row_locks = allow_row_locks;
    }

    public Boolean getAllow_page_locks() {
        return allow_page_locks;
    }

    public void setAllow_page_locks(Boolean allow_page_locks) {
        this.allow_page_locks = allow_page_locks;
    }

    public Boolean getIs_data_row_format() {
        return is_data_row_format;
    }

    public void setIs_data_row_format(Boolean is_data_row_format) {
        this.is_data_row_format = is_data_row_format;
    }

    public Boolean getIs_not_versioned() {
        return is_not_versioned;
    }

    public void setIs_not_versioned(Boolean is_not_versioned) {
        this.is_not_versioned = is_not_versioned;
    }

    public String getFilestream_guid() {
        return filestream_guid;
    }

    public void setFilestream_guid(String filestream_guid) {
        this.filestream_guid = filestream_guid == null ? null : filestream_guid.trim();
    }
}