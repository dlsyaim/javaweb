package com.ks.monitor.pojo;

public class KsDistrictsUsed {
    private Integer ID;

    private Long districtID;

    private String districtName;

    private Long cityID;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Long getDistrictID() {
        return districtID;
    }

    public void setDistrictID(Long districtID) {
        this.districtID = districtID;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName == null ? null : districtName.trim();
    }

    public Long getCityID() {
        return cityID;
    }

    public void setCityID(Long cityID) {
        this.cityID = cityID;
    }
}