package com.ks.monitor.pojo;

import java.util.Date;

public class KsBlazerec {
    private Long blazeRecId;

    private Long equipmentId;

    private Date recTime;

    private Double blaze;

    public Long getBlazeRecId() {
        return blazeRecId;
    }

    public void setBlazeRecId(Long blazeRecId) {
        this.blazeRecId = blazeRecId;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Date getRecTime() {
        return recTime;
    }

    public void setRecTime(Date recTime) {
        this.recTime = recTime;
    }

    public Double getBlaze() {
        return blaze;
    }

    public void setBlaze(Double blaze) {
        this.blaze = blaze;
    }
}