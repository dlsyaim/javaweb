package com.ks.monitor.pojo;

import java.util.Date;

public class KsElectronicfencerec {
    private Long electronicFenceID;

    private Long equipMentID;

    private String ramCode;

    private Short electronicFenceStatus;

    private Date colTime;

    private Date addTime;

    private Short status;

    public Long getElectronicFenceID() {
        return electronicFenceID;
    }

    public void setElectronicFenceID(Long electronicFenceID) {
        this.electronicFenceID = electronicFenceID;
    }

    public Long getEquipMentID() {
        return equipMentID;
    }

    public void setEquipMentID(Long equipMentID) {
        this.equipMentID = equipMentID;
    }

    public String getRamCode() {
        return ramCode;
    }

    public void setRamCode(String ramCode) {
        this.ramCode = ramCode == null ? null : ramCode.trim();
    }

    public Short getElectronicFenceStatus() {
        return electronicFenceStatus;
    }

    public void setElectronicFenceStatus(Short electronicFenceStatus) {
        this.electronicFenceStatus = electronicFenceStatus;
    }

    public Date getColTime() {
        return colTime;
    }

    public void setColTime(Date colTime) {
        this.colTime = colTime;
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