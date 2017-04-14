package com.ks.monitor.pojo;

import java.util.Date;

public class DmTranCommitTable {
    private Long commit_ts;

    private Long xdes_id;

    private Long commit_lbn;

    private Long commit_csn;

    private Date commit_time;

    public Long getCommit_ts() {
        return commit_ts;
    }

    public void setCommit_ts(Long commit_ts) {
        this.commit_ts = commit_ts;
    }

    public Long getXdes_id() {
        return xdes_id;
    }

    public void setXdes_id(Long xdes_id) {
        this.xdes_id = xdes_id;
    }

    public Long getCommit_lbn() {
        return commit_lbn;
    }

    public void setCommit_lbn(Long commit_lbn) {
        this.commit_lbn = commit_lbn;
    }

    public Long getCommit_csn() {
        return commit_csn;
    }

    public void setCommit_csn(Long commit_csn) {
        this.commit_csn = commit_csn;
    }

    public Date getCommit_time() {
        return commit_time;
    }

    public void setCommit_time(Date commit_time) {
        this.commit_time = commit_time;
    }
}