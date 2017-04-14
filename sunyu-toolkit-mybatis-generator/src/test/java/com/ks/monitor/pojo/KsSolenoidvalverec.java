package com.ks.monitor.pojo;

import java.util.Date;

public class KsSolenoidvalverec {
    private Long solenoidValveRecId;

    private Long equipmentId;

    private Date recTime;

    private Boolean state;

    private Boolean manual;

    private Boolean control;

    private Boolean setConfirm;

    public Long getSolenoidValveRecId() {
        return solenoidValveRecId;
    }

    public void setSolenoidValveRecId(Long solenoidValveRecId) {
        this.solenoidValveRecId = solenoidValveRecId;
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

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Boolean getManual() {
        return manual;
    }

    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    public Boolean getControl() {
        return control;
    }

    public void setControl(Boolean control) {
        this.control = control;
    }

    public Boolean getSetConfirm() {
        return setConfirm;
    }

    public void setSetConfirm(Boolean setConfirm) {
        this.setConfirm = setConfirm;
    }
}