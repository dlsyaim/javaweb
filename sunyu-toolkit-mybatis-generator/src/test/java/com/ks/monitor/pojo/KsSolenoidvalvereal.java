package com.ks.monitor.pojo;

import java.util.Date;

public class KsSolenoidvalvereal {
    private Long solenoidValveRealId;

    private Long equipmentId;

    private Date realTime;

    private Boolean state;

    private Boolean manual;

    private Boolean control;

    private Boolean setConfirm;

    private String passWord;

    public Long getSolenoidValveRealId() {
        return solenoidValveRealId;
    }

    public void setSolenoidValveRealId(Long solenoidValveRealId) {
        this.solenoidValveRealId = solenoidValveRealId;
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

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }
}