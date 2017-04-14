package com.ks.monitor.pojo;

public class DomainConstraints {
    private String CONSTRAINT_CATALOG;

    private String CONSTRAINT_SCHEMA;

    private String CONSTRAINT_NAME;

    private String DOMAIN_CATALOG;

    private String DOMAIN_SCHEMA;

    private String DOMAIN_NAME;

    private String IS_DEFERRABLE;

    private String INITIALLY_DEFERRED;

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

    public String getIS_DEFERRABLE() {
        return IS_DEFERRABLE;
    }

    public void setIS_DEFERRABLE(String IS_DEFERRABLE) {
        this.IS_DEFERRABLE = IS_DEFERRABLE == null ? null : IS_DEFERRABLE.trim();
    }

    public String getINITIALLY_DEFERRED() {
        return INITIALLY_DEFERRED;
    }

    public void setINITIALLY_DEFERRED(String INITIALLY_DEFERRED) {
        this.INITIALLY_DEFERRED = INITIALLY_DEFERRED == null ? null : INITIALLY_DEFERRED.trim();
    }
}