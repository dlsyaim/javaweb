package com.ks.monitor.pojo;

public class DmIoClusterSharedDrives {
    private String driveName;

    public String getDriveName() {
        return driveName;
    }

    public void setDriveName(String driveName) {
        this.driveName = driveName == null ? null : driveName.trim();
    }
}