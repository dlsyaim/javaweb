package com.ks.monitor.pojo;

import java.util.Date;

public class RemoteLogins {
    private Integer server_id;

    private String remote_name;

    private Integer local_principal_id;

    private Date modify_date;

    public Integer getServer_id() {
        return server_id;
    }

    public void setServer_id(Integer server_id) {
        this.server_id = server_id;
    }

    public String getRemote_name() {
        return remote_name;
    }

    public void setRemote_name(String remote_name) {
        this.remote_name = remote_name == null ? null : remote_name.trim();
    }

    public Integer getLocal_principal_id() {
        return local_principal_id;
    }

    public void setLocal_principal_id(Integer local_principal_id) {
        this.local_principal_id = local_principal_id;
    }

    public Date getModify_date() {
        return modify_date;
    }

    public void setModify_date(Date modify_date) {
        this.modify_date = modify_date;
    }
}