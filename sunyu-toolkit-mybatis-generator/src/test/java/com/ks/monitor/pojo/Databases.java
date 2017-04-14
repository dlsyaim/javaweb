package com.ks.monitor.pojo;

import java.util.Date;

public class Databases {
    private String name;

    private Integer database_id;

    private Integer source_database_id;

    private Date create_date;

    private Byte compatibility_level;

    private String collation_name;

    private Byte user_access;

    private String user_access_desc;

    private Boolean is_read_only;

    private Boolean is_auto_close_on;

    private Boolean is_auto_shrink_on;

    private Byte state;

    private String state_desc;

    private Boolean is_in_standby;

    private Boolean is_cleanly_shutdown;

    private Boolean is_supplemental_logging_enabled;

    private Byte snapshot_isolation_state;

    private String snapshot_isolation_state_desc;

    private Boolean is_read_committed_snapshot_on;

    private Byte recovery_model;

    private String recovery_model_desc;

    private Byte page_verify_option;

    private String page_verify_option_desc;

    private Boolean is_auto_create_stats_on;

    private Boolean is_auto_update_stats_on;

    private Boolean is_auto_update_stats_async_on;

    private Boolean is_ansi_null_default_on;

    private Boolean is_ansi_nulls_on;

    private Boolean is_ansi_padding_on;

    private Boolean is_ansi_warnings_on;

    private Boolean is_arithabort_on;

    private Boolean is_concat_null_yields_null_on;

    private Boolean is_numeric_roundabort_on;

    private Boolean is_quoted_identifier_on;

    private Boolean is_recursive_triggers_on;

    private Boolean is_cursor_close_on_commit_on;

    private Boolean is_local_cursor_default;

    private Boolean is_fulltext_enabled;

    private Boolean is_trustworthy_on;

    private Boolean is_db_chaining_on;

    private Boolean is_parameterization_forced;

    private Boolean is_master_key_encrypted_by_server;

    private Boolean is_published;

    private Boolean is_subscribed;

    private Boolean is_merge_published;

    private Boolean is_distributor;

    private Boolean is_sync_with_backup;

    private String service_broker_guid;

    private Boolean is_broker_enabled;

    private Byte log_reuse_wait;

    private String log_reuse_wait_desc;

    private Boolean is_date_correlation_on;

    private Boolean is_cdc_enabled;

    private Boolean is_encrypted;

    private Boolean is_honor_broker_priority_on;

    private byte[] owner_sid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Integer database_id) {
        this.database_id = database_id;
    }

    public Integer getSource_database_id() {
        return source_database_id;
    }

    public void setSource_database_id(Integer source_database_id) {
        this.source_database_id = source_database_id;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Byte getCompatibility_level() {
        return compatibility_level;
    }

    public void setCompatibility_level(Byte compatibility_level) {
        this.compatibility_level = compatibility_level;
    }

    public String getCollation_name() {
        return collation_name;
    }

    public void setCollation_name(String collation_name) {
        this.collation_name = collation_name == null ? null : collation_name.trim();
    }

    public Byte getUser_access() {
        return user_access;
    }

    public void setUser_access(Byte user_access) {
        this.user_access = user_access;
    }

    public String getUser_access_desc() {
        return user_access_desc;
    }

    public void setUser_access_desc(String user_access_desc) {
        this.user_access_desc = user_access_desc == null ? null : user_access_desc.trim();
    }

    public Boolean getIs_read_only() {
        return is_read_only;
    }

    public void setIs_read_only(Boolean is_read_only) {
        this.is_read_only = is_read_only;
    }

    public Boolean getIs_auto_close_on() {
        return is_auto_close_on;
    }

    public void setIs_auto_close_on(Boolean is_auto_close_on) {
        this.is_auto_close_on = is_auto_close_on;
    }

    public Boolean getIs_auto_shrink_on() {
        return is_auto_shrink_on;
    }

    public void setIs_auto_shrink_on(Boolean is_auto_shrink_on) {
        this.is_auto_shrink_on = is_auto_shrink_on;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getState_desc() {
        return state_desc;
    }

    public void setState_desc(String state_desc) {
        this.state_desc = state_desc == null ? null : state_desc.trim();
    }

    public Boolean getIs_in_standby() {
        return is_in_standby;
    }

    public void setIs_in_standby(Boolean is_in_standby) {
        this.is_in_standby = is_in_standby;
    }

    public Boolean getIs_cleanly_shutdown() {
        return is_cleanly_shutdown;
    }

    public void setIs_cleanly_shutdown(Boolean is_cleanly_shutdown) {
        this.is_cleanly_shutdown = is_cleanly_shutdown;
    }

    public Boolean getIs_supplemental_logging_enabled() {
        return is_supplemental_logging_enabled;
    }

    public void setIs_supplemental_logging_enabled(Boolean is_supplemental_logging_enabled) {
        this.is_supplemental_logging_enabled = is_supplemental_logging_enabled;
    }

    public Byte getSnapshot_isolation_state() {
        return snapshot_isolation_state;
    }

    public void setSnapshot_isolation_state(Byte snapshot_isolation_state) {
        this.snapshot_isolation_state = snapshot_isolation_state;
    }

    public String getSnapshot_isolation_state_desc() {
        return snapshot_isolation_state_desc;
    }

    public void setSnapshot_isolation_state_desc(String snapshot_isolation_state_desc) {
        this.snapshot_isolation_state_desc = snapshot_isolation_state_desc == null ? null : snapshot_isolation_state_desc.trim();
    }

    public Boolean getIs_read_committed_snapshot_on() {
        return is_read_committed_snapshot_on;
    }

    public void setIs_read_committed_snapshot_on(Boolean is_read_committed_snapshot_on) {
        this.is_read_committed_snapshot_on = is_read_committed_snapshot_on;
    }

    public Byte getRecovery_model() {
        return recovery_model;
    }

    public void setRecovery_model(Byte recovery_model) {
        this.recovery_model = recovery_model;
    }

    public String getRecovery_model_desc() {
        return recovery_model_desc;
    }

    public void setRecovery_model_desc(String recovery_model_desc) {
        this.recovery_model_desc = recovery_model_desc == null ? null : recovery_model_desc.trim();
    }

    public Byte getPage_verify_option() {
        return page_verify_option;
    }

    public void setPage_verify_option(Byte page_verify_option) {
        this.page_verify_option = page_verify_option;
    }

    public String getPage_verify_option_desc() {
        return page_verify_option_desc;
    }

    public void setPage_verify_option_desc(String page_verify_option_desc) {
        this.page_verify_option_desc = page_verify_option_desc == null ? null : page_verify_option_desc.trim();
    }

    public Boolean getIs_auto_create_stats_on() {
        return is_auto_create_stats_on;
    }

    public void setIs_auto_create_stats_on(Boolean is_auto_create_stats_on) {
        this.is_auto_create_stats_on = is_auto_create_stats_on;
    }

    public Boolean getIs_auto_update_stats_on() {
        return is_auto_update_stats_on;
    }

    public void setIs_auto_update_stats_on(Boolean is_auto_update_stats_on) {
        this.is_auto_update_stats_on = is_auto_update_stats_on;
    }

    public Boolean getIs_auto_update_stats_async_on() {
        return is_auto_update_stats_async_on;
    }

    public void setIs_auto_update_stats_async_on(Boolean is_auto_update_stats_async_on) {
        this.is_auto_update_stats_async_on = is_auto_update_stats_async_on;
    }

    public Boolean getIs_ansi_null_default_on() {
        return is_ansi_null_default_on;
    }

    public void setIs_ansi_null_default_on(Boolean is_ansi_null_default_on) {
        this.is_ansi_null_default_on = is_ansi_null_default_on;
    }

    public Boolean getIs_ansi_nulls_on() {
        return is_ansi_nulls_on;
    }

    public void setIs_ansi_nulls_on(Boolean is_ansi_nulls_on) {
        this.is_ansi_nulls_on = is_ansi_nulls_on;
    }

    public Boolean getIs_ansi_padding_on() {
        return is_ansi_padding_on;
    }

    public void setIs_ansi_padding_on(Boolean is_ansi_padding_on) {
        this.is_ansi_padding_on = is_ansi_padding_on;
    }

    public Boolean getIs_ansi_warnings_on() {
        return is_ansi_warnings_on;
    }

    public void setIs_ansi_warnings_on(Boolean is_ansi_warnings_on) {
        this.is_ansi_warnings_on = is_ansi_warnings_on;
    }

    public Boolean getIs_arithabort_on() {
        return is_arithabort_on;
    }

    public void setIs_arithabort_on(Boolean is_arithabort_on) {
        this.is_arithabort_on = is_arithabort_on;
    }

    public Boolean getIs_concat_null_yields_null_on() {
        return is_concat_null_yields_null_on;
    }

    public void setIs_concat_null_yields_null_on(Boolean is_concat_null_yields_null_on) {
        this.is_concat_null_yields_null_on = is_concat_null_yields_null_on;
    }

    public Boolean getIs_numeric_roundabort_on() {
        return is_numeric_roundabort_on;
    }

    public void setIs_numeric_roundabort_on(Boolean is_numeric_roundabort_on) {
        this.is_numeric_roundabort_on = is_numeric_roundabort_on;
    }

    public Boolean getIs_quoted_identifier_on() {
        return is_quoted_identifier_on;
    }

    public void setIs_quoted_identifier_on(Boolean is_quoted_identifier_on) {
        this.is_quoted_identifier_on = is_quoted_identifier_on;
    }

    public Boolean getIs_recursive_triggers_on() {
        return is_recursive_triggers_on;
    }

    public void setIs_recursive_triggers_on(Boolean is_recursive_triggers_on) {
        this.is_recursive_triggers_on = is_recursive_triggers_on;
    }

    public Boolean getIs_cursor_close_on_commit_on() {
        return is_cursor_close_on_commit_on;
    }

    public void setIs_cursor_close_on_commit_on(Boolean is_cursor_close_on_commit_on) {
        this.is_cursor_close_on_commit_on = is_cursor_close_on_commit_on;
    }

    public Boolean getIs_local_cursor_default() {
        return is_local_cursor_default;
    }

    public void setIs_local_cursor_default(Boolean is_local_cursor_default) {
        this.is_local_cursor_default = is_local_cursor_default;
    }

    public Boolean getIs_fulltext_enabled() {
        return is_fulltext_enabled;
    }

    public void setIs_fulltext_enabled(Boolean is_fulltext_enabled) {
        this.is_fulltext_enabled = is_fulltext_enabled;
    }

    public Boolean getIs_trustworthy_on() {
        return is_trustworthy_on;
    }

    public void setIs_trustworthy_on(Boolean is_trustworthy_on) {
        this.is_trustworthy_on = is_trustworthy_on;
    }

    public Boolean getIs_db_chaining_on() {
        return is_db_chaining_on;
    }

    public void setIs_db_chaining_on(Boolean is_db_chaining_on) {
        this.is_db_chaining_on = is_db_chaining_on;
    }

    public Boolean getIs_parameterization_forced() {
        return is_parameterization_forced;
    }

    public void setIs_parameterization_forced(Boolean is_parameterization_forced) {
        this.is_parameterization_forced = is_parameterization_forced;
    }

    public Boolean getIs_master_key_encrypted_by_server() {
        return is_master_key_encrypted_by_server;
    }

    public void setIs_master_key_encrypted_by_server(Boolean is_master_key_encrypted_by_server) {
        this.is_master_key_encrypted_by_server = is_master_key_encrypted_by_server;
    }

    public Boolean getIs_published() {
        return is_published;
    }

    public void setIs_published(Boolean is_published) {
        this.is_published = is_published;
    }

    public Boolean getIs_subscribed() {
        return is_subscribed;
    }

    public void setIs_subscribed(Boolean is_subscribed) {
        this.is_subscribed = is_subscribed;
    }

    public Boolean getIs_merge_published() {
        return is_merge_published;
    }

    public void setIs_merge_published(Boolean is_merge_published) {
        this.is_merge_published = is_merge_published;
    }

    public Boolean getIs_distributor() {
        return is_distributor;
    }

    public void setIs_distributor(Boolean is_distributor) {
        this.is_distributor = is_distributor;
    }

    public Boolean getIs_sync_with_backup() {
        return is_sync_with_backup;
    }

    public void setIs_sync_with_backup(Boolean is_sync_with_backup) {
        this.is_sync_with_backup = is_sync_with_backup;
    }

    public String getService_broker_guid() {
        return service_broker_guid;
    }

    public void setService_broker_guid(String service_broker_guid) {
        this.service_broker_guid = service_broker_guid == null ? null : service_broker_guid.trim();
    }

    public Boolean getIs_broker_enabled() {
        return is_broker_enabled;
    }

    public void setIs_broker_enabled(Boolean is_broker_enabled) {
        this.is_broker_enabled = is_broker_enabled;
    }

    public Byte getLog_reuse_wait() {
        return log_reuse_wait;
    }

    public void setLog_reuse_wait(Byte log_reuse_wait) {
        this.log_reuse_wait = log_reuse_wait;
    }

    public String getLog_reuse_wait_desc() {
        return log_reuse_wait_desc;
    }

    public void setLog_reuse_wait_desc(String log_reuse_wait_desc) {
        this.log_reuse_wait_desc = log_reuse_wait_desc == null ? null : log_reuse_wait_desc.trim();
    }

    public Boolean getIs_date_correlation_on() {
        return is_date_correlation_on;
    }

    public void setIs_date_correlation_on(Boolean is_date_correlation_on) {
        this.is_date_correlation_on = is_date_correlation_on;
    }

    public Boolean getIs_cdc_enabled() {
        return is_cdc_enabled;
    }

    public void setIs_cdc_enabled(Boolean is_cdc_enabled) {
        this.is_cdc_enabled = is_cdc_enabled;
    }

    public Boolean getIs_encrypted() {
        return is_encrypted;
    }

    public void setIs_encrypted(Boolean is_encrypted) {
        this.is_encrypted = is_encrypted;
    }

    public Boolean getIs_honor_broker_priority_on() {
        return is_honor_broker_priority_on;
    }

    public void setIs_honor_broker_priority_on(Boolean is_honor_broker_priority_on) {
        this.is_honor_broker_priority_on = is_honor_broker_priority_on;
    }

    public byte[] getOwner_sid() {
        return owner_sid;
    }

    public void setOwner_sid(byte[] owner_sid) {
        this.owner_sid = owner_sid;
    }
}