package com.ks.monitor.pojo;

import java.util.Date;

public class KsProduct {
    private Long productID;

    private Long brandID;

    private Long classID;

    private String PModel;

    private Long managerID;

    private Date addTime;

    private Short status;

    private String productLogo;

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public Long getBrandID() {
        return brandID;
    }

    public void setBrandID(Long brandID) {
        this.brandID = brandID;
    }

    public Long getClassID() {
        return classID;
    }

    public void setClassID(Long classID) {
        this.classID = classID;
    }

    public String getPModel() {
        return PModel;
    }

    public void setPModel(String PModel) {
        this.PModel = PModel == null ? null : PModel.trim();
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

    public String getProductLogo() {
        return productLogo;
    }

    public void setProductLogo(String productLogo) {
        this.productLogo = productLogo == null ? null : productLogo.trim();
    }
}