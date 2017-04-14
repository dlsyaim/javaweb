package com.ks.monitor.pojo;

import java.util.Date;

public class Credentials {
    private Integer credential_id;

    private String name;

    private String credential_identity;

    private Date create_date;

    private Date modify_date;

    private String target_type;

    private Integer target_id;

    public Integer getCredential_id() {
        return credential_id;
    }

    public void setCredential_id(Integer credential_id) {
        this.credential_id = credential_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCredential_identity() {
        return credential_identity;
    }

    public void setCredential_identity(String credential_identity) {
        this.credential_identity = credential_identity == null ? null : credential_identity.trim();
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getModify_date() {
        return modify_date;
    }

    public void setModify_date(Date modify_date) {
        this.modify_date = modify_date;
    }

    public String getTarget_type() {
        return target_type;
    }

    public void setTarget_type(String target_type) {
        this.target_type = target_type == null ? null : target_type.trim();
    }

    public Integer getTarget_id() {
        return target_id;
    }

    public void setTarget_id(Integer target_id) {
        this.target_id = target_id;
    }
}