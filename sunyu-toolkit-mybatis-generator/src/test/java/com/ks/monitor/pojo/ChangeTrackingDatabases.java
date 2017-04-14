package com.ks.monitor.pojo;

public class ChangeTrackingDatabases {
    private Integer database_id;

    private Byte is_auto_cleanup_on;

    private Integer retention_period;

    private Byte retention_period_units;

    private String retention_period_units_desc;

    private Long max_cleanup_version;

    public Integer getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Integer database_id) {
        this.database_id = database_id;
    }

    public Byte getIs_auto_cleanup_on() {
        return is_auto_cleanup_on;
    }

    public void setIs_auto_cleanup_on(Byte is_auto_cleanup_on) {
        this.is_auto_cleanup_on = is_auto_cleanup_on;
    }

    public Integer getRetention_period() {
        return retention_period;
    }

    public void setRetention_period(Integer retention_period) {
        this.retention_period = retention_period;
    }

    public Byte getRetention_period_units() {
        return retention_period_units;
    }

    public void setRetention_period_units(Byte retention_period_units) {
        this.retention_period_units = retention_period_units;
    }

    public String getRetention_period_units_desc() {
        return retention_period_units_desc;
    }

    public void setRetention_period_units_desc(String retention_period_units_desc) {
        this.retention_period_units_desc = retention_period_units_desc == null ? null : retention_period_units_desc.trim();
    }

    public Long getMax_cleanup_version() {
        return max_cleanup_version;
    }

    public void setMax_cleanup_version(Long max_cleanup_version) {
        this.max_cleanup_version = max_cleanup_version;
    }
}