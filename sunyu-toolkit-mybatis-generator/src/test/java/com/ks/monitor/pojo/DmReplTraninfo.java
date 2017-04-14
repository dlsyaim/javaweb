package com.ks.monitor.pojo;

import java.util.Date;

public class DmReplTraninfo {
    private Byte fp2p_pub_exists;

    private Integer db_ver;

    private String begin_lsn;

    private String commit_lsn;

    private Short dbid;

    private Integer rows;

    private String xdesid;

    private String server;

    private Integer server_len_in_bytes;

    private String database;

    private Integer db_len_in_bytes;

    private String originator;

    private Integer originator_len_in_bytes;

    private String orig_db;

    private Integer orig_db_len_in_bytes;

    private Integer cmds_in_tran;

    private Byte is_boundedupdate_singleton;

    private String begin_update_lsn;

    private String delete_lsn;

    private String last_end_lsn;

    private Byte fcomplete;

    private Byte fcompensated;

    private Byte fprocessingtext;

    private Integer max_cmds_in_tran;

    private Date begin_time;

    private Date commit_time;

    private Integer session_id;

    private String session_phase;

    private Byte is_known_cdc_tran;

    private Integer error_count;

    public Byte getFp2p_pub_exists() {
        return fp2p_pub_exists;
    }

    public void setFp2p_pub_exists(Byte fp2p_pub_exists) {
        this.fp2p_pub_exists = fp2p_pub_exists;
    }

    public Integer getDb_ver() {
        return db_ver;
    }

    public void setDb_ver(Integer db_ver) {
        this.db_ver = db_ver;
    }

    public String getBegin_lsn() {
        return begin_lsn;
    }

    public void setBegin_lsn(String begin_lsn) {
        this.begin_lsn = begin_lsn == null ? null : begin_lsn.trim();
    }

    public String getCommit_lsn() {
        return commit_lsn;
    }

    public void setCommit_lsn(String commit_lsn) {
        this.commit_lsn = commit_lsn == null ? null : commit_lsn.trim();
    }

    public Short getDbid() {
        return dbid;
    }

    public void setDbid(Short dbid) {
        this.dbid = dbid;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getXdesid() {
        return xdesid;
    }

    public void setXdesid(String xdesid) {
        this.xdesid = xdesid == null ? null : xdesid.trim();
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server == null ? null : server.trim();
    }

    public Integer getServer_len_in_bytes() {
        return server_len_in_bytes;
    }

    public void setServer_len_in_bytes(Integer server_len_in_bytes) {
        this.server_len_in_bytes = server_len_in_bytes;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database == null ? null : database.trim();
    }

    public Integer getDb_len_in_bytes() {
        return db_len_in_bytes;
    }

    public void setDb_len_in_bytes(Integer db_len_in_bytes) {
        this.db_len_in_bytes = db_len_in_bytes;
    }

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator == null ? null : originator.trim();
    }

    public Integer getOriginator_len_in_bytes() {
        return originator_len_in_bytes;
    }

    public void setOriginator_len_in_bytes(Integer originator_len_in_bytes) {
        this.originator_len_in_bytes = originator_len_in_bytes;
    }

    public String getOrig_db() {
        return orig_db;
    }

    public void setOrig_db(String orig_db) {
        this.orig_db = orig_db == null ? null : orig_db.trim();
    }

    public Integer getOrig_db_len_in_bytes() {
        return orig_db_len_in_bytes;
    }

    public void setOrig_db_len_in_bytes(Integer orig_db_len_in_bytes) {
        this.orig_db_len_in_bytes = orig_db_len_in_bytes;
    }

    public Integer getCmds_in_tran() {
        return cmds_in_tran;
    }

    public void setCmds_in_tran(Integer cmds_in_tran) {
        this.cmds_in_tran = cmds_in_tran;
    }

    public Byte getIs_boundedupdate_singleton() {
        return is_boundedupdate_singleton;
    }

    public void setIs_boundedupdate_singleton(Byte is_boundedupdate_singleton) {
        this.is_boundedupdate_singleton = is_boundedupdate_singleton;
    }

    public String getBegin_update_lsn() {
        return begin_update_lsn;
    }

    public void setBegin_update_lsn(String begin_update_lsn) {
        this.begin_update_lsn = begin_update_lsn == null ? null : begin_update_lsn.trim();
    }

    public String getDelete_lsn() {
        return delete_lsn;
    }

    public void setDelete_lsn(String delete_lsn) {
        this.delete_lsn = delete_lsn == null ? null : delete_lsn.trim();
    }

    public String getLast_end_lsn() {
        return last_end_lsn;
    }

    public void setLast_end_lsn(String last_end_lsn) {
        this.last_end_lsn = last_end_lsn == null ? null : last_end_lsn.trim();
    }

    public Byte getFcomplete() {
        return fcomplete;
    }

    public void setFcomplete(Byte fcomplete) {
        this.fcomplete = fcomplete;
    }

    public Byte getFcompensated() {
        return fcompensated;
    }

    public void setFcompensated(Byte fcompensated) {
        this.fcompensated = fcompensated;
    }

    public Byte getFprocessingtext() {
        return fprocessingtext;
    }

    public void setFprocessingtext(Byte fprocessingtext) {
        this.fprocessingtext = fprocessingtext;
    }

    public Integer getMax_cmds_in_tran() {
        return max_cmds_in_tran;
    }

    public void setMax_cmds_in_tran(Integer max_cmds_in_tran) {
        this.max_cmds_in_tran = max_cmds_in_tran;
    }

    public Date getBegin_time() {
        return begin_time;
    }

    public void setBegin_time(Date begin_time) {
        this.begin_time = begin_time;
    }

    public Date getCommit_time() {
        return commit_time;
    }

    public void setCommit_time(Date commit_time) {
        this.commit_time = commit_time;
    }

    public Integer getSession_id() {
        return session_id;
    }

    public void setSession_id(Integer session_id) {
        this.session_id = session_id;
    }

    public String getSession_phase() {
        return session_phase;
    }

    public void setSession_phase(String session_phase) {
        this.session_phase = session_phase == null ? null : session_phase.trim();
    }

    public Byte getIs_known_cdc_tran() {
        return is_known_cdc_tran;
    }

    public void setIs_known_cdc_tran(Byte is_known_cdc_tran) {
        this.is_known_cdc_tran = is_known_cdc_tran;
    }

    public Integer getError_count() {
        return error_count;
    }

    public void setError_count(Integer error_count) {
        this.error_count = error_count;
    }
}