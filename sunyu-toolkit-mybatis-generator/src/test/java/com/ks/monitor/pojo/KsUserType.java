package com.ks.monitor.pojo;

public class KsUserType {
    private Long userTypeID;

    private String userTypeName;

    private String addTime;

    private Short status;

    public Long getUserTypeID() {
        return userTypeID;
    }

    public void setUserTypeID(Long userTypeID) {
        this.userTypeID = userTypeID;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName == null ? null : userTypeName.trim();
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}