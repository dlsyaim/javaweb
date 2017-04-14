package com.ks.monitor.pojo;

import java.util.Date;

public class KsElectricheatreal {
    private Long electricHeatRealId;

    private Long equipmentId;

    private Date realTime;

    private Boolean manual;

    private Boolean electricHeatRunSet;

    private Boolean setConfirm;

    private Double autoTemperatureLowSet;

    private Double autoTemperatureHiSet;

    private Boolean electricHeatHeatState;

    public Long getElectricHeatRealId() {
        return electricHeatRealId;
    }

    public void setElectricHeatRealId(Long electricHeatRealId) {
        this.electricHeatRealId = electricHeatRealId;
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

    public Boolean getElectricHeatRunSet() {
        return electricHeatRunSet;
    }

    public void setElectricHeatRunSet(Boolean electricHeatRunSet) {
        this.electricHeatRunSet = electricHeatRunSet;
    }

    public Boolean getSetConfirm() {
        return setConfirm;
    }

    public void setSetConfirm(Boolean setConfirm) {
        this.setConfirm = setConfirm;
    }

    public Double getAutoTemperatureLowSet() {
        return autoTemperatureLowSet;
    }

    public void setAutoTemperatureLowSet(Double autoTemperatureLowSet) {
        this.autoTemperatureLowSet = autoTemperatureLowSet;
    }

    public Double getAutoTemperatureHiSet() {
        return autoTemperatureHiSet;
    }

    public void setAutoTemperatureHiSet(Double autoTemperatureHiSet) {
        this.autoTemperatureHiSet = autoTemperatureHiSet;
    }

    public Boolean getElectricHeatHeatState() {
        return electricHeatHeatState;
    }

    public void setElectricHeatHeatState(Boolean electricHeatHeatState) {
        this.electricHeatHeatState = electricHeatHeatState;
    }
}