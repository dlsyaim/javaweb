package com.ks.monitor.pojo;

public class TablePrivileges {
    private String GRANTOR;

    private String GRANTEE;

    private String TABLE_CATALOG;

    private String TABLE_SCHEMA;

    private String TABLE_NAME;

    private String PRIVILEGE_TYPE;

    private String IS_GRANTABLE;

    public String getGRANTOR() {
        return GRANTOR;
    }

    public void setGRANTOR(String GRANTOR) {
        this.GRANTOR = GRANTOR == null ? null : GRANTOR.trim();
    }

    public String getGRANTEE() {
        return GRANTEE;
    }

    public void setGRANTEE(String GRANTEE) {
        this.GRANTEE = GRANTEE == null ? null : GRANTEE.trim();
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

    public String getPRIVILEGE_TYPE() {
        return PRIVILEGE_TYPE;
    }

    public void setPRIVILEGE_TYPE(String PRIVILEGE_TYPE) {
        this.PRIVILEGE_TYPE = PRIVILEGE_TYPE == null ? null : PRIVILEGE_TYPE.trim();
    }

    public String getIS_GRANTABLE() {
        return IS_GRANTABLE;
    }

    public void setIS_GRANTABLE(String IS_GRANTABLE) {
        this.IS_GRANTABLE = IS_GRANTABLE == null ? null : IS_GRANTABLE.trim();
    }
}