package com.ks.monitor.pojo;

import java.util.Date;

public class HisSensorreal {
    private Integer sensorID;

    private Integer logicalStationID;

    private String name;

    private Integer sensorTypeID;

    private String sourceType;

    private Integer alarmFlag;

    private Integer dataQuality;

    private Double yestodayValue;

    private Double DFirstValue;

    private Date DFirstTime;

    private Double DLastValue;

    private Date DLastTime;

    private Double DMinValue;

    private Date DMinTime;

    private Double DMaxValue;

    private Date DMaxTime;

    private Double DValue;

    private Date created_date;

    private Date modified_date;

    private byte[] rowversion;

    public Integer getSensorID() {
        return sensorID;
    }

    public void setSensorID(Integer sensorID) {
        this.sensorID = sensorID;
    }

    public Integer getLogicalStationID() {
        return logicalStationID;
    }

    public void setLogicalStationID(Integer logicalStationID) {
        this.logicalStationID = logicalStationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSensorTypeID() {
        return sensorTypeID;
    }

    public void setSensorTypeID(Integer sensorTypeID) {
        this.sensorTypeID = sensorTypeID;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
    }

    public Integer getAlarmFlag() {
        return alarmFlag;
    }

    public void setAlarmFlag(Integer alarmFlag) {
        this.alarmFlag = alarmFlag;
    }

    public Integer getDataQuality() {
        return dataQuality;
    }

    public void setDataQuality(Integer dataQuality) {
        this.dataQuality = dataQuality;
    }

    public Double getYestodayValue() {
        return yestodayValue;
    }

    public void setYestodayValue(Double yestodayValue) {
        this.yestodayValue = yestodayValue;
    }

    public Double getDFirstValue() {
        return DFirstValue;
    }

    public void setDFirstValue(Double DFirstValue) {
        this.DFirstValue = DFirstValue;
    }

    public Date getDFirstTime() {
        return DFirstTime;
    }

    public void setDFirstTime(Date DFirstTime) {
        this.DFirstTime = DFirstTime;
    }

    public Double getDLastValue() {
        return DLastValue;
    }

    public void setDLastValue(Double DLastValue) {
        this.DLastValue = DLastValue;
    }

    public Date getDLastTime() {
        return DLastTime;
    }

    public void setDLastTime(Date DLastTime) {
        this.DLastTime = DLastTime;
    }

    public Double getDMinValue() {
        return DMinValue;
    }

    public void setDMinValue(Double DMinValue) {
        this.DMinValue = DMinValue;
    }

    public Date getDMinTime() {
        return DMinTime;
    }

    public void setDMinTime(Date DMinTime) {
        this.DMinTime = DMinTime;
    }

    public Double getDMaxValue() {
        return DMaxValue;
    }

    public void setDMaxValue(Double DMaxValue) {
        this.DMaxValue = DMaxValue;
    }

    public Date getDMaxTime() {
        return DMaxTime;
    }

    public void setDMaxTime(Date DMaxTime) {
        this.DMaxTime = DMaxTime;
    }

    public Double getDValue() {
        return DValue;
    }

    public void setDValue(Double DValue) {
        this.DValue = DValue;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getModified_date() {
        return modified_date;
    }

    public void setModified_date(Date modified_date) {
        this.modified_date = modified_date;
    }

    public byte[] getRowversion() {
        return rowversion;
    }

    public void setRowversion(byte[] rowversion) {
        this.rowversion = rowversion;
    }
}