package com.ks.monitor.pojo;

public class DmReplTranhash {
    private Integer buckets;

    private Integer hashed_trans;

    private Integer completed_trans;

    private Integer compensated_trans;

    private String first_begin_lsn;

    private String last_commit_lsn;

    public Integer getBuckets() {
        return buckets;
    }

    public void setBuckets(Integer buckets) {
        this.buckets = buckets;
    }

    public Integer getHashed_trans() {
        return hashed_trans;
    }

    public void setHashed_trans(Integer hashed_trans) {
        this.hashed_trans = hashed_trans;
    }

    public Integer getCompleted_trans() {
        return completed_trans;
    }

    public void setCompleted_trans(Integer completed_trans) {
        this.completed_trans = completed_trans;
    }

    public Integer getCompensated_trans() {
        return compensated_trans;
    }

    public void setCompensated_trans(Integer compensated_trans) {
        this.compensated_trans = compensated_trans;
    }

    public String getFirst_begin_lsn() {
        return first_begin_lsn;
    }

    public void setFirst_begin_lsn(String first_begin_lsn) {
        this.first_begin_lsn = first_begin_lsn == null ? null : first_begin_lsn.trim();
    }

    public String getLast_commit_lsn() {
        return last_commit_lsn;
    }

    public void setLast_commit_lsn(String last_commit_lsn) {
        this.last_commit_lsn = last_commit_lsn == null ? null : last_commit_lsn.trim();
    }
}