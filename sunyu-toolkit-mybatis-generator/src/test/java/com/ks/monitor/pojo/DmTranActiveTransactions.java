package com.ks.monitor.pojo;

import java.util.Date;

public class DmTranActiveTransactions {
    private Long transaction_id;

    private String name;

    private Date transaction_begin_time;

    private Integer transaction_type;

    private String transaction_uow;

    private Integer transaction_state;

    private Integer transaction_status;

    private Integer transaction_status2;

    private Integer dtc_state;

    private Integer dtc_status;

    private Integer dtc_isolation_level;

    private byte[] filestream_transaction_id;

    public Long getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(Long transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getTransaction_begin_time() {
        return transaction_begin_time;
    }

    public void setTransaction_begin_time(Date transaction_begin_time) {
        this.transaction_begin_time = transaction_begin_time;
    }

    public Integer getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(Integer transaction_type) {
        this.transaction_type = transaction_type;
    }

    public String getTransaction_uow() {
        return transaction_uow;
    }

    public void setTransaction_uow(String transaction_uow) {
        this.transaction_uow = transaction_uow == null ? null : transaction_uow.trim();
    }

    public Integer getTransaction_state() {
        return transaction_state;
    }

    public void setTransaction_state(Integer transaction_state) {
        this.transaction_state = transaction_state;
    }

    public Integer getTransaction_status() {
        return transaction_status;
    }

    public void setTransaction_status(Integer transaction_status) {
        this.transaction_status = transaction_status;
    }

    public Integer getTransaction_status2() {
        return transaction_status2;
    }

    public void setTransaction_status2(Integer transaction_status2) {
        this.transaction_status2 = transaction_status2;
    }

    public Integer getDtc_state() {
        return dtc_state;
    }

    public void setDtc_state(Integer dtc_state) {
        this.dtc_state = dtc_state;
    }

    public Integer getDtc_status() {
        return dtc_status;
    }

    public void setDtc_status(Integer dtc_status) {
        this.dtc_status = dtc_status;
    }

    public Integer getDtc_isolation_level() {
        return dtc_isolation_level;
    }

    public void setDtc_isolation_level(Integer dtc_isolation_level) {
        this.dtc_isolation_level = dtc_isolation_level;
    }

    public byte[] getFilestream_transaction_id() {
        return filestream_transaction_id;
    }

    public void setFilestream_transaction_id(byte[] filestream_transaction_id) {
        this.filestream_transaction_id = filestream_transaction_id;
    }
}