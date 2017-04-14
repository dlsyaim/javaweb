package com.ks.monitor.pojo;

import java.util.Date;

public class KsRtuagreement {
    private Long agreeMentID;

    private String agreeMentName;

    private Long managerID;

    private Date addTime;

    private Short status;

    public Long getAgreeMentID() {
        return agreeMentID;
    }

    public void setAgreeMentID(Long agreeMentID) {
        this.agreeMentID = agreeMentID;
    }

    public String getAgreeMentName() {
        return agreeMentName;
    }

    public void setAgreeMentName(String agreeMentName) {
        this.agreeMentName = agreeMentName == null ? null : agreeMentName.trim();
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