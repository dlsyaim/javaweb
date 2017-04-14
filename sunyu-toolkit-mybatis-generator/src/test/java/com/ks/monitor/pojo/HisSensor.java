package com.ks.monitor.pojo;

import java.util.Date;

public class HisSensor {
    private Integer ID;

    private String name;

    private String itemNo;

    private Integer logicalStationID;

    private Integer sensorTypeID;

    private String decodeFunc;

    private String transForm;

    private String channel;

    private Integer orderID;

    private Integer parentSensorID;

    private Double alarmMinValue;

    private Double alarmMaxValue;

    private Boolean isDelete;

    private String preCode;

    private String endCode;

    private Double amplify;

    private Date modified_date;

    private Date created_date;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }

    public Integer getLogicalStationID() {
        return logicalStationID;
    }

    public void setLogicalStationID(Integer logicalStationID) {
        this.logicalStationID = logicalStationID;
    }

    public Integer getSensorTypeID() {
        return sensorTypeID;
    }

    public void setSensorTypeID(Integer sensorTypeID) {
        this.sensorTypeID = sensorTypeID;
    }

    public String getDecodeFunc() {
        return decodeFunc;
    }

    public void setDecodeFunc(String decodeFunc) {
        this.decodeFunc = decodeFunc == null ? null : decodeFunc.trim();
    }

    public String getTransForm() {
        return transForm;
    }

    public void setTransForm(String transForm) {
        this.transForm = transForm == null ? null : transForm.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getParentSensorID() {
        return parentSensorID;
    }

    public void setParentSensorID(Integer parentSensorID) {
        this.parentSensorID = parentSensorID;
    }

    public Double getAlarmMinValue() {
        return alarmMinValue;
    }

    public void setAlarmMinValue(Double alarmMinValue) {
        this.alarmMinValue = alarmMinValue;
    }

    public Double getAlarmMaxValue() {
        return alarmMaxValue;
    }

    public void setAlarmMaxValue(Double alarmMaxValue) {
        this.alarmMaxValue = alarmMaxValue;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getPreCode() {
        return preCode;
    }

    public void setPreCode(String preCode) {
        this.preCode = preCode == null ? null : preCode.trim();
    }

    public String getEndCode() {
        return endCode;
    }

    public void setEndCode(String endCode) {
        this.endCode = endCode == null ? null : endCode.trim();
    }

    public Double getAmplify() {
        return amplify;
    }

    public void setAmplify(Double amplify) {
        this.amplify = amplify;
    }

    public Date getModified_date() {
        return modified_date;
    }

    public void setModified_date(Date modified_date) {
        this.modified_date = modified_date;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }
}