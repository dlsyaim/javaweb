package com.ks.monitor.pojo;

public class TmpKsBrand {
    private Long brandID;

    private String brandName;

    private String brandLogo;

    private String briefnItroduction;

    public Long getBrandID() {
        return brandID;
    }

    public void setBrandID(Long brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo == null ? null : brandLogo.trim();
    }

    public String getBriefnItroduction() {
        return briefnItroduction;
    }

    public void setBriefnItroduction(String briefnItroduction) {
        this.briefnItroduction = briefnItroduction == null ? null : briefnItroduction.trim();
    }
}