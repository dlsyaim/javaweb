package com.ks.monitor.pojo;

import java.util.Date;

public class DmDbIndexUsageStats {
    private Short database_id;

    private Integer object_id;

    private Integer index_id;

    private Long user_seeks;

    private Long user_scans;

    private Long user_lookups;

    private Long user_updates;

    private Date last_user_seek;

    private Date last_user_scan;

    private Date last_user_lookup;

    private Date last_user_update;

    private Long system_seeks;

    private Long system_scans;

    private Long system_lookups;

    private Long system_updates;

    private Date last_system_seek;

    private Date last_system_scan;

    private Date last_system_lookup;

    private Date last_system_update;

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

    public Integer getIndex_id() {
        return index_id;
    }

    public void setIndex_id(Integer index_id) {
        this.index_id = index_id;
    }

    public Long getUser_seeks() {
        return user_seeks;
    }

    public void setUser_seeks(Long user_seeks) {
        this.user_seeks = user_seeks;
    }

    public Long getUser_scans() {
        return user_scans;
    }

    public void setUser_scans(Long user_scans) {
        this.user_scans = user_scans;
    }

    public Long getUser_lookups() {
        return user_lookups;
    }

    public void setUser_lookups(Long user_lookups) {
        this.user_lookups = user_lookups;
    }

    public Long getUser_updates() {
        return user_updates;
    }

    public void setUser_updates(Long user_updates) {
        this.user_updates = user_updates;
    }

    public Date getLast_user_seek() {
        return last_user_seek;
    }

    public void setLast_user_seek(Date last_user_seek) {
        this.last_user_seek = last_user_seek;
    }

    public Date getLast_user_scan() {
        return last_user_scan;
    }

    public void setLast_user_scan(Date last_user_scan) {
        this.last_user_scan = last_user_scan;
    }

    public Date getLast_user_lookup() {
        return last_user_lookup;
    }

    public void setLast_user_lookup(Date last_user_lookup) {
        this.last_user_lookup = last_user_lookup;
    }

    public Date getLast_user_update() {
        return last_user_update;
    }

    public void setLast_user_update(Date last_user_update) {
        this.last_user_update = last_user_update;
    }

    public Long getSystem_seeks() {
        return system_seeks;
    }

    public void setSystem_seeks(Long system_seeks) {
        this.system_seeks = system_seeks;
    }

    public Long getSystem_scans() {
        return system_scans;
    }

    public void setSystem_scans(Long system_scans) {
        this.system_scans = system_scans;
    }

    public Long getSystem_lookups() {
        return system_lookups;
    }

    public void setSystem_lookups(Long system_lookups) {
        this.system_lookups = system_lookups;
    }

    public Long getSystem_updates() {
        return system_updates;
    }

    public void setSystem_updates(Long system_updates) {
        this.system_updates = system_updates;
    }

    public Date getLast_system_seek() {
        return last_system_seek;
    }

    public void setLast_system_seek(Date last_system_seek) {
        this.last_system_seek = last_system_seek;
    }

    public Date getLast_system_scan() {
        return last_system_scan;
    }

    public void setLast_system_scan(Date last_system_scan) {
        this.last_system_scan = last_system_scan;
    }

    public Date getLast_system_lookup() {
        return last_system_lookup;
    }

    public void setLast_system_lookup(Date last_system_lookup) {
        this.last_system_lookup = last_system_lookup;
    }

    public Date getLast_system_update() {
        return last_system_update;
    }

    public void setLast_system_update(Date last_system_update) {
        this.last_system_update = last_system_update;
    }
}