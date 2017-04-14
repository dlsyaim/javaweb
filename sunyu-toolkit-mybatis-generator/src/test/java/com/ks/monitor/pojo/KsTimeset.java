package com.ks.monitor.pojo;

import java.util.Date;

public class KsTimeset {
    private Long timeSetId;

    private Integer collectionTime;

    private Integer batteryCollectionTime;

    private Integer batteryUpLoadTime;

    private Long managerID;

    private Date addTime;

    private Short status;

    public Long getTimeSetId() {
        return timeSetId;
    }

    public void setTimeSetId(Long timeSetId) {
        this.timeSetId = timeSetId;
    }

    public Integer getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(Integer collectionTime) {
        this.collectionTime = collectionTime;
    }

    public Integer getBatteryCollectionTime() {
        return batteryCollectionTime;
    }

    public void setBatteryCollectionTime(Integer batteryCollectionTime) {
        this.batteryCollectionTime = batteryCollectionTime;
    }

    public Integer getBatteryUpLoadTime() {
        return batteryUpLoadTime;
    }

    public void setBatteryUpLoadTime(Integer batteryUpLoadTime) {
        this.batteryUpLoadTime = batteryUpLoadTime;
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