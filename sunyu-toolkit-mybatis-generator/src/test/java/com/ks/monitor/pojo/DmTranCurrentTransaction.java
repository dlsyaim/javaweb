package com.ks.monitor.pojo;

public class DmTranCurrentTransaction {
    private Long transaction_id;

    private Long transaction_sequence_num;

    private Boolean transaction_is_snapshot;

    private Long first_snapshot_sequence_num;

    private Long last_transaction_sequence_num;

    private Long first_useful_sequence_num;

    public Long getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(Long transaction_id) {
        this.transaction_id = transaction_id;
    }

    public Long getTransaction_sequence_num() {
        return transaction_sequence_num;
    }

    public void setTransaction_sequence_num(Long transaction_sequence_num) {
        this.transaction_sequence_num = transaction_sequence_num;
    }

    public Boolean getTransaction_is_snapshot() {
        return transaction_is_snapshot;
    }

    public void setTransaction_is_snapshot(Boolean transaction_is_snapshot) {
        this.transaction_is_snapshot = transaction_is_snapshot;
    }

    public Long getFirst_snapshot_sequence_num() {
        return first_snapshot_sequence_num;
    }

    public void setFirst_snapshot_sequence_num(Long first_snapshot_sequence_num) {
        this.first_snapshot_sequence_num = first_snapshot_sequence_num;
    }

    public Long getLast_transaction_sequence_num() {
        return last_transaction_sequence_num;
    }

    public void setLast_transaction_sequence_num(Long last_transaction_sequence_num) {
        this.last_transaction_sequence_num = last_transaction_sequence_num;
    }

    public Long getFirst_useful_sequence_num() {
        return first_useful_sequence_num;
    }

    public void setFirst_useful_sequence_num(Long first_useful_sequence_num) {
        this.first_useful_sequence_num = first_useful_sequence_num;
    }
}