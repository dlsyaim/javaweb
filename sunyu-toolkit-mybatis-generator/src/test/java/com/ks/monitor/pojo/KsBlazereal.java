package com.ks.monitor.pojo;

import java.util.Date;

public class KsBlazereal {
    private Long blazeRealId;

    private Long equipmentId;

    private Date realTime;

    private Double blaze;

    public Long getBlazeRealId() {
        return blazeRealId;
    }

    public void setBlazeRealId(Long blazeRealId) {
        this.blazeRealId = blazeRealId;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Date getRealTime() {
        return realTime;
    }

    public void setRealTime(Date realTime) {
        this.realTime = realTime;
    }

    public Double getBlaze() {
        return blaze;
    }

    public void setBlaze(Double blaze) {
        this.blaze = blaze;
    }
}