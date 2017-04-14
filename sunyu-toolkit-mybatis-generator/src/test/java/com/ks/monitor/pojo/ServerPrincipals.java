package com.ks.monitor.pojo;

import java.util.Date;

public class ServerPrincipals {
    private String name;

    private Integer principal_id;

    private String type;

    private String type_desc;

    private Boolean is_disabled;

    private Date create_date;

    private Date modify_date;

    private String default_database_name;

    private String default_language_name;

    private Integer credential_id;

    private byte[] sid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPrincipal_id() {
        return principal_id;
    }

    public void setPrincipal_id(Integer principal_id) {
        this.principal_id = principal_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getType_desc() {
        return type_desc;
    }

    public void setType_desc(String type_desc) {
        this.type_desc = type_desc == null ? null : type_desc.trim();
    }

    public Boolean getIs_disabled() {
        return is_disabled;
    }

    public void setIs_disabled(Boolean is_disabled) {
        this.is_disabled = is_disabled;
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

    public String getDefault_database_name() {
        return default_database_name;
    }

    public void setDefault_database_name(String default_database_name) {
        this.default_database_name = default_database_name == null ? null : default_database_name.trim();
    }

    public String getDefault_language_name() {
        return default_language_name;
    }

    public void setDefault_language_name(String default_language_name) {
        this.default_language_name = default_language_name == null ? null : default_language_name.trim();
    }

    public Integer getCredential_id() {
        return credential_id;
    }

    public void setCredential_id(Integer credential_id) {
        this.credential_id = credential_id;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }
}