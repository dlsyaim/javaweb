package com.ks.monitor.pojo;

public class Views {
    private String TABLE_CATALOG;

    private String TABLE_SCHEMA;

    private String TABLE_NAME;

    private String VIEW_DEFINITION;

    private String CHECK_OPTION;

    private String IS_UPDATABLE;

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

    public String getVIEW_DEFINITION() {
        return VIEW_DEFINITION;
    }

    public void setVIEW_DEFINITION(String VIEW_DEFINITION) {
        this.VIEW_DEFINITION = VIEW_DEFINITION == null ? null : VIEW_DEFINITION.trim();
    }

    public String getCHECK_OPTION() {
        return CHECK_OPTION;
    }

    public void setCHECK_OPTION(String CHECK_OPTION) {
        this.CHECK_OPTION = CHECK_OPTION == null ? null : CHECK_OPTION.trim();
    }

    public String getIS_UPDATABLE() {
        return IS_UPDATABLE;
    }

    public void setIS_UPDATABLE(String IS_UPDATABLE) {
        this.IS_UPDATABLE = IS_UPDATABLE == null ? null : IS_UPDATABLE.trim();
    }
}