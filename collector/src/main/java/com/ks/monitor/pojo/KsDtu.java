package com.ks.monitor.pojo;

import java.util.Date;

public class KsDtu {
    private Long dtuID;

    private String dtuName;

    private String dtuSite;

    private Long managerID;

    private Date addTime;

    private Short status;

    public Long getDtuID() {
        return dtuID;
    }

    public void setDtuID(Long dtuID) {
        this.dtuID = dtuID;
    }

    public String getDtuName() {
        return dtuName;
    }

    public void setDtuName(String dtuName) {
        this.dtuName = dtuName == null ? null : dtuName.trim();
    }

    public String getDtuSite() {
        return dtuSite;
    }

    public void setDtuSite(String dtuSite) {
        this.dtuSite = dtuSite == null ? null : dtuSite.trim();
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