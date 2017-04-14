package com.ks.monitor.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class KsSalerac {
    private Long saleID;

    private String aeratedID;

    private Long machineID;

    private BigDecimal addVolume;

    private Integer money;

    private BigDecimal unitPrice;

    private String gasType;

    private BigDecimal cumulative;

    private String employees;

    private String userCardNumber;

    private Date colTime;

    private Date addTime;

    private Short status;

    public Long getSaleID() {
        return saleID;
    }

    public void setSaleID(Long saleID) {
        this.saleID = saleID;
    }

    public String getAeratedID() {
        return aeratedID;
    }

    public void setAeratedID(String aeratedID) {
        this.aeratedID = aeratedID == null ? null : aeratedID.trim();
    }

    public Long getMachineID() {
        return machineID;
    }

    public void setMachineID(Long machineID) {
        this.machineID = machineID;
    }

    public BigDecimal getAddVolume() {
        return addVolume;
    }

    public void setAddVolume(BigDecimal addVolume) {
        this.addVolume = addVolume;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getGasType() {
        return gasType;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType == null ? null : gasType.trim();
    }

    public BigDecimal getCumulative() {
        return cumulative;
    }

    public void setCumulative(BigDecimal cumulative) {
        this.cumulative = cumulative;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees == null ? null : employees.trim();
    }

    public String getUserCardNumber() {
        return userCardNumber;
    }

    public void setUserCardNumber(String userCardNumber) {
        this.userCardNumber = userCardNumber == null ? null : userCardNumber.trim();
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