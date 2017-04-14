package com.ks.monitor.pojo;

import java.util.Date;

public class KsRtu {
    private Long rtuID;

    private String rtuName;

    private Integer rtuSite;

    private Long managerID;

    private Date addTime;

    private Short status;

    public Long getRtuID() {
        return rtuID;
    }

    public void setRtuID(Long rtuID) {
        this.rtuID = rtuID;
    }

    public String getRtuName() {
        return rtuName;
    }

    public void setRtuName(String rtuName) {
        this.rtuName = rtuName == null ? null : rtuName.trim();
    }

    public Integer getRtuSite() {
        return rtuSite;
    }

    public void setRtuSite(Integer rtuSite) {
        this.rtuSite = rtuSite;
    }

    public Long getManagerID() {
        return managerID;
    }

    public void setManagerID(Long managerID) {
        this.managerID = managerID;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}