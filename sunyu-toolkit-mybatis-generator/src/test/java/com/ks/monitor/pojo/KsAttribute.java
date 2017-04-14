package com.ks.monitor.pojo;

import java.util.Date;

public class KsAttribute {
    private Long attrID;

    private Long classID;

    private String attrName;

    private String fieldName;

    private Integer inputType;

    private Integer valueType;

    private Integer valueLength;

    private Long orderby;

    private Short isSearch;

    private Date addTime;

    private Short status;

    public Long getAttrID() {
        return attrID;
    }

    public void setAttrID(Long attrID) {
        this.attrID = attrID;
    }

    public Long getClassID() {
        return classID;
    }

    public void setClassID(Long classID) {
        this.classID = classID;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }

    public Integer getInputType() {
        return inputType;
    }

    public void setInputType(Integer inputType) {
        this.inputType = inputType;
    }

    public Integer getValueType() {
        return valueType;
    }

    public void setValueType(Integer valueType) {
        this.valueType = valueType;
    }

    public Integer getValueLength() {
        return valueLength;
    }

    public void setValueLength(Integer valueLength) {
        this.valueLength = valueLength;
    }

    public Long getOrderby() {
        return orderby;
    }

    public void setOrderby(Long orderby) {
        this.orderby = orderby;
    }

    public Short getIsSearch() {
        return isSearch;
    }

    public void setIsSearch(Short isSearch) {
        this.isSearch = isSearch;
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