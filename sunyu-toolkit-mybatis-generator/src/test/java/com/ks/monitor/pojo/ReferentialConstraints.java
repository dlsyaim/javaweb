package com.ks.monitor.pojo;

public class ReferentialConstraints {
    private String CONSTRAINT_CATALOG;

    private String CONSTRAINT_SCHEMA;

    private String CONSTRAINT_NAME;

    private String UNIQUE_CONSTRAINT_CATALOG;

    private String UNIQUE_CONSTRAINT_SCHEMA;

    private String UNIQUE_CONSTRAINT_NAME;

    private String MATCH_OPTION;

    private String UPDATE_RULE;

    private String DELETE_RULE;

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

    public String getUNIQUE_CONSTRAINT_CATALOG() {
        return UNIQUE_CONSTRAINT_CATALOG;
    }

    public void setUNIQUE_CONSTRAINT_CATALOG(String UNIQUE_CONSTRAINT_CATALOG) {
        this.UNIQUE_CONSTRAINT_CATALOG = UNIQUE_CONSTRAINT_CATALOG == null ? null : UNIQUE_CONSTRAINT_CATALOG.trim();
    }

    public String getUNIQUE_CONSTRAINT_SCHEMA() {
        return UNIQUE_CONSTRAINT_SCHEMA;
    }

    public void setUNIQUE_CONSTRAINT_SCHEMA(String UNIQUE_CONSTRAINT_SCHEMA) {
        this.UNIQUE_CONSTRAINT_SCHEMA = UNIQUE_CONSTRAINT_SCHEMA == null ? null : UNIQUE_CONSTRAINT_SCHEMA.trim();
    }

    public String getUNIQUE_CONSTRAINT_NAME() {
        return UNIQUE_CONSTRAINT_NAME;
    }

    public void setUNIQUE_CONSTRAINT_NAME(String UNIQUE_CONSTRAINT_NAME) {
        this.UNIQUE_CONSTRAINT_NAME = UNIQUE_CONSTRAINT_NAME == null ? null : UNIQUE_CONSTRAINT_NAME.trim();
    }

    public String getMATCH_OPTION() {
        return MATCH_OPTION;
    }

    public void setMATCH_OPTION(String MATCH_OPTION) {
        this.MATCH_OPTION = MATCH_OPTION == null ? null : MATCH_OPTION.trim();
    }

    public String getUPDATE_RULE() {
        return UPDATE_RULE;
    }

    public void setUPDATE_RULE(String UPDATE_RULE) {
        this.UPDATE_RULE = UPDATE_RULE == null ? null : UPDATE_RULE.trim();
    }

    public String getDELETE_RULE() {
        return DELETE_RULE;
    }

    public void setDELETE_RULE(String DELETE_RULE) {
        this.DELETE_RULE = DELETE_RULE == null ? null : DELETE_RULE.trim();
    }
}