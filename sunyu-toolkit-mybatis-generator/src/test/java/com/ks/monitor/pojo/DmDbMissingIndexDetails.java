package com.ks.monitor.pojo;

public class DmDbMissingIndexDetails {
    private Integer index_handle;

    private Short database_id;

    private Integer object_id;

    private String equality_columns;

    private String inequality_columns;

    private String included_columns;

    private String statement;

    public Integer getIndex_handle() {
        return index_handle;
    }

    public void setIndex_handle(Integer index_handle) {
        this.index_handle = index_handle;
    }

    public Short getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Short database_id) {
        this.database_id = database_id;
    }

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public String getEquality_columns() {
        return equality_columns;
    }

    public void setEquality_columns(String equality_columns) {
        this.equality_columns = equality_columns == null ? null : equality_columns.trim();
    }

    public String getInequality_columns() {
        return inequality_columns;
    }

    public void setInequality_columns(String inequality_columns) {
        this.inequality_columns = inequality_columns == null ? null : inequality_columns.trim();
    }

    public String getIncluded_columns() {
        return included_columns;
    }

    public void setIncluded_columns(String included_columns) {
        this.included_columns = included_columns == null ? null : included_columns.trim();
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement == null ? null : statement.trim();
    }
}