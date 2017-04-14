package com.ks.monitor.pojo;

public class Syslockinfo {
    private String rsc_text;

    private Short rsc_dbid;

    private Short rsc_indid;

    private Integer rsc_objid;

    private Byte rsc_type;

    private Byte rsc_flag;

    private Byte req_mode;

    private Byte req_status;

    private Short req_refcnt;

    private Short req_cryrefcnt;

    private Integer req_lifetime;

    private Integer req_spid;

    private Integer req_ecid;

    private Short req_ownertype;

    private Long req_transactionID;

    private String req_transactionUOW;

    public String getRsc_text() {
        return rsc_text;
    }

    public void setRsc_text(String rsc_text) {
        this.rsc_text = rsc_text == null ? null : rsc_text.trim();
    }

    public Short getRsc_dbid() {
        return rsc_dbid;
    }

    public void setRsc_dbid(Short rsc_dbid) {
        this.rsc_dbid = rsc_dbid;
    }

    public Short getRsc_indid() {
        return rsc_indid;
    }

    public void setRsc_indid(Short rsc_indid) {
        this.rsc_indid = rsc_indid;
    }

    public Integer getRsc_objid() {
        return rsc_objid;
    }

    public void setRsc_objid(Integer rsc_objid) {
        this.rsc_objid = rsc_objid;
    }

    public Byte getRsc_type() {
        return rsc_type;
    }

    public void setRsc_type(Byte rsc_type) {
        this.rsc_type = rsc_type;
    }

    public Byte getRsc_flag() {
        return rsc_flag;
    }

    public void setRsc_flag(Byte rsc_flag) {
        this.rsc_flag = rsc_flag;
    }

    public Byte getReq_mode() {
        return req_mode;
    }

    public void setReq_mode(Byte req_mode) {
        this.req_mode = req_mode;
    }

    public Byte getReq_status() {
        return req_status;
    }

    public void setReq_status(Byte req_status) {
        this.req_status = req_status;
    }

    public Short getReq_refcnt() {
        return req_refcnt;
    }

    public void setReq_refcnt(Short req_refcnt) {
        this.req_refcnt = req_refcnt;
    }

    public Short getReq_cryrefcnt() {
        return req_cryrefcnt;
    }

    public void setReq_cryrefcnt(Short req_cryrefcnt) {
        this.req_cryrefcnt = req_cryrefcnt;
    }

    public Integer getReq_lifetime() {
        return req_lifetime;
    }

    public void setReq_lifetime(Integer req_lifetime) {
        this.req_lifetime = req_lifetime;
    }

    public Integer getReq_spid() {
        return req_spid;
    }

    public void setReq_spid(Integer req_spid) {
        this.req_spid = req_spid;
    }

    public Integer getReq_ecid() {
        return req_ecid;
    }

    public void setReq_ecid(Integer req_ecid) {
        this.req_ecid = req_ecid;
    }

    public Short getReq_ownertype() {
        return req_ownertype;
    }

    public void setReq_ownertype(Short req_ownertype) {
        this.req_ownertype = req_ownertype;
    }

    public Long getReq_transactionID() {
        return req_transactionID;
    }

    public void setReq_transactionID(Long req_transactionID) {
        this.req_transactionID = req_transactionID;
    }

    public String getReq_transactionUOW() {
        return req_transactionUOW;
    }

    public void setReq_transactionUOW(String req_transactionUOW) {
        this.req_transactionUOW = req_transactionUOW == null ? null : req_transactionUOW.trim();
    }
}