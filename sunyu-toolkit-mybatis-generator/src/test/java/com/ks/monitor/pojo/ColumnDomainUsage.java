package com.ks.monitor.pojo;

public class ColumnDomainUsage {
    private String DOMAIN_CATALOG;

    private String DOMAIN_SCHEMA;

    private String DOMAIN_NAME;

    private String TABLE_CATALOG;

    private String TABLE_SCHEMA;

    private String TABLE_NAME;

    private String COLUMN_NAME;

    public String getDOMAIN_CATALOG() {
        return DOMAIN_CATALOG;
    }

    public void setDOMAIN_CATALOG(String DOMAIN_CATALOG) {
        this.DOMAIN_CATALOG = DOMAIN_CATALOG == null ? null : DOMAIN_CATALOG.trim();
    }

    public String getDOMAIN_SCHEMA() {
        return DOMAIN_SCHEMA;
    }

    public void setDOMAIN_SCHEMA(String DOMAIN_SCHEMA) {
        this.DOMAIN_SCHEMA = DOMAIN_SCHEMA == null ? null : DOMAIN_SCHEMA.trim();
    }

    public String getDOMAIN_NAME() {
        return DOMAIN_NAME;
    }

    public void setDOMAIN_NAME(String DOMAIN_NAME) {
        this.DOMAIN_NAME = DOMAIN_NAME == null ? null : DOMAIN_NAME.trim();
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

    public String getCOLUMN_NAME() {
        return COLUMN_NAME;
    }

    public void setCOLUMN_NAME(String COLUMN_NAME) {
        this.COLUMN_NAME = COLUMN_NAME == null ? null : COLUMN_NAME.trim();
    }
}