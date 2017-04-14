package com.ks.monitor.pojo;

import java.util.Date;

public class DmDbMissingIndexGroupStats {
    private Integer group_handle;

    private Long unique_compiles;

    private Long user_seeks;

    private Long user_scans;

    private Date last_user_seek;

    private Date last_user_scan;

    private Double avg_total_user_cost;

    private Double avg_user_impact;

    private Long system_seeks;

    private Long system_scans;

    private Date last_system_seek;

    private Date last_system_scan;

    private Double avg_total_system_cost;

    private Double avg_system_impact;

    public Integer getGroup_handle() {
        return group_handle;
    }

    public void setGroup_handle(Integer group_handle) {
        this.group_handle = group_handle;
    }

    public Long getUnique_compiles() {
        return unique_compiles;
    }

    public void setUnique_compiles(Long unique_compiles) {
        this.unique_compiles = unique_compiles;
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

    public Double getAvg_total_user_cost() {
        return avg_total_user_cost;
    }

    public void setAvg_total_user_cost(Double avg_total_user_cost) {
        this.avg_total_user_cost = avg_total_user_cost;
    }

    public Double getAvg_user_impact() {
        return avg_user_impact;
    }

    public void setAvg_user_impact(Double avg_user_impact) {
        this.avg_user_impact = avg_user_impact;
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

    public Double getAvg_total_system_cost() {
        return avg_total_system_cost;
    }

    public void setAvg_total_system_cost(Double avg_total_system_cost) {
        this.avg_total_system_cost = avg_total_system_cost;
    }

    public Double getAvg_system_impact() {
        return avg_system_impact;
    }

    public void setAvg_system_impact(Double avg_system_impact) {
        this.avg_system_impact = avg_system_impact;
    }
}