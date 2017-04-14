package com.ks.monitor.pojo;

public class ChangeTrackingTables {
    private Integer object_id;

    private Boolean is_track_columns_updated_on;

    private Long min_valid_version;

    private Long begin_version;

    private Long cleanup_version;

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public Boolean getIs_track_columns_updated_on() {
        return is_track_columns_updated_on;
    }

    public void setIs_track_columns_updated_on(Boolean is_track_columns_updated_on) {
        this.is_track_columns_updated_on = is_track_columns_updated_on;
    }

    public Long getMin_valid_version() {
        return min_valid_version;
    }

    public void setMin_valid_version(Long min_valid_version) {
        this.min_valid_version = min_valid_version;
    }

    public Long getBegin_version() {
        return begin_version;
    }

    public void setBegin_version(Long begin_version) {
        this.begin_version = begin_version;
    }

    public Long getCleanup_version() {
        return cleanup_version;
    }

    public void setCleanup_version(Long cleanup_version) {
        this.cleanup_version = cleanup_version;
    }
}