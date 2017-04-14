package com.ks.monitor.pojo;

import java.util.Date;

public class LinkedLogins {
    private Integer server_id;

    private Integer local_principal_id;

    private Boolean uses_self_credential;

    private String remote_name;

    private Date modify_date;

    public Integer getServer_id() {
        return server_id;
    }

    public void setServer_id(Integer server_id) {
        this.server_id = server_id;
    }

    public Integer getLocal_principal_id() {
        return local_principal_id;
    }

    public void setLocal_principal_id(Integer local_principal_id) {
        this.local_principal_id = local_principal_id;
    }

    public Boolean getUses_self_credential() {
        return uses_self_credential;
    }

    public void setUses_self_credential(Boolean uses_self_credential) {
        this.uses_self_credential = uses_self_credential;
    }

    public String getRemote_name() {
        return remote_name;
    }

    public void setRemote_name(String remote_name) {
        this.remote_name = remote_name == null ? null : remote_name.trim();
    }

    public Date getModify_date() {
        return modify_date;
    }

    public void setModify_date(Date modify_date) {
        this.modify_date = modify_date;
    }
}