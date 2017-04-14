package com.ks.monitor.pojo;

public class SyssqlguidesWithBLOBs extends Syssqlguides {
    private byte[] hash;

    private String batchtext;

    private String paramorhinttext;

    public byte[] getHash() {
        return hash;
    }

    public void setHash(byte[] hash) {
        this.hash = hash;
    }

    public String getBatchtext() {
        return batchtext;
    }

    public void setBatchtext(String batchtext) {
        this.batchtext = batchtext == null ? null : batchtext.trim();
    }

    public String getParamorhinttext() {
        return paramorhinttext;
    }

    public void setParamorhinttext(String paramorhinttext) {
        this.paramorhinttext = paramorhinttext == null ? null : paramorhinttext.trim();
    }
}