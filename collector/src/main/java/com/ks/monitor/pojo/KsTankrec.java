package com.ks.monitor.pojo;

import java.util.Date;

public class KsTankrec {
    private Long tankRecID;

    private Long equipMentID;

    private String ramCode;

    private Double volume;

    private Double mass;

    private Double pressure;

    private Double tankLevel;

    private Double saturationPressure;

    private Double tankLevelMinSet;

    private Double tankLevelMaxSet;

    private Double saturationPressureSet;

    private Short electric;

    private Short door;

    private Date colTime;

    private Date addTime;

    private Short status;

    public Long getTankRecID() {
        return tankRecID;
    }

    public void setTankRecID(Long tankRecID) {
        this.tankRecID = tankRecID;
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

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getTankLevel() {
        return tankLevel;
    }

    public void setTankLevel(Double tankLevel) {
        this.tankLevel = tankLevel;
    }

    public Double getSaturationPressure() {
        return saturationPressure;
    }

    public void setSaturationPressure(Double saturationPressure) {
        this.saturationPressure = saturationPressure;
    }

    public Double getTankLevelMinSet() {
        return tankLevelMinSet;
    }

    public void setTankLevelMinSet(Double tankLevelMinSet) {
        this.tankLevelMinSet = tankLevelMinSet;
    }

    public Double getTankLevelMaxSet() {
        return tankLevelMaxSet;
    }

    public void setTankLevelMaxSet(Double tankLevelMaxSet) {
        this.tankLevelMaxSet = tankLevelMaxSet;
    }

    public Double getSaturationPressureSet() {
        return saturationPressureSet;
    }

    public void setSaturationPressureSet(Double saturationPressureSet) {
        this.saturationPressureSet = saturationPressureSet;
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