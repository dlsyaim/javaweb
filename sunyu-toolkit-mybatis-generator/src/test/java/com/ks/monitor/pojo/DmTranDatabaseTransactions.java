package com.ks.monitor.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class DmTranDatabaseTransactions {
    private Long transaction_id;

    private Integer database_id;

    private Date database_transaction_begin_time;

    private Integer database_transaction_type;

    private Integer database_transaction_state;

    private Integer database_transaction_status;

    private Integer database_transaction_status2;

    private Long database_transaction_log_record_count;

    private Integer database_transaction_replicate_record_count;

    private Long database_transaction_log_bytes_used;

    private Long database_transaction_log_bytes_reserved;

    private Integer database_transaction_log_bytes_used_system;

    private Integer database_transaction_log_bytes_reserved_system;

    private BigDecimal database_transaction_begin_lsn;

    private BigDecimal database_transaction_last_lsn;

    private BigDecimal database_transaction_most_recent_savepoint_lsn;

    private BigDecimal database_transaction_commit_lsn;

    private BigDecimal database_transaction_last_rollback_lsn;

    private BigDecimal database_transaction_next_undo_lsn;

    public Long getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(Long transaction_id) {
        this.transaction_id = transaction_id;
    }

    public Integer getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Integer database_id) {
        this.database_id = database_id;
    }

    public Date getDatabase_transaction_begin_time() {
        return database_transaction_begin_time;
    }

    public void setDatabase_transaction_begin_time(Date database_transaction_begin_time) {
        this.database_transaction_begin_time = database_transaction_begin_time;
    }

    public Integer getDatabase_transaction_type() {
        return database_transaction_type;
    }

    public void setDatabase_transaction_type(Integer database_transaction_type) {
        this.database_transaction_type = database_transaction_type;
    }

    public Integer getDatabase_transaction_state() {
        return database_transaction_state;
    }

    public void setDatabase_transaction_state(Integer database_transaction_state) {
        this.database_transaction_state = database_transaction_state;
    }

    public Integer getDatabase_transaction_status() {
        return database_transaction_status;
    }

    public void setDatabase_transaction_status(Integer database_transaction_status) {
        this.database_transaction_status = database_transaction_status;
    }

    public Integer getDatabase_transaction_status2() {
        return database_transaction_status2;
    }

    public void setDatabase_transaction_status2(Integer database_transaction_status2) {
        this.database_transaction_status2 = database_transaction_status2;
    }

    public Long getDatabase_transaction_log_record_count() {
        return database_transaction_log_record_count;
    }

    public void setDatabase_transaction_log_record_count(Long database_transaction_log_record_count) {
        this.database_transaction_log_record_count = database_transaction_log_record_count;
    }

    public Integer getDatabase_transaction_replicate_record_count() {
        return database_transaction_replicate_record_count;
    }

    public void setDatabase_transaction_replicate_record_count(Integer database_transaction_replicate_record_count) {
        this.database_transaction_replicate_record_count = database_transaction_replicate_record_count;
    }

    public Long getDatabase_transaction_log_bytes_used() {
        return database_transaction_log_bytes_used;
    }

    public void setDatabase_transaction_log_bytes_used(Long database_transaction_log_bytes_used) {
        this.database_transaction_log_bytes_used = database_transaction_log_bytes_used;
    }

    public Long getDatabase_transaction_log_bytes_reserved() {
        return database_transaction_log_bytes_reserved;
    }

    public void setDatabase_transaction_log_bytes_reserved(Long database_transaction_log_bytes_reserved) {
        this.database_transaction_log_bytes_reserved = database_transaction_log_bytes_reserved;
    }

    public Integer getDatabase_transaction_log_bytes_used_system() {
        return database_transaction_log_bytes_used_system;
    }

    public void setDatabase_transaction_log_bytes_used_system(Integer database_transaction_log_bytes_used_system) {
        this.database_transaction_log_bytes_used_system = database_transaction_log_bytes_used_system;
    }

    public Integer getDatabase_transaction_log_bytes_reserved_system() {
        return database_transaction_log_bytes_reserved_system;
    }

    public void setDatabase_transaction_log_bytes_reserved_system(Integer database_transaction_log_bytes_reserved_system) {
        this.database_transaction_log_bytes_reserved_system = database_transaction_log_bytes_reserved_system;
    }

    public BigDecimal getDatabase_transaction_begin_lsn() {
        return database_transaction_begin_lsn;
    }

    public void setDatabase_transaction_begin_lsn(BigDecimal database_transaction_begin_lsn) {
        this.database_transaction_begin_lsn = database_transaction_begin_lsn;
    }

    public BigDecimal getDatabase_transaction_last_lsn() {
        return database_transaction_last_lsn;
    }

    public void setDatabase_transaction_last_lsn(BigDecimal database_transaction_last_lsn) {
        this.database_transaction_last_lsn = database_transaction_last_lsn;
    }

    public BigDecimal getDatabase_transaction_most_recent_savepoint_lsn() {
        return database_transaction_most_recent_savepoint_lsn;
    }

    public void setDatabase_transaction_most_recent_savepoint_lsn(BigDecimal database_transaction_most_recent_savepoint_lsn) {
        this.database_transaction_most_recent_savepoint_lsn = database_transaction_most_recent_savepoint_lsn;
    }

    public BigDecimal getDatabase_transaction_commit_lsn() {
        return database_transaction_commit_lsn;
    }

    public void setDatabase_transaction_commit_lsn(BigDecimal database_transaction_commit_lsn) {
        this.database_transaction_commit_lsn = database_transaction_commit_lsn;
    }

    public BigDecimal getDatabase_transaction_last_rollback_lsn() {
        return database_transaction_last_rollback_lsn;
    }

    public void setDatabase_transaction_last_rollback_lsn(BigDecimal database_transaction_last_rollback_lsn) {
        this.database_transaction_last_rollback_lsn = database_transaction_last_rollback_lsn;
    }

    public BigDecimal getDatabase_transaction_next_undo_lsn() {
        return database_transaction_next_undo_lsn;
    }

    public void setDatabase_transaction_next_undo_lsn(BigDecimal database_transaction_next_undo_lsn) {
        this.database_transaction_next_undo_lsn = database_transaction_next_undo_lsn;
    }
}