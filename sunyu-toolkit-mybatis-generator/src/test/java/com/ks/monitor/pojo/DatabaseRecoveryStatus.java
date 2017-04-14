package com.ks.monitor.pojo;

import java.math.BigDecimal;

public class DatabaseRecoveryStatus {
    private Integer database_id;

    private String database_guid;

    private String family_guid;

    private BigDecimal last_log_backup_lsn;

    private String recovery_fork_guid;

    private String first_recovery_fork_guid;

    private BigDecimal fork_point_lsn;

    public Integer getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Integer database_id) {
        this.database_id = database_id;
    }

    public String getDatabase_guid() {
        return database_guid;
    }

    public void setDatabase_guid(String database_guid) {
        this.database_guid = database_guid == null ? null : database_guid.trim();
    }

    public String getFamily_guid() {
        return family_guid;
    }

    public void setFamily_guid(String family_guid) {
        this.family_guid = family_guid == null ? null : family_guid.trim();
    }

    public BigDecimal getLast_log_backup_lsn() {
        return last_log_backup_lsn;
    }

    public void setLast_log_backup_lsn(BigDecimal last_log_backup_lsn) {
        this.last_log_backup_lsn = last_log_backup_lsn;
    }

    public String getRecovery_fork_guid() {
        return recovery_fork_guid;
    }

    public void setRecovery_fork_guid(String recovery_fork_guid) {
        this.recovery_fork_guid = recovery_fork_guid == null ? null : recovery_fork_guid.trim();
    }

    public String getFirst_recovery_fork_guid() {
        return first_recovery_fork_guid;
    }

    public void setFirst_recovery_fork_guid(String first_recovery_fork_guid) {
        this.first_recovery_fork_guid = first_recovery_fork_guid == null ? null : first_recovery_fork_guid.trim();
    }

    public BigDecimal getFork_point_lsn() {
        return fork_point_lsn;
    }

    public void setFork_point_lsn(BigDecimal fork_point_lsn) {
        this.fork_point_lsn = fork_point_lsn;
    }
}