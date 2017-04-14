package com.ks.monitor.pojo;

import java.util.Date;

public class HisSensordatarecord {
    private Integer ID;

    private Integer logicalStationID;

    private Double gas;

    private Double sensor;

    private Double waterLevel;

    private Double battery;

    private Date DLastTime;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getLogicalStationID() {
        return logicalStationID;
    }

    public void setLogicalStationID(Integer logicalStationID) {
        this.logicalStationID = logicalStationID;
    }

    public Double getGas() {
        return gas;
    }

    public void setGas(Double gas) {
        this.gas = gas;
    }

    public Double getSensor() {
        return sensor;
    }

    public void setSensor(Double sensor) {
        this.sensor = sensor;
    }

    public Double getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(Double waterLevel) {
        this.waterLevel = waterLevel;
    }

    public Double getBattery() {
        return battery;
    }

    public void setBattery(Double battery) {
        this.battery = battery;
    }

    public Date getDLastTime() {
        return DLastTime;
    }

    public void setDLastTime(Date DLastTime) {
        this.DLastTime = DLastTime;
    }
}