package com.ks.monitor.pojo;

import java.util.Date;

public class KsAttrivalue {
    private Long attrValID;

    private Long attrID;

    private String attValName;

    private Date addTime;

    private Short status;

    public Long getAttrValID() {
        return attrValID;
    }

    public void setAttrValID(Long attrValID) {
        this.attrValID = attrValID;
    }

    public Long getAttrID() {
        return attrID;
    }

    public void setAttrID(Long attrID) {
        this.attrID = attrID;
    }

    public String getAttValName() {
        return attValName;
    }

    public void setAttValName(String attValName) {
        this.attValName = attValName == null ? null : attValName.trim();
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