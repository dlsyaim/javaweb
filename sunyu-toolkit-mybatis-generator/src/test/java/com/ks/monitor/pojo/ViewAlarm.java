package com.ks.monitor.pojo;

import java.util.Date;

public class ViewAlarm {
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

    private Double staLLowLimit;

    private Double staLowLimit;

    private Double staHHighLimit;

    private Double staHighLimit;

    private Double worLLowLimit;

    private Double worLowLimit;

    private Double worHighLimit;

    private Double worHHighLimit;

    private Double temLLowLimit;

    private Double temLowLimit;

    private Double temHighLimit;

    private Double temHHighLimit;

    private Double cnsLLowLimit;

    private Double cnsLowLimit;

    private Double cnsHighLimit;

    private Double cnsHHighLimit;

    private Double preLLowLimit;

    private Double preLowLimit;

    private Double preHighLimit;

    private Double preHHighLimit;

    private Short status;

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

    public Double getStaLLowLimit() {
        return staLLowLimit;
    }

    public void setStaLLowLimit(Double staLLowLimit) {
        this.staLLowLimit = staLLowLimit;
    }

    public Double getStaLowLimit() {
        return staLowLimit;
    }

    public void setStaLowLimit(Double staLowLimit) {
        this.staLowLimit = staLowLimit;
    }

    public Double getStaHHighLimit() {
        return staHHighLimit;
    }

    public void setStaHHighLimit(Double staHHighLimit) {
        this.staHHighLimit = staHHighLimit;
    }

    public Double getStaHighLimit() {
        return staHighLimit;
    }

    public void setStaHighLimit(Double staHighLimit) {
        this.staHighLimit = staHighLimit;
    }

    public Double getWorLLowLimit() {
        return worLLowLimit;
    }

    public void setWorLLowLimit(Double worLLowLimit) {
        this.worLLowLimit = worLLowLimit;
    }

    public Double getWorLowLimit() {
        return worLowLimit;
    }

    public void setWorLowLimit(Double worLowLimit) {
        this.worLowLimit = worLowLimit;
    }

    public Double getWorHighLimit() {
        return worHighLimit;
    }

    public void setWorHighLimit(Double worHighLimit) {
        this.worHighLimit = worHighLimit;
    }

    public Double getWorHHighLimit() {
        return worHHighLimit;
    }

    public void setWorHHighLimit(Double worHHighLimit) {
        this.worHHighLimit = worHHighLimit;
    }

    public Double getTemLLowLimit() {
        return temLLowLimit;
    }

    public void setTemLLowLimit(Double temLLowLimit) {
        this.temLLowLimit = temLLowLimit;
    }

    public Double getTemLowLimit() {
        return temLowLimit;
    }

    public void setTemLowLimit(Double temLowLimit) {
        this.temLowLimit = temLowLimit;
    }

    public Double getTemHighLimit() {
        return temHighLimit;
    }

    public void setTemHighLimit(Double temHighLimit) {
        this.temHighLimit = temHighLimit;
    }

    public Double getTemHHighLimit() {
        return temHHighLimit;
    }

    public void setTemHHighLimit(Double temHHighLimit) {
        this.temHHighLimit = temHHighLimit;
    }

    public Double getCnsLLowLimit() {
        return cnsLLowLimit;
    }

    public void setCnsLLowLimit(Double cnsLLowLimit) {
        this.cnsLLowLimit = cnsLLowLimit;
    }

    public Double getCnsLowLimit() {
        return cnsLowLimit;
    }

    public void setCnsLowLimit(Double cnsLowLimit) {
        this.cnsLowLimit = cnsLowLimit;
    }

    public Double getCnsHighLimit() {
        return cnsHighLimit;
    }

    public void setCnsHighLimit(Double cnsHighLimit) {
        this.cnsHighLimit = cnsHighLimit;
    }

    public Double getCnsHHighLimit() {
        return cnsHHighLimit;
    }

    public void setCnsHHighLimit(Double cnsHHighLimit) {
        this.cnsHHighLimit = cnsHHighLimit;
    }

    public Double getPreLLowLimit() {
        return preLLowLimit;
    }

    public void setPreLLowLimit(Double preLLowLimit) {
        this.preLLowLimit = preLLowLimit;
    }

    public Double getPreLowLimit() {
        return preLowLimit;
    }

    public void setPreLowLimit(Double preLowLimit) {
        this.preLowLimit = preLowLimit;
    }

    public Double getPreHighLimit() {
        return preHighLimit;
    }

    public void setPreHighLimit(Double preHighLimit) {
        this.preHighLimit = preHighLimit;
    }

    public Double getPreHHighLimit() {
        return preHHighLimit;
    }

    public void setPreHHighLimit(Double preHHighLimit) {
        this.preHHighLimit = preHHighLimit;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}