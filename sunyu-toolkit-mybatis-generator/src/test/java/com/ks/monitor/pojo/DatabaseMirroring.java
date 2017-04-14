package com.ks.monitor.pojo;

import java.math.BigDecimal;

public class DatabaseMirroring {
    private Integer database_id;

    private String mirroring_guid;

    private Byte mirroring_state;

    private String mirroring_state_desc;

    private Byte mirroring_role;

    private String mirroring_role_desc;

    private Integer mirroring_role_sequence;

    private Byte mirroring_safety_level;

    private String mirroring_safety_level_desc;

    private Integer mirroring_safety_sequence;

    private String mirroring_partner_name;

    private String mirroring_partner_instance;

    private String mirroring_witness_name;

    private Byte mirroring_witness_state;

    private String mirroring_witness_state_desc;

    private BigDecimal mirroring_failover_lsn;

    private Integer mirroring_connection_timeout;

    private Integer mirroring_redo_queue;

    private String mirroring_redo_queue_type;

    private BigDecimal mirroring_end_of_log_lsn;

    private BigDecimal mirroring_replication_lsn;

    public Integer getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Integer database_id) {
        this.database_id = database_id;
    }

    public String getMirroring_guid() {
        return mirroring_guid;
    }

    public void setMirroring_guid(String mirroring_guid) {
        this.mirroring_guid = mirroring_guid == null ? null : mirroring_guid.trim();
    }

    public Byte getMirroring_state() {
        return mirroring_state;
    }

    public void setMirroring_state(Byte mirroring_state) {
        this.mirroring_state = mirroring_state;
    }

    public String getMirroring_state_desc() {
        return mirroring_state_desc;
    }

    public void setMirroring_state_desc(String mirroring_state_desc) {
        this.mirroring_state_desc = mirroring_state_desc == null ? null : mirroring_state_desc.trim();
    }

    public Byte getMirroring_role() {
        return mirroring_role;
    }

    public void setMirroring_role(Byte mirroring_role) {
        this.mirroring_role = mirroring_role;
    }

    public String getMirroring_role_desc() {
        return mirroring_role_desc;
    }

    public void setMirroring_role_desc(String mirroring_role_desc) {
        this.mirroring_role_desc = mirroring_role_desc == null ? null : mirroring_role_desc.trim();
    }

    public Integer getMirroring_role_sequence() {
        return mirroring_role_sequence;
    }

    public void setMirroring_role_sequence(Integer mirroring_role_sequence) {
        this.mirroring_role_sequence = mirroring_role_sequence;
    }

    public Byte getMirroring_safety_level() {
        return mirroring_safety_level;
    }

    public void setMirroring_safety_level(Byte mirroring_safety_level) {
        this.mirroring_safety_level = mirroring_safety_level;
    }

    public String getMirroring_safety_level_desc() {
        return mirroring_safety_level_desc;
    }

    public void setMirroring_safety_level_desc(String mirroring_safety_level_desc) {
        this.mirroring_safety_level_desc = mirroring_safety_level_desc == null ? null : mirroring_safety_level_desc.trim();
    }

    public Integer getMirroring_safety_sequence() {
        return mirroring_safety_sequence;
    }

    public void setMirroring_safety_sequence(Integer mirroring_safety_sequence) {
        this.mirroring_safety_sequence = mirroring_safety_sequence;
    }

    public String getMirroring_partner_name() {
        return mirroring_partner_name;
    }

    public void setMirroring_partner_name(String mirroring_partner_name) {
        this.mirroring_partner_name = mirroring_partner_name == null ? null : mirroring_partner_name.trim();
    }

    public String getMirroring_partner_instance() {
        return mirroring_partner_instance;
    }

    public void setMirroring_partner_instance(String mirroring_partner_instance) {
        this.mirroring_partner_instance = mirroring_partner_instance == null ? null : mirroring_partner_instance.trim();
    }

    public String getMirroring_witness_name() {
        return mirroring_witness_name;
    }

    public void setMirroring_witness_name(String mirroring_witness_name) {
        this.mirroring_witness_name = mirroring_witness_name == null ? null : mirroring_witness_name.trim();
    }

    public Byte getMirroring_witness_state() {
        return mirroring_witness_state;
    }

    public void setMirroring_witness_state(Byte mirroring_witness_state) {
        this.mirroring_witness_state = mirroring_witness_state;
    }

    public String getMirroring_witness_state_desc() {
        return mirroring_witness_state_desc;
    }

    public void setMirroring_witness_state_desc(String mirroring_witness_state_desc) {
        this.mirroring_witness_state_desc = mirroring_witness_state_desc == null ? null : mirroring_witness_state_desc.trim();
    }

    public BigDecimal getMirroring_failover_lsn() {
        return mirroring_failover_lsn;
    }

    public void setMirroring_failover_lsn(BigDecimal mirroring_failover_lsn) {
        this.mirroring_failover_lsn = mirroring_failover_lsn;
    }

    public Integer getMirroring_connection_timeout() {
        return mirroring_connection_timeout;
    }

    public void setMirroring_connection_timeout(Integer mirroring_connection_timeout) {
        this.mirroring_connection_timeout = mirroring_connection_timeout;
    }

    public Integer getMirroring_redo_queue() {
        return mirroring_redo_queue;
    }

    public void setMirroring_redo_queue(Integer mirroring_redo_queue) {
        this.mirroring_redo_queue = mirroring_redo_queue;
    }

    public String getMirroring_redo_queue_type() {
        return mirroring_redo_queue_type;
    }

    public void setMirroring_redo_queue_type(String mirroring_redo_queue_type) {
        this.mirroring_redo_queue_type = mirroring_redo_queue_type == null ? null : mirroring_redo_queue_type.trim();
    }

    public BigDecimal getMirroring_end_of_log_lsn() {
        return mirroring_end_of_log_lsn;
    }

    public void setMirroring_end_of_log_lsn(BigDecimal mirroring_end_of_log_lsn) {
        this.mirroring_end_of_log_lsn = mirroring_end_of_log_lsn;
    }

    public BigDecimal getMirroring_replication_lsn() {
        return mirroring_replication_lsn;
    }

    public void setMirroring_replication_lsn(BigDecimal mirroring_replication_lsn) {
        this.mirroring_replication_lsn = mirroring_replication_lsn;
    }
}