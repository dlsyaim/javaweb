package com.ks.monitor.pojo;

public class KeyColumnUsage {
    private String CONSTRAINT_CATALOG;

    private String CONSTRAINT_SCHEMA;

    private String CONSTRAINT_NAME;

    private String TABLE_CATALOG;

    private String TABLE_SCHEMA;

    private String TABLE_NAME;

    private String COLUMN_NAME;

    private Integer ORDINAL_POSITION;

    public String getCONSTRAINT_CATALOG() {
        return CONSTRAINT_CATALOG;
    }

    public void setCONSTRAINT_CATALOG(String CONSTRAINT_CATALOG) {
        this.CONSTRAINT_CATALOG = CONSTRAINT_CATALOG == null ? null : CONSTRAINT_CATALOG.trim();
    }

    public String getCONSTRAINT_SCHEMA() {
        return CONSTRAINT_SCHEMA;
    }

    public void setCONSTRAINT_SCHEMA(String CONSTRAINT_SCHEMA) {
        this.CONSTRAINT_SCHEMA = CONSTRAINT_SCHEMA == null ? null : CONSTRAINT_SCHEMA.trim();
    }

    public String getCONSTRAINT_NAME() {
        return CONSTRAINT_NAME;
    }

    public void setCONSTRAINT_NAME(String CONSTRAINT_NAME) {
        this.CONSTRAINT_NAME = CONSTRAINT_NAME == null ? null : CONSTRAINT_NAME.trim();
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

    public Integer getORDINAL_POSITION() {
        return ORDINAL_POSITION;
    }

    public void setORDINAL_POSITION(Integer ORDINAL_POSITION) {
        this.ORDINAL_POSITION = ORDINAL_POSITION;
    }
}