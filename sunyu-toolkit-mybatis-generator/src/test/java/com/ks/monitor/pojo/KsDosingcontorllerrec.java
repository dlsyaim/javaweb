package com.ks.monitor.pojo;

import java.util.Date;

public class KsDosingcontorllerrec {
    private Long dosingControllerRecId;

    private Long equipmentId;

    private Date recTime;

    private Boolean manual;

    private Boolean setConfirm;

    private Double manualQb;

    private Double qb;

    public Long getDosingControllerRecId() {
        return dosingControllerRecId;
    }

    public void setDosingControllerRecId(Long dosingControllerRecId) {
        this.dosingControllerRecId = dosingControllerRecId;
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