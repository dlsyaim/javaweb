package com.ks.monitor.pojo;

import java.util.Date;

public class Sysprocesses {
    private Short spid;

    private Short kpid;

    private Short blocked;

    private Long waittime;

    private String lastwaittype;

    private String waitresource;

    private Short dbid;

    private Short uid;

    private Integer cpu;

    private Long physical_io;

    private Integer memusage;

    private Date login_time;

    private Date last_batch;

    private Short ecid;

    private Short open_tran;

    private String status;

    private String hostname;

    private String program_name;

    private String hostprocess;

    private String cmd;

    private String nt_domain;

    private String nt_username;

    private String net_address;

    private String net_library;

    private String loginame;

    private Integer stmt_start;

    private Integer stmt_end;

    private Integer request_id;

    public Short getSpid() {
        return spid;
    }

    public void setSpid(Short spid) {
        this.spid = spid;
    }

    public Short getKpid() {
        return kpid;
    }

    public void setKpid(Short kpid) {
        this.kpid = kpid;
    }

    public Short getBlocked() {
        return blocked;
    }

    public void setBlocked(Short blocked) {
        this.blocked = blocked;
    }

    public Long getWaittime() {
        return waittime;
    }

    public void setWaittime(Long waittime) {
        this.waittime = waittime;
    }

    public String getLastwaittype() {
        return lastwaittype;
    }

    public void setLastwaittype(String lastwaittype) {
        this.lastwaittype = lastwaittype == null ? null : lastwaittype.trim();
    }

    public String getWaitresource() {
        return waitresource;
    }

    public void setWaitresource(String waitresource) {
        this.waitresource = waitresource == null ? null : waitresource.trim();
    }

    public Short getDbid() {
        return dbid;
    }

    public void setDbid(Short dbid) {
        this.dbid = dbid;
    }

    public Short getUid() {
        return uid;
    }

    public void setUid(Short uid) {
        this.uid = uid;
    }

    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public Long getPhysical_io() {
        return physical_io;
    }

    public void setPhysical_io(Long physical_io) {
        this.physical_io = physical_io;
    }

    public Integer getMemusage() {
        return memusage;
    }

    public void setMemusage(Integer memusage) {
        this.memusage = memusage;
    }

    public Date getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }

    public Date getLast_batch() {
        return last_batch;
    }

    public void setLast_batch(Date last_batch) {
        this.last_batch = last_batch;
    }

    public Short getEcid() {
        return ecid;
    }

    public void setEcid(Short ecid) {
        this.ecid = ecid;
    }

    public Short getOpen_tran() {
        return open_tran;
    }

    public void setOpen_tran(Short open_tran) {
        this.open_tran = open_tran;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname == null ? null : hostname.trim();
    }

    public String getProgram_name() {
        return program_name;
    }

    public void setProgram_name(String program_name) {
        this.program_name = program_name == null ? null : program_name.trim();
    }

    public String getHostprocess() {
        return hostprocess;
    }

    public void setHostprocess(String hostprocess) {
        this.hostprocess = hostprocess == null ? null : hostprocess.trim();
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd == null ? null : cmd.trim();
    }

    public String getNt_domain() {
        return nt_domain;
    }

    public void setNt_domain(String nt_domain) {
        this.nt_domain = nt_domain == null ? null : nt_domain.trim();
    }

    public String getNt_username() {
        return nt_username;
    }

    public void setNt_username(String nt_username) {
        this.nt_username = nt_username == null ? null : nt_username.trim();
    }

    public String getNet_address() {
        return net_address;
    }

    public void setNet_address(String net_address) {
        this.net_address = net_address == null ? null : net_address.trim();
    }

    public String getNet_library() {
        return net_library;
    }

    public void setNet_library(String net_library) {
        this.net_library = net_library == null ? null : net_library.trim();
    }

    public String getLoginame() {
        return loginame;
    }

    public void setLoginame(String loginame) {
        this.loginame = loginame == null ? null : loginame.trim();
    }

    public Integer getStmt_start() {
        return stmt_start;
    }

    public void setStmt_start(Integer stmt_start) {
        this.stmt_start = stmt_start;
    }

    public Integer getStmt_end() {
        return stmt_end;
    }

    public void setStmt_end(Integer stmt_end) {
        this.stmt_end = stmt_end;
    }

    public Integer getRequest_id() {
        return request_id;
    }

    public void setRequest_id(Integer request_id) {
        this.request_id = request_id;
    }
}