package com.ks.monitor.pojo;

import java.util.Date;

public class ViewKsDatarecord {
    private Long recID;

    private Long equipMentID;

    private String ramCode;

    private Double staRecCumAmt;

    private Double staRecInsCumAmt;

    private Double worRecCumAmt;

    private Double worRecInsCumAmt;

    private Double recPressure;

    private Double recTemperature;

    private Double recConcentration;

    private Date colTime;

    private Date addTime;

    private Short status;

    public Long getRecID() {
        return recID;
    }

    public void setRecID(Long recID) {
        this.recID = recID;
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

    public Double getStaRecCumAmt() {
        return staRecCumAmt;
    }

    public void setStaRecCumAmt(Double staRecCumAmt) {
        this.staRecCumAmt = staRecCumAmt;
    }

    public Double getStaRecInsCumAmt() {
        return staRecInsCumAmt;
    }

    public void setStaRecInsCumAmt(Double staRecInsCumAmt) {
        this.staRecInsCumAmt = staRecInsCumAmt;
    }

    public Double getWorRecCumAmt() {
        return worRecCumAmt;
    }

    public void setWorRecCumAmt(Double worRecCumAmt) {
        this.worRecCumAmt = worRecCumAmt;
    }

    public Double getWorRecInsCumAmt() {
        return worRecInsCumAmt;
    }

    public void setWorRecInsCumAmt(Double worRecInsCumAmt) {
        this.worRecInsCumAmt = worRecInsCumAmt;
    }

    public Double getRecPressure() {
        return recPressure;
    }

    public void setRecPressure(Double recPressure) {
        this.recPressure = recPressure;
    }

    public Double getRecTemperature() {
        return recTemperature;
    }

    public void setRecTemperature(Double recTemperature) {
        this.recTemperature = recTemperature;
    }

    public Double getRecConcentration() {
        return recConcentration;
    }

    public void setRecConcentration(Double recConcentration) {
        this.recConcentration = recConcentration;
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