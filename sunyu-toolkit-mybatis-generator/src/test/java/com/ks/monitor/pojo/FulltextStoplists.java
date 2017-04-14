package com.ks.monitor.pojo;

import java.util.Date;

public class FulltextStoplists {
    private Integer stoplist_id;

    private String name;

    private Date create_date;

    private Date modify_date;

    private Integer principal_id;

    public Integer getStoplist_id() {
        return stoplist_id;
    }

    public void setStoplist_id(Integer stoplist_id) {
        this.stoplist_id = stoplist_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Integer getPrincipal_id() {
        return principal_id;
    }

    public void setPrincipal_id(Integer principal_id) {
        this.principal_id = principal_id;
    }
}