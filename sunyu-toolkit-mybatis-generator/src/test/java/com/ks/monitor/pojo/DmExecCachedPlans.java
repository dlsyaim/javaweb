package com.ks.monitor.pojo;

public class DmExecCachedPlans {
    private Integer bucketid;

    private Integer refcounts;

    private Integer usecounts;

    private Integer size_in_bytes;

    private String cacheobjtype;

    private String objtype;

    private Integer pool_id;

    public Integer getBucketid() {
        return bucketid;
    }

    public void setBucketid(Integer bucketid) {
        this.bucketid = bucketid;
    }

    public Integer getRefcounts() {
        return refcounts;
    }

    public void setRefcounts(Integer refcounts) {
        this.refcounts = refcounts;
    }

    public Integer getUsecounts() {
        return usecounts;
    }

    public void setUsecounts(Integer usecounts) {
        this.usecounts = usecounts;
    }

    public Integer getSize_in_bytes() {
        return size_in_bytes;
    }

    public void setSize_in_bytes(Integer size_in_bytes) {
        this.size_in_bytes = size_in_bytes;
    }

    public String getCacheobjtype() {
        return cacheobjtype;
    }

    public void setCacheobjtype(String cacheobjtype) {
        this.cacheobjtype = cacheobjtype == null ? null : cacheobjtype.trim();
    }

    public String getObjtype() {
        return objtype;
    }

    public void setObjtype(String objtype) {
        this.objtype = objtype == null ? null : objtype.trim();
    }

    public Integer getPool_id() {
        return pool_id;
    }

    public void setPool_id(Integer pool_id) {
        this.pool_id = pool_id;
    }
}