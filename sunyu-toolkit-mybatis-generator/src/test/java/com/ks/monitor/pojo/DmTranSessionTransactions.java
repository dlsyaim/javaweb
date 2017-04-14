package com.ks.monitor.pojo;

public class DmTranSessionTransactions {
    private Integer session_id;

    private Long transaction_id;

    private Integer enlist_count;

    private Boolean is_user_transaction;

    private Boolean is_local;

    private Boolean is_enlisted;

    private Boolean is_bound;

    private byte[] transaction_descriptor;

    public Integer getSession_id() {
        return session_id;
    }

    public void setSession_id(Integer session_id) {
        this.session_id = session_id;
    }

    public Long getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(Long transaction_id) {
        this.transaction_id = transaction_id;
    }

    public Integer getEnlist_count() {
        return enlist_count;
    }

    public void setEnlist_count(Integer enlist_count) {
        this.enlist_count = enlist_count;
    }

    public Boolean getIs_user_transaction() {
        return is_user_transaction;
    }

    public void setIs_user_transaction(Boolean is_user_transaction) {
        this.is_user_transaction = is_user_transaction;
    }

    public Boolean getIs_local() {
        return is_local;
    }

    public void setIs_local(Boolean is_local) {
        this.is_local = is_local;
    }

    public Boolean getIs_enlisted() {
        return is_enlisted;
    }

    public void setIs_enlisted(Boolean is_enlisted) {
        this.is_enlisted = is_enlisted;
    }

    public Boolean getIs_bound() {
        return is_bound;
    }

    public void setIs_bound(Boolean is_bound) {
        this.is_bound = is_bound;
    }

    public byte[] getTransaction_descriptor() {
        return transaction_descriptor;
    }

    public void setTransaction_descriptor(byte[] transaction_descriptor) {
        this.transaction_descriptor = transaction_descriptor;
    }
}