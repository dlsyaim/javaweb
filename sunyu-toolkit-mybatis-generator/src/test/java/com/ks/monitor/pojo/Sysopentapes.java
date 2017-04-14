package com.ks.monitor.pojo;

public class Sysopentapes {
    private String openTape;

    public String getOpenTape() {
        return openTape;
    }

    public void setOpenTape(String openTape) {
        this.openTape = openTape == null ? null : openTape.trim();
    }
}