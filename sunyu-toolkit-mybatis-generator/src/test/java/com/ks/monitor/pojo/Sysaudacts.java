package com.ks.monitor.pojo;

public class Sysaudacts {
    private Byte class;

    private Integer id;

    private Integer subid;

    private Integer grantee;

    private Integer audit_spec_id;

    private String type;

    private String state;

    public Byte getClass() {
        return class;
    }

    public void setClass(Byte class) {
        this.class = class;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubid() {
        return subid;
    }

    public void setSubid(Integer subid) {
        this.subid = subid;
    }

    public Integer getGrantee() {
        return grantee;
    }

    public void setGrantee(Integer grantee) {
        this.grantee = grantee;
    }

    public Integer getAudit_spec_id() {
        return audit_spec_id;
    }

    public void setAudit_spec_id(Integer audit_spec_id) {
        this.audit_spec_id = audit_spec_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}