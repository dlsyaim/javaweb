package com.ks.monitor.pojo;

import java.util.Date;

public class KsDeviceaddress {
    private Long deviceAddressID;

    private String deviceAddressName;

    private Long managerID;

    private Date addTime;

    private Short status;

    public Long getDeviceAddressID() {
        return deviceAddressID;
    }

    public void setDeviceAddressID(Long deviceAddressID) {
        this.deviceAddressID = deviceAddressID;
    }

    public String getDeviceAddressName() {
        return deviceAddressName;
    }

    public void setDeviceAddressName(String deviceAddressName) {
        this.deviceAddressName = deviceAddressName == null ? null : deviceAddressName.trim();
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