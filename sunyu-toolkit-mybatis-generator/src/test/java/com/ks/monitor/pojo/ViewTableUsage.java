package com.ks.monitor.pojo;

public class ViewTableUsage {
    private String VIEW_CATALOG;

    private String VIEW_SCHEMA;

    private String VIEW_NAME;

    private String TABLE_CATALOG;

    private String TABLE_SCHEMA;

    private String TABLE_NAME;

    public String getVIEW_CATALOG() {
        return VIEW_CATALOG;
    }

    public void setVIEW_CATALOG(String VIEW_CATALOG) {
        this.VIEW_CATALOG = VIEW_CATALOG == null ? null : VIEW_CATALOG.trim();
    }

    public String getVIEW_SCHEMA() {
        return VIEW_SCHEMA;
    }

    public void setVIEW_SCHEMA(String VIEW_SCHEMA) {
        this.VIEW_SCHEMA = VIEW_SCHEMA == null ? null : VIEW_SCHEMA.trim();
    }

    public String getVIEW_NAME() {
        return VIEW_NAME;
    }

    public void setVIEW_NAME(String VIEW_NAME) {
        this.VIEW_NAME = VIEW_NAME == null ? null : VIEW_NAME.trim();
    }

    public String getTABLE_CATALOG() {
        return TABLE_CATALOG;
    }

    public void setTABLE_CATALOG(String TABLE_CATALOG) {
        this.TABLE_CATALOG = TABLE_CATALOG == null ? null : TABLE_CATALOG.trim();
    }

    public String getTABLE_SCHEMA() {
        return TABLE_SCHEMA;
    }

    public void setTABLE_SCHEMA(String TABLE_SCHEMA) {
        this.TABLE_SCHEMA = TABLE_SCHEMA == null ? null : TABLE_SCHEMA.trim();
    }

    public String getTABLE_NAME() {
        return TABLE_NAME;
    }

    public void setTABLE_NAME(String TABLE_NAME) {
        this.TABLE_NAME = TABLE_NAME == null ? null : TABLE_NAME.trim();
    }
}