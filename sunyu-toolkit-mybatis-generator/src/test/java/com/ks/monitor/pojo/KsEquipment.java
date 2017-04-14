package com.ks.monitor.pojo;

import java.util.Date;

public class KsEquipment {
    private Long equipMentID;

    private String ramCode;

    private String equipMentName;

    private Long productID;

    private Long siteID;

    private Long userNatureID;

    private Long inTableID;

    private Long rtuID;

    private Long agreeMentID;

    private Long dtuID;

    private Long interFaceID;

    private Long managerID;

    private Long associatedEID;

    private String flowRange;

    private Double addValue;

    private Date addTime;

    private Short status;

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

    public String getEquipMentName() {
        return equipMentName;
    }

    public void setEquipMentName(String equipMentName) {
        this.equipMentName = equipMentName == null ? null : equipMentName.trim();
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public Long getSiteID() {
        return siteID;
    }

    public void setSiteID(Long siteID) {
        this.siteID = siteID;
    }

    public Long getUserNatureID() {
        return userNatureID;
    }

    public void setUserNatureID(Long userNatureID) {
        this.userNatureID = userNatureID;
    }

    public Long getInTableID() {
        return inTableID;
    }

    public void setInTableID(Long inTableID) {
        this.inTableID = inTableID;
    }

    public Long getRtuID() {
        return rtuID;
    }

    public void setRtuID(Long rtuID) {
        this.rtuID = rtuID;
    }

    public Long getAgreeMentID() {
        return agreeMentID;
    }

    public void setAgreeMentID(Long agreeMentID) {
        this.agreeMentID = agreeMentID;
    }

    public Long getDtuID() {
        return dtuID;
    }

    public void setDtuID(Long dtuID) {
        this.dtuID = dtuID;
    }

    public Long getInterFaceID() {
        return interFaceID;
    }

    public void setInterFaceID(Long interFaceID) {
        this.interFaceID = interFaceID;
    }

    public Long getManagerID() {
        return managerID;
    }

    public void setManagerID(Long managerID) {
        this.managerID = managerID;
    }

    public Long getAssociatedEID() {
        return associatedEID;
    }

    public void setAssociatedEID(Long associatedEID) {
        this.associatedEID = associatedEID;
    }

    public String getFlowRange() {
        return flowRange;
    }

    public void setFlowRange(String flowRange) {
        this.flowRange = flowRange == null ? null : flowRange.trim();
    }

    public Double getAddValue() {
        return addValue;
    }

    public void setAddValue(Double addValue) {
        this.addValue = addValue;
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