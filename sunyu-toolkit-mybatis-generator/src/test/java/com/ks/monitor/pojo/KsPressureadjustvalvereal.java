package com.ks.monitor.pojo;

import java.util.Date;

public class KsPressureadjustvalvereal {
    private Long pressureAdjustValveRealId;

    private Long equipmentId;

    private Date realTime;

    private Double pressure;

    private Double position;

    private Boolean fault;

    private Boolean local;

    private Boolean pressureOrPosition;

    private Double pressureSet;

    private Double positionSet;

    private Boolean pressureOrPositionSet;

    private Boolean confirmSet;

    public Long getPressureAdjustValveRealId() {
        return pressureAdjustValveRealId;
    }

    public void setPressureAdjustValveRealId(Long pressureAdjustValveRealId) {
        this.pressureAdjustValveRealId = pressureAdjustValveRealId;
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

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getPosition() {
        return position;
    }

    public void setPosition(Double position) {
        this.position = position;
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

    public Boolean getPressureOrPosition() {
        return pressureOrPosition;
    }

    public void setPressureOrPosition(Boolean pressureOrPosition) {
        this.pressureOrPosition = pressureOrPosition;
    }

    public Double getPressureSet() {
        return pressureSet;
    }

    public void setPressureSet(Double pressureSet) {
        this.pressureSet = pressureSet;
    }

    public Double getPositionSet() {
        return positionSet;
    }

    public void setPositionSet(Double positionSet) {
        this.positionSet = positionSet;
    }

    public Boolean getPressureOrPositionSet() {
        return pressureOrPositionSet;
    }

    public void setPressureOrPositionSet(Boolean pressureOrPositionSet) {
        this.pressureOrPositionSet = pressureOrPositionSet;
    }

    public Boolean getConfirmSet() {
        return confirmSet;
    }

    public void setConfirmSet(Boolean confirmSet) {
        this.confirmSet = confirmSet;
    }
}