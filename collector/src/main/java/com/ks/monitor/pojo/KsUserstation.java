package com.ks.monitor.pojo;

public class KsUserstation {
    private Integer ID;

    private String name;

    private String ramCode;

    private Integer warnType;

    private byte[] geom;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRamCode() {
        return ramCode;
    }

    public void setRamCode(String ramCode) {
        this.ramCode = ramCode == null ? null : ramCode.trim();
    }

    public Integer getWarnType() {
        return warnType;
    }

    public void setWarnType(Integer warnType) {
        this.warnType = warnType;
    }

    public byte[] getGeom() {
        return geom;
    }

    public void setGeom(byte[] geom) {
        this.geom = geom;
    }
}