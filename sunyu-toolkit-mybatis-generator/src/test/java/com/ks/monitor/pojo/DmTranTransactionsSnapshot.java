package com.ks.monitor.pojo;

public class DmTranTransactionsSnapshot {
    private Long transaction_sequence_num;

    private Integer snapshot_id;

    private Long snapshot_sequence_num;

    public Long getTransaction_sequence_num() {
        return transaction_sequence_num;
    }

    public void setTransaction_sequence_num(Long transaction_sequence_num) {
        this.transaction_sequence_num = transaction_sequence_num;
    }

    public Integer getSnapshot_id() {
        return snapshot_id;
    }

    public void setSnapshot_id(Integer snapshot_id) {
        this.snapshot_id = snapshot_id;
    }

    public Long getSnapshot_sequence_num() {
        return snapshot_sequence_num;
    }

    public void setSnapshot_sequence_num(Long snapshot_sequence_num) {
        this.snapshot_sequence_num = snapshot_sequence_num;
    }
}