package com.ks.monitor.pojo;

public class DmTranActiveSnapshotDatabaseTransactions {
    private Long transaction_id;

    private Long transaction_sequence_num;

    private Long commit_sequence_num;

    private Integer session_id;

    private Boolean is_snapshot;

    private Long first_snapshot_sequence_num;

    private Integer max_version_chain_traversed;

    private Double average_version_chain_traversed;

    private Long elapsed_time_seconds;

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

    public Long getCommit_sequence_num() {
        return commit_sequence_num;
    }

    public void setCommit_sequence_num(Long commit_sequence_num) {
        this.commit_sequence_num = commit_sequence_num;
    }

    public Integer getSession_id() {
        return session_id;
    }

    public void setSession_id(Integer session_id) {
        this.session_id = session_id;
    }

    public Boolean getIs_snapshot() {
        return is_snapshot;
    }

    public void setIs_snapshot(Boolean is_snapshot) {
        this.is_snapshot = is_snapshot;
    }

    public Long getFirst_snapshot_sequence_num() {
        return first_snapshot_sequence_num;
    }

    public void setFirst_snapshot_sequence_num(Long first_snapshot_sequence_num) {
        this.first_snapshot_sequence_num = first_snapshot_sequence_num;
    }

    public Integer getMax_version_chain_traversed() {
        return max_version_chain_traversed;
    }

    public void setMax_version_chain_traversed(Integer max_version_chain_traversed) {
        this.max_version_chain_traversed = max_version_chain_traversed;
    }

    public Double getAverage_version_chain_traversed() {
        return average_version_chain_traversed;
    }

    public void setAverage_version_chain_traversed(Double average_version_chain_traversed) {
        this.average_version_chain_traversed = average_version_chain_traversed;
    }

    public Long getElapsed_time_seconds() {
        return elapsed_time_seconds;
    }

    public void setElapsed_time_seconds(Long elapsed_time_seconds) {
        this.elapsed_time_seconds = elapsed_time_seconds;
    }
}