package com.ks.monitor.pojo;

import java.util.Date;

public class KsTableaddress {
    private Long tableAddressID;

    private String tableAddressName;

    private Long managerID;

    private Date addTime;

    private Short status;

    public Long getTableAddressID() {
        return tableAddressID;
    }

    public void setTableAddressID(Long tableAddressID) {
        this.tableAddressID = tableAddressID;
    }

    public String getTableAddressName() {
        return tableAddressName;
    }

    public void setTableAddressName(String tableAddressName) {
        this.tableAddressName = tableAddressName == null ? null : tableAddressName.trim();
    }

    public Long getManagerID() {
        return managerID;
    }

    public void setManagerID(Long managerID) {
        this.managerID = managerID;
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