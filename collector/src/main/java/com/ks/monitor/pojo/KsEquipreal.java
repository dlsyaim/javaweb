package com.ks.monitor.pojo;

import java.util.Date;

public class KsEquipreal {
    private Integer ID;

    private Long equipMentID;

    private Integer DPrcArrID;

    private Double fieldValue;

    private Date colTime;

    private Boolean flagShow;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Long getEquipMentID() {
        return equipMentID;
    }

    public void setEquipMentID(Long equipMentID) {
        this.equipMentID = equipMentID;
    }

    public Integer getDPrcArrID() {
        return DPrcArrID;
    }

    public void setDPrcArrID(Integer DPrcArrID) {
        this.DPrcArrID = DPrcArrID;
    }

    public Double getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(Double fieldValue) {
        this.fieldValue = fieldValue;
    }

    public Date getColTime() {
        return colTime;
    }

    public void setColTime(Date colTime) {
        this.colTime = colTime;
    }

    public Boolean getFlagShow() {
        return flagShow;
    }

    public void setFlagShow(Boolean flagShow) {
        this.flagShow = flagShow;
    }
}