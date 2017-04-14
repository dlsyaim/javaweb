package com.ks.monitor.pojo;

public class TableConstraints {
    private String CONSTRAINT_CATALOG;

    private String CONSTRAINT_SCHEMA;

    private String CONSTRAINT_NAME;

    private String TABLE_CATALOG;

    private String TABLE_SCHEMA;

    private String TABLE_NAME;

    private String CONSTRAINT_TYPE;

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

    public String getCONSTRAINT_TYPE() {
        return CONSTRAINT_TYPE;
    }

    public void setCONSTRAINT_TYPE(String CONSTRAINT_TYPE) {
        this.CONSTRAINT_TYPE = CONSTRAINT_TYPE == null ? null : CONSTRAINT_TYPE.trim();
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