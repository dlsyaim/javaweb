package com.ks.monitor.pojo;

public class GeometryColumnsKey {
    private String f_table_catalog;

    private String f_table_schema;

    private String f_table_name;

    private String f_geometry_column;

    public String getF_table_catalog() {
        return f_table_catalog;
    }

    public void setF_table_catalog(String f_table_catalog) {
        this.f_table_catalog = f_table_catalog == null ? null : f_table_catalog.trim();
    }

    public String getF_table_schema() {
        return f_table_schema;
    }

    public void setF_table_schema(String f_table_schema) {
        this.f_table_schema = f_table_schema == null ? null : f_table_schema.trim();
    }

    public String getF_table_name() {
        return f_table_name;
    }

    public void setF_table_name(String f_table_name) {
        this.f_table_name = f_table_name == null ? null : f_table_name.trim();
    }

    public String getF_geometry_column() {
        return f_geometry_column;
    }

    public void setF_geometry_column(String f_geometry_column) {
        this.f_geometry_column = f_geometry_column == null ? null : f_geometry_column.trim();
    }
}