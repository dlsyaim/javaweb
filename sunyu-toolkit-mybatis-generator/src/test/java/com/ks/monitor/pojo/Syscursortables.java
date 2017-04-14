package com.ks.monitor.pojo;

public class Syscursortables {
    private Integer cursor_handle;

    private String table_owner;

    private String table_name;

    private Short optimizer_hint;

    private Short lock_type;

    private String server_name;

    private Integer objectid;

    private Integer dbid;

    private String dbname;

    public Integer getCursor_handle() {
        return cursor_handle;
    }

    public void setCursor_handle(Integer cursor_handle) {
        this.cursor_handle = cursor_handle;
    }

    public String getTable_owner() {
        return table_owner;
    }

    public void setTable_owner(String table_owner) {
        this.table_owner = table_owner == null ? null : table_owner.trim();
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name == null ? null : table_name.trim();
    }

    public Short getOptimizer_hint() {
        return optimizer_hint;
    }

    public void setOptimizer_hint(Short optimizer_hint) {
        this.optimizer_hint = optimizer_hint;
    }

    public Short getLock_type() {
        return lock_type;
    }

    public void setLock_type(Short lock_type) {
        this.lock_type = lock_type;
    }

    public String getServer_name() {
        return server_name;
    }

    public void setServer_name(String server_name) {
        this.server_name = server_name == null ? null : server_name.trim();
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