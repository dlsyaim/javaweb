package com.ks.monitor.pojo;

import java.util.Date;

public class KsInfraredrec {
    private Long infraredRecID;

    private Long equipMentID;

    private String ramCode;

    private Short infraredStatus;

    private Short electric;

    private Short door;

    private Date colTime;

    private Date addTime;

    private Short status;

    public Long getInfraredRecID() {
        return infraredRecID;
    }

    public void setInfraredRecID(Long infraredRecID) {
        this.infraredRecID = infraredRecID;
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

    public Short getInfraredStatus() {
        return infraredStatus;
    }

    public void setInfraredStatus(Short infraredStatus) {
        this.infraredStatus = infraredStatus;
    }

    public Short getElectric() {
        return electric;
    }

    public void setElectric(Short electric) {
        this.electric = electric;
    }

    public Short getDoor() {
        return door;
    }

    public void setDoor(Short door) {
        this.door = door;
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