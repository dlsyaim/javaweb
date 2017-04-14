package com.ks.monitor.pojo;

import java.util.Date;

public class KsAlarmlimit {
    private Long alarmID;

    private Long equipMentID;

    private String ramCode;

    private Double staLLowLimit;

    private Double staLowLimit;

    private Double staHighLimit;

    private Double staHHighLimit;

    private Double worLLowLimit;

    private Double worLowLimit;

    private Double worHighLimit;

    private Double worHHighLimit;

    private Double temLLowLimit;

    private Double temLowLimit;

    private Double temHighLimit;

    private Double temHHighLimit;

    private Double cnsHighLimit;

    private Double cnsHHighLimit;

    private Double preLLowLimit;

    private Double preLowLimit;

    private Double preHighLimit;

    private Double preHHighLimit;

    private Date addTime;

    private Short status;

    public Long getAlarmID() {
        return alarmID;
    }

    public void setAlarmID(Long alarmID) {
        this.alarmID = alarmID;
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

    public Double getStaHighLimit() {
        return staHighLimit;
    }

    public void setStaHighLimit(Double staHighLimit) {
        this.staHighLimit = staHighLimit;
    }

    public Double getStaHHighLimit() {
        return staHHighLimit;
    }

    public void setStaHHighLimit(Double staHHighLimit) {
        this.staHHighLimit = staHHighLimit;
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