package com.ks.monitor.pojo;

import java.util.Date;

public class KsDprcarrRelations {
    private Long relID;

    private Long equipMentID;

    private Long attrID;

    private Date addTime;

    private Short status;

    public Long getRelID() {
        return relID;
    }

    public void setRelID(Long relID) {
        this.relID = relID;
    }

    public Long getEquipMentID() {
        return equipMentID;
    }

    public void setEquipMentID(Long equipMentID) {
        this.equipMentID = equipMentID;
    }

    public Long getAttrID() {
        return attrID;
    }

    public void setAttrID(Long attrID) {
        this.attrID = attrID;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}