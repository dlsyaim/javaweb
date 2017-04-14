package com.ks.monitor.pojo;

import java.util.Date;

public class KsPrcarrRelations {
    private Long relID;

    private Long productID;

    private Long attrID;

    private String attrName;

    private Long attrValID;

    private String attrValName;

    private Date addTime;

    private Short status;

    public Long getRelID() {
        return relID;
    }

    public void setRelID(Long relID) {
        this.relID = relID;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public Long getAttrID() {
        return attrID;
    }

    public void setAttrID(Long attrID) {
        this.attrID = attrID;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }

    public Long getAttrValID() {
        return attrValID;
    }

    public void setAttrValID(Long attrValID) {
        this.attrValID = attrValID;
    }

    public String getAttrValName() {
        return attrValName;
    }

    public void setAttrValName(String attrValName) {
        this.attrValName = attrValName == null ? null : attrValName.trim();
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