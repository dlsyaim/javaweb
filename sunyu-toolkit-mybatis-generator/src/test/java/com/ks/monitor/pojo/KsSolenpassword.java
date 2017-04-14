package com.ks.monitor.pojo;

public class KsSolenpassword {
    private Integer solenID;

    private Integer equipMentID;

    private String passWord;

    public Integer getSolenID() {
        return solenID;
    }

    public void setSolenID(Integer solenID) {
        this.solenID = solenID;
    }

    public Integer getEquipMentID() {
        return equipMentID;
    }

    public void setEquipMentID(Integer equipMentID) {
        this.equipMentID = equipMentID;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }
}