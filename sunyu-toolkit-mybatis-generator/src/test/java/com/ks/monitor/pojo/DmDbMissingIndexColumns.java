package com.ks.monitor.pojo;

public class DmDbMissingIndexColumns {
    private Integer column_id;

    private String column_name;

    private String column_usage;

    public Integer getColumn_id() {
        return column_id;
    }

    public void setColumn_id(Integer column_id) {
        this.column_id = column_id;
    }

    public String getColumn_name() {
        return column_name;
    }

    public void setColumn_name(String column_name) {
        this.column_name = column_name == null ? null : column_name.trim();
    }

    public String getColumn_usage() {
        return column_usage;
    }

    public void setColumn_usage(String column_usage) {
        this.column_usage = column_usage == null ? null : column_usage.trim();
    }
}