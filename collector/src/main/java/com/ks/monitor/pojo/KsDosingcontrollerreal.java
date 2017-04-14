package com.ks.monitor.pojo;

import java.util.Date;

public class KsDosingcontrollerreal {
    private Long dosingControllerRealId;

    private Long equipmentId;

    private Date realTime;

    private Boolean manual;

    private Boolean setConfirm;

    private Double manualQb;

    private Double qb;

    public Long getDosingControllerRealId() {
        return dosingControllerRealId;
    }

    public void setDosingControllerRealId(Long dosingControllerRealId) {
        this.dosingControllerRealId = dosingControllerRealId;
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

    public Boolean getManual() {
        return manual;
    }

    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    public Boolean getSetConfirm() {
        return setConfirm;
    }

    public void setSetConfirm(Boolean setConfirm) {
        this.setConfirm = setConfirm;
    }

    public Double getManualQb() {
        return manualQb;
    }

    public void setManualQb(Double manualQb) {
        this.manualQb = manualQb;
    }

    public Double getQb() {
        return qb;
    }

    public void setQb(Double qb) {
        this.qb = qb;
    }
}