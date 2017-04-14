package com.ks.monitor.pojo;

public class Schemata {
    private String CATALOG_NAME;

    private String SCHEMA_NAME;

    private String SCHEMA_OWNER;

    private String DEFAULT_CHARACTER_SET_CATALOG;

    private String DEFAULT_CHARACTER_SET_SCHEMA;

    private String DEFAULT_CHARACTER_SET_NAME;

    public String getCATALOG_NAME() {
        return CATALOG_NAME;
    }

    public void setCATALOG_NAME(String CATALOG_NAME) {
        this.CATALOG_NAME = CATALOG_NAME == null ? null : CATALOG_NAME.trim();
    }

    public String getSCHEMA_NAME() {
        return SCHEMA_NAME;
    }

    public void setSCHEMA_NAME(String SCHEMA_NAME) {
        this.SCHEMA_NAME = SCHEMA_NAME == null ? null : SCHEMA_NAME.trim();
    }

    public String getSCHEMA_OWNER() {
        return SCHEMA_OWNER;
    }

    public void setSCHEMA_OWNER(String SCHEMA_OWNER) {
        this.SCHEMA_OWNER = SCHEMA_OWNER == null ? null : SCHEMA_OWNER.trim();
    }

    public String getDEFAULT_CHARACTER_SET_CATALOG() {
        return DEFAULT_CHARACTER_SET_CATALOG;
    }

    public void setDEFAULT_CHARACTER_SET_CATALOG(String DEFAULT_CHARACTER_SET_CATALOG) {
        this.DEFAULT_CHARACTER_SET_CATALOG = DEFAULT_CHARACTER_SET_CATALOG == null ? null : DEFAULT_CHARACTER_SET_CATALOG.trim();
    }

    public String getDEFAULT_CHARACTER_SET_SCHEMA() {
        return DEFAULT_CHARACTER_SET_SCHEMA;
    }

    public void setDEFAULT_CHARACTER_SET_SCHEMA(String DEFAULT_CHARACTER_SET_SCHEMA) {
        this.DEFAULT_CHARACTER_SET_SCHEMA = DEFAULT_CHARACTER_SET_SCHEMA == null ? null : DEFAULT_CHARACTER_SET_SCHEMA.trim();
    }

    public String getDEFAULT_CHARACTER_SET_NAME() {
        return DEFAULT_CHARACTER_SET_NAME;
    }

    public void setDEFAULT_CHARACTER_SET_NAME(String DEFAULT_CHARACTER_SET_NAME) {
        this.DEFAULT_CHARACTER_SET_NAME = DEFAULT_CHARACTER_SET_NAME == null ? null : DEFAULT_CHARACTER_SET_NAME.trim();
    }
}