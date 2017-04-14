package com.ks.monitor.pojo;

import java.util.Date;

public class Sysowners {
    private Integer id;

    private String name;

    private String type;

    private String dfltsch;

    private Integer status;

    private Date created;

    private Date modified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDfltsch() {
        return dfltsch;
    }

    public void setDfltsch(String dfltsch) {
        this.dfltsch = dfltsch == null ? null : dfltsch.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}