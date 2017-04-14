package com.ks.monitor.pojo;

import java.util.Date;

public class KsSoftbuttonreal {
    private Long softButtonRealId;

    private Long equipmentId;

    private Date realTime;

    private Boolean softButtonSet;

    private Boolean confirmSet;

    public Long getSoftButtonRealId() {
        return softButtonRealId;
    }

    public void setSoftButtonRealId(Long softButtonRealId) {
        this.softButtonRealId = softButtonRealId;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Date getRealTime() {
        return realTime;
    }

    public void setRealTime(Date realTime) {
        this.realTime = realTime;
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