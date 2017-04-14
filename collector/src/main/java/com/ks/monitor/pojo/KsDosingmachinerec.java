package com.ks.monitor.pojo;

import java.util.Date;

public class KsDosingmachinerec {
    private Long dosingMachineRecId;

    private Long equipmentId;

    private Date recTime;

    private Boolean manual;

    private Boolean pump1RunSet;

    private Boolean pump2RunSet;

    private Boolean setConfirm;

    private Double manualQb;

    private Boolean pump1DosingState;

    private Boolean pump2DosingState;

    public Long getDosingMachineRecId() {
        return dosingMachineRecId;
    }

    public void setDosingMachineRecId(Long dosingMachineRecId) {
        this.dosingMachineRecId = dosingMachineRecId;
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

    public Boolean getManual() {
        return manual;
    }

    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    public Boolean getPump1RunSet() {
        return pump1RunSet;
    }

    public void setPump1RunSet(Boolean pump1RunSet) {
        this.pump1RunSet = pump1RunSet;
    }

    public Boolean getPump2RunSet() {
        return pump2RunSet;
    }

    public void setPump2RunSet(Boolean pump2RunSet) {
        this.pump2RunSet = pump2RunSet;
    }

    public Boolean getSetConfirm() {
        return setConfirm;
    }

    public void setSetConfirm(Boolean setConfirm) {
        this.setConfirm = setConfirm;
    }

    public Double getManualQb() {
        return manualQb;
    }

    public void setManualQb(Double manualQb) {
        this.manualQb = manualQb;
    }

    public Boolean getPump1DosingState() {
        return pump1DosingState;
    }

    public void setPump1DosingState(Boolean pump1DosingState) {
        this.pump1DosingState = pump1DosingState;
    }

    public Boolean getPump2DosingState() {
        return pump2DosingState;
    }

    public void setPump2DosingState(Boolean pump2DosingState) {
        this.pump2DosingState = pump2DosingState;
    }
}