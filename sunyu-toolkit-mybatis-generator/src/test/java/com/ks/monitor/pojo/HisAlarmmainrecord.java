package com.ks.monitor.pojo;

import java.util.Date;

public class HisAlarmmainrecord {
    private String ID;

    private Integer sensorID;

    private Integer alarmProjectID;

    private Integer alarmDefinitionID;

    private Date startTime;

    private Date lastTime;

    private Date recover_date;

    private Boolean recover_flag;

    private Double sensorValue;

    private Double limitValue;

    private Integer repeatCount;

    private Integer touchCount;

    private String alarmMsg;

    private String DESC;

    private Date modified_date;

    private Date created_date;

    private Boolean isSend;

    private byte[] rowversion;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    public Integer getSensorID() {
        return sensorID;
    }

    public void setSensorID(Integer sensorID) {
        this.sensorID = sensorID;
    }

    public Integer getAlarmProjectID() {
        return alarmProjectID;
    }

    public void setAlarmProjectID(Integer alarmProjectID) {
        this.alarmProjectID = alarmProjectID;
    }

    public Integer getAlarmDefinitionID() {
        return alarmDefinitionID;
    }

    public void setAlarmDefinitionID(Integer alarmDefinitionID) {
        this.alarmDefinitionID = alarmDefinitionID;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public Date getRecover_date() {
        return recover_date;
    }

    public void setRecover_date(Date recover_date) {
        this.recover_date = recover_date;
    }

    public Boolean getRecover_flag() {
        return recover_flag;
    }

    public void setRecover_flag(Boolean recover_flag) {
        this.recover_flag = recover_flag;
    }

    public Double getSensorValue() {
        return sensorValue;
    }

    public void setSensorValue(Double sensorValue) {
        this.sensorValue = sensorValue;
    }

    public Double getLimitValue() {
        return limitValue;
    }

    public void setLimitValue(Double limitValue) {
        this.limitValue = limitValue;
    }

    public Integer getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(Integer repeatCount) {
        this.repeatCount = repeatCount;
    }

    public Integer getTouchCount() {
        return touchCount;
    }

    public void setTouchCount(Integer touchCount) {
        this.touchCount = touchCount;
    }

    public String getAlarmMsg() {
        return alarmMsg;
    }

    public void setAlarmMsg(String alarmMsg) {
        this.alarmMsg = alarmMsg == null ? null : alarmMsg.trim();
    }

    public String getDESC() {
        return DESC;
    }

    public void setDESC(String DESC) {
        this.DESC = DESC == null ? null : DESC.trim();
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

    public Boolean getIsSend() {
        return isSend;
    }

    public void setIsSend(Boolean isSend) {
        this.isSend = isSend;
    }

    public byte[] getRowversion() {
        return rowversion;
    }

    public void setRowversion(byte[] rowversion) {
        this.rowversion = rowversion;
    }
}