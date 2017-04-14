package com.ks.monitor.pojo;

public class Syscursorcolumns {
    private Integer cursor_handle;

    private String column_name;

    private Integer ordinal_position;

    private Integer column_characteristics_flags;

    private Integer column_size;

    private Integer data_type_sql;

    private Byte column_precision;

    private Byte column_scale;

    private Integer order_position;

    private String order_direction;

    private Short hidden_column;

    private Integer columnid;

    private Integer objectid;

    private Integer dbid;

    private String dbname;

    public Integer getCursor_handle() {
        return cursor_handle;
    }

    public void setCursor_handle(Integer cursor_handle) {
        this.cursor_handle = cursor_handle;
    }

    public String getColumn_name() {
        return column_name;
    }

    public void setColumn_name(String column_name) {
        this.column_name = column_name == null ? null : column_name.trim();
    }

    public Integer getOrdinal_position() {
        return ordinal_position;
    }

    public void setOrdinal_position(Integer ordinal_position) {
        this.ordinal_position = ordinal_position;
    }

    public Integer getColumn_characteristics_flags() {
        return column_characteristics_flags;
    }

    public void setColumn_characteristics_flags(Integer column_characteristics_flags) {
        this.column_characteristics_flags = column_characteristics_flags;
    }

    public Integer getColumn_size() {
        return column_size;
    }

    public void setColumn_size(Integer column_size) {
        this.column_size = column_size;
    }

    public Integer getData_type_sql() {
        return data_type_sql;
    }

    public void setData_type_sql(Integer data_type_sql) {
        this.data_type_sql = data_type_sql;
    }

    public Byte getColumn_precision() {
        return column_precision;
    }

    public void setColumn_precision(Byte column_precision) {
        this.column_precision = column_precision;
    }

    public Byte getColumn_scale() {
        return column_scale;
    }

    public void setColumn_scale(Byte column_scale) {
        this.column_scale = column_scale;
    }

    public Integer getOrder_position() {
        return order_position;
    }

    public void setOrder_position(Integer order_position) {
        this.order_position = order_position;
    }

    public String getOrder_direction() {
        return order_direction;
    }

    public void setOrder_direction(String order_direction) {
        this.order_direction = order_direction == null ? null : order_direction.trim();
    }

    public Short getHidden_column() {
        return hidden_column;
    }

    public void setHidden_column(Short hidden_column) {
        this.hidden_column = hidden_column;
    }

    public Integer getColumnid() {
        return columnid;
    }

    public void setColumnid(Integer columnid) {
        this.columnid = columnid;
    }

    public Integer getObjectid() {
        return objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    public Integer getDbid() {
        return dbid;
    }

    public void setDbid(Integer dbid) {
        this.dbid = dbid;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname == null ? null : dbname.trim();
    }
}