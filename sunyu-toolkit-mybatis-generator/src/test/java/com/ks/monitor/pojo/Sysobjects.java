package com.ks.monitor.pojo;

import java.util.Date;

public class Sysobjects {
    private String name;

    private Integer id;

    private String xtype;

    private Short uid;

    private Short info;

    private Integer status;

    private Integer base_schema_ver;

    private Integer replinfo;

    private Integer parent_obj;

    private Date crdate;

    private Short ftcatid;

    private Integer schema_ver;

    private Integer stats_schema_ver;

    private String type;

    private Short userstat;

    private Short sysstat;

    private Short indexdel;

    private Date refdate;

    private Integer version;

    private Integer deltrig;

    private Integer instrig;

    private Integer updtrig;

    private Integer seltrig;

    private Integer category;

    private Short cache;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getXtype() {
        return xtype;
    }

    public void setXtype(String xtype) {
        this.xtype = xtype == null ? null : xtype.trim();
    }

    public Short getUid() {
        return uid;
    }

    public void setUid(Short uid) {
        this.uid = uid;
    }

    public Short getInfo() {
        return info;
    }

    public void setInfo(Short info) {
        this.info = info;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBase_schema_ver() {
        return base_schema_ver;
    }

    public void setBase_schema_ver(Integer base_schema_ver) {
        this.base_schema_ver = base_schema_ver;
    }

    public Integer getReplinfo() {
        return replinfo;
    }

    public void setReplinfo(Integer replinfo) {
        this.replinfo = replinfo;
    }

    public Integer getParent_obj() {
        return parent_obj;
    }

    public void setParent_obj(Integer parent_obj) {
        this.parent_obj = parent_obj;
    }

    public Date getCrdate() {
        return crdate;
    }

    public void setCrdate(Date crdate) {
        this.crdate = crdate;
    }

    public Short getFtcatid() {
        return ftcatid;
    }

    public void setFtcatid(Short ftcatid) {
        this.ftcatid = ftcatid;
    }

    public Integer getSchema_ver() {
        return schema_ver;
    }

    public void setSchema_ver(Integer schema_ver) {
        this.schema_ver = schema_ver;
    }

    public Integer getStats_schema_ver() {
        return stats_schema_ver;
    }

    public void setStats_schema_ver(Integer stats_schema_ver) {
        this.stats_schema_ver = stats_schema_ver;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Short getUserstat() {
        return userstat;
    }

    public void setUserstat(Short userstat) {
        this.userstat = userstat;
    }

    public Short getSysstat() {
        return sysstat;
    }

    public void setSysstat(Short sysstat) {
        this.sysstat = sysstat;
    }

    public Short getIndexdel() {
        return indexdel;
    }

    public void setIndexdel(Short indexdel) {
        this.indexdel = indexdel;
    }

    public Date getRefdate() {
        return refdate;
    }

    public void setRefdate(Date refdate) {
        this.refdate = refdate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getDeltrig() {
        return deltrig;
    }

    public void setDeltrig(Integer deltrig) {
        this.deltrig = deltrig;
    }

    public Integer getInstrig() {
        return instrig;
    }

    public void setInstrig(Integer instrig) {
        this.instrig = instrig;
    }

    public Integer getUpdtrig() {
        return updtrig;
    }

    public void setUpdtrig(Integer updtrig) {
        this.updtrig = updtrig;
    }

    public Integer getSeltrig() {
        return seltrig;
    }

    public void setSeltrig(Integer seltrig) {
        this.seltrig = seltrig;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Short getCache() {
        return cache;
    }

    public void setCache(Short cache) {
        this.cache = cache;
    }
}