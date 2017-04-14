package com.ks.monitor.pojo;

import java.util.Date;

public class KsDtuinterface {
    private Long interFaceID;

    private String interFaceName;

    private Long managerID;

    private Date addTime;

    private Short status;

    public Long getInterFaceID() {
        return interFaceID;
    }

    public void setInterFaceID(Long interFaceID) {
        this.interFaceID = interFaceID;
    }

    public String getInterFaceName() {
        return interFaceName;
    }

    public void setInterFaceName(String interFaceName) {
        this.interFaceName = interFaceName == null ? null : interFaceName.trim();
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