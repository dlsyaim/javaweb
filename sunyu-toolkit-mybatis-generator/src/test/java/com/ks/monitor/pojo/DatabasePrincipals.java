package com.ks.monitor.pojo;

import java.util.Date;

public class DatabasePrincipals {
    private String name;

    private Integer principal_id;

    private String type;

    private String type_desc;

    private String default_schema_name;

    private Date create_date;

    private Date modify_date;

    private Integer owning_principal_id;

    private Boolean is_fixed_role;

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

    public String getDefault_schema_name() {
        return default_schema_name;
    }

    public void setDefault_schema_name(String default_schema_name) {
        this.default_schema_name = default_schema_name == null ? null : default_schema_name.trim();
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

    public Integer getOwning_principal_id() {
        return owning_principal_id;
    }

    public void setOwning_principal_id(Integer owning_principal_id) {
        this.owning_principal_id = owning_principal_id;
    }

    public Boolean getIs_fixed_role() {
        return is_fixed_role;
    }

    public void setIs_fixed_role(Boolean is_fixed_role) {
        this.is_fixed_role = is_fixed_role;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }
}