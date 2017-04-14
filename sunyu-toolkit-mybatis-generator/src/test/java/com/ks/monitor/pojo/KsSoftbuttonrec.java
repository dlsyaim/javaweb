package com.ks.monitor.pojo;

import java.util.Date;

public class KsSoftbuttonrec {
    private Long softButtonRecId;

    private Long equipmentId;

    private Date recTime;

    private Boolean softButtonSet;

    private Boolean confirmSet;

    public Long getSoftButtonRecId() {
        return softButtonRecId;
    }

    public void setSoftButtonRecId(Long softButtonRecId) {
        this.softButtonRecId = softButtonRecId;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Date getRecTime() {
        return recTime;
    }

    public void setRecTime(Date recTime) {
        this.recTime = recTime;
    }

    public Boolean getSoftButtonSet() {
        return softButtonSet;
    }

    public void setSoftButtonSet(Boolean softButtonSet) {
        this.softButtonSet = softButtonSet;
    }

    public Boolean getConfirmSet() {
        return confirmSet;
    }

    public void setConfirmSet(Boolean confirmSet) {
        this.confirmSet = confirmSet;
    }
}