package com.ks.monitor.pojo;

import java.util.Date;

public class DmClrAppdomains {
    private Integer appdomain_id;

    private String appdomain_name;

    private Date creation_time;

    private Integer db_id;

    private Integer user_id;

    private String state;

    private Integer strong_refcount;

    private Integer weak_refcount;

    private Integer cost;

    private Integer value;

    private byte[] appdomain_address;

    public Integer getAppdomain_id() {
        return appdomain_id;
    }

    public void setAppdomain_id(Integer appdomain_id) {
        this.appdomain_id = appdomain_id;
    }

    public String getAppdomain_name() {
        return appdomain_name;
    }

    public void setAppdomain_name(String appdomain_name) {
        this.appdomain_name = appdomain_name == null ? null : appdomain_name.trim();
    }

    public Date getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }

    public Integer getDb_id() {
        return db_id;
    }

    public void setDb_id(Integer db_id) {
        this.db_id = db_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getStrong_refcount() {
        return strong_refcount;
    }

    public void setStrong_refcount(Integer strong_refcount) {
        this.strong_refcount = strong_refcount;
    }

    public Integer getWeak_refcount() {
        return weak_refcount;
    }

    public void setWeak_refcount(Integer weak_refcount) {
        this.weak_refcount = weak_refcount;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public byte[] getAppdomain_address() {
        return appdomain_address;
    }

    public void setAppdomain_address(byte[] appdomain_address) {
        this.appdomain_address = appdomain_address;
    }
}