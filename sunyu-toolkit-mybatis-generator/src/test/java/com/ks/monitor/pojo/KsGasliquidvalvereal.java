package com.ks.monitor.pojo;

import java.util.Date;

public class KsGasliquidvalvereal {
    private Long gasLiquidValveRealId;

    private Long equipmentId;

    private Date realTime;

    private Boolean openState;

    private Boolean closeState;

    private Boolean fault;

    private Boolean local;

    private Boolean openSet;

    private Boolean closeSet;

    private Boolean emergencySet;

    private Boolean confirmSet;

    public Long getGasLiquidValveRealId() {
        return gasLiquidValveRealId;
    }

    public void setGasLiquidValveRealId(Long gasLiquidValveRealId) {
        this.gasLiquidValveRealId = gasLiquidValveRealId;
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

    public Boolean getOpenState() {
        return openState;
    }

    public void setOpenState(Boolean openState) {
        this.openState = openState;
    }

    public Boolean getCloseState() {
        return closeState;
    }

    public void setCloseState(Boolean closeState) {
        this.closeState = closeState;
    }

    public Boolean getFault() {
        return fault;
    }

    public void setFault(Boolean fault) {
        this.fault = fault;
    }

    public Boolean getLocal() {
        return local;
    }

    public void setLocal(Boolean local) {
        this.local = local;
    }

    public Boolean getOpenSet() {
        return openSet;
    }

    public void setOpenSet(Boolean openSet) {
        this.openSet = openSet;
    }

    public Boolean getCloseSet() {
        return closeSet;
    }

    public void setCloseSet(Boolean closeSet) {
        this.closeSet = closeSet;
    }

    public Boolean getEmergencySet() {
        return emergencySet;
    }

    public void setEmergencySet(Boolean emergencySet) {
        this.emergencySet = emergencySet;
    }

    public Boolean getConfirmSet() {
        return confirmSet;
    }

    public void setConfirmSet(Boolean confirmSet) {
        this.confirmSet = confirmSet;
    }
}