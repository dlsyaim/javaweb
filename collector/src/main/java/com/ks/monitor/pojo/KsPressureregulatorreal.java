package com.ks.monitor.pojo;

import java.util.Date;

public class KsPressureregulatorreal {
    private Long pressureRegulatorRealId;

    private Long equipmentId;

    private Date realTime;

    private Double position;

    public Long getPressureRegulatorRealId() {
        return pressureRegulatorRealId;
    }

    public void setPressureRegulatorRealId(Long pressureRegulatorRealId) {
        this.pressureRegulatorRealId = pressureRegulatorRealId;
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

    public Double getPosition() {
        return position;
    }

    public void setPosition(Double position) {
        this.position = position;
    }
}