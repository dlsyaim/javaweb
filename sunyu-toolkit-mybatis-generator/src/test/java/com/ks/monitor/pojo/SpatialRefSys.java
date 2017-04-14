package com.ks.monitor.pojo;

public class SpatialRefSys {
    private Integer srid;

    private String auth_name;

    private Integer auth_srid;

    private String srtext;

    private String proj4text;

    public Integer getSrid() {
        return srid;
    }

    public void setSrid(Integer srid) {
        this.srid = srid;
    }

    public String getAuth_name() {
        return auth_name;
    }

    public void setAuth_name(String auth_name) {
        this.auth_name = auth_name == null ? null : auth_name.trim();
    }

    public Integer getAuth_srid() {
        return auth_srid;
    }

    public void setAuth_srid(Integer auth_srid) {
        this.auth_srid = auth_srid;
    }

    public String getSrtext() {
        return srtext;
    }

    public void setSrtext(String srtext) {
        this.srtext = srtext == null ? null : srtext.trim();
    }

    public String getProj4text() {
        return proj4text;
    }

    public void setProj4text(String proj4text) {
        this.proj4text = proj4text == null ? null : proj4text.trim();
    }
}