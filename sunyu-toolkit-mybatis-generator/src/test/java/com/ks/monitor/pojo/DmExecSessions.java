package com.ks.monitor.pojo;

import java.util.Date;

public class DmExecSessions {
    private Short session_id;

    private Date login_time;

    private String host_name;

    private String program_name;

    private Integer host_process_id;

    private Integer client_version;

    private String client_interface_name;

    private String login_name;

    private String nt_domain;

    private String nt_user_name;

    private String status;

    private Integer cpu_time;

    private Integer memory_usage;

    private Integer total_scheduled_time;

    private Integer total_elapsed_time;

    private Integer endpoint_id;

    private Date last_request_start_time;

    private Date last_request_end_time;

    private Long reads;

    private Long writes;

    private Long logical_reads;

    private Boolean is_user_process;

    private Integer text_size;

    private String language;

    private String date_format;

    private Short date_first;

    private Boolean quoted_identifier;

    private Boolean arithabort;

    private Boolean ansi_null_dflt_on;

    private Boolean ansi_defaults;

    private Boolean ansi_warnings;

    private Boolean ansi_padding;

    private Boolean ansi_nulls;

    private Boolean concat_null_yields_null;

    private Short transaction_isolation_level;

    private Integer lock_timeout;

    private Integer deadlock_priority;

    private Long row_count;

    private Integer prev_error;

    private String original_login_name;

    private Date last_successful_logon;

    private Date last_unsuccessful_logon;

    private Long unsuccessful_logons;

    private Integer group_id;

    public Short getSession_id() {
        return session_id;
    }

    public void setSession_id(Short session_id) {
        this.session_id = session_id;
    }

    public Date getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name == null ? null : host_name.trim();
    }

    public String getProgram_name() {
        return program_name;
    }

    public void setProgram_name(String program_name) {
        this.program_name = program_name == null ? null : program_name.trim();
    }

    public Integer getHost_process_id() {
        return host_process_id;
    }

    public void setHost_process_id(Integer host_process_id) {
        this.host_process_id = host_process_id;
    }

    public Integer getClient_version() {
        return client_version;
    }

    public void setClient_version(Integer client_version) {
        this.client_version = client_version;
    }

    public String getClient_interface_name() {
        return client_interface_name;
    }

    public void setClient_interface_name(String client_interface_name) {
        this.client_interface_name = client_interface_name == null ? null : client_interface_name.trim();
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name == null ? null : login_name.trim();
    }

    public String getNt_domain() {
        return nt_domain;
    }

    public void setNt_domain(String nt_domain) {
        this.nt_domain = nt_domain == null ? null : nt_domain.trim();
    }

    public String getNt_user_name() {
        return nt_user_name;
    }

    public void setNt_user_name(String nt_user_name) {
        this.nt_user_name = nt_user_name == null ? null : nt_user_name.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getCpu_time() {
        return cpu_time;
    }

    public void setCpu_time(Integer cpu_time) {
        this.cpu_time = cpu_time;
    }

    public Integer getMemory_usage() {
        return memory_usage;
    }

    public void setMemory_usage(Integer memory_usage) {
        this.memory_usage = memory_usage;
    }

    public Integer getTotal_scheduled_time() {
        return total_scheduled_time;
    }

    public void setTotal_scheduled_time(Integer total_scheduled_time) {
        this.total_scheduled_time = total_scheduled_time;
    }

    public Integer getTotal_elapsed_time() {
        return total_elapsed_time;
    }

    public void setTotal_elapsed_time(Integer total_elapsed_time) {
        this.total_elapsed_time = total_elapsed_time;
    }

    public Integer getEndpoint_id() {
        return endpoint_id;
    }

    public void setEndpoint_id(Integer endpoint_id) {
        this.endpoint_id = endpoint_id;
    }

    public Date getLast_request_start_time() {
        return last_request_start_time;
    }

    public void setLast_request_start_time(Date last_request_start_time) {
        this.last_request_start_time = last_request_start_time;
    }

    public Date getLast_request_end_time() {
        return last_request_end_time;
    }

    public void setLast_request_end_time(Date last_request_end_time) {
        this.last_request_end_time = last_request_end_time;
    }

    public Long getReads() {
        return reads;
    }

    public void setReads(Long reads) {
        this.reads = reads;
    }

    public Long getWrites() {
        return writes;
    }

    public void setWrites(Long writes) {
        this.writes = writes;
    }

    public Long getLogical_reads() {
        return logical_reads;
    }

    public void setLogical_reads(Long logical_reads) {
        this.logical_reads = logical_reads;
    }

    public Boolean getIs_user_process() {
        return is_user_process;
    }

    public void setIs_user_process(Boolean is_user_process) {
        this.is_user_process = is_user_process;
    }

    public Integer getText_size() {
        return text_size;
    }

    public void setText_size(Integer text_size) {
        this.text_size = text_size;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getDate_format() {
        return date_format;
    }

    public void setDate_format(String date_format) {
        this.date_format = date_format == null ? null : date_format.trim();
    }

    public Short getDate_first() {
        return date_first;
    }

    public void setDate_first(Short date_first) {
        this.date_first = date_first;
    }

    public Boolean getQuoted_identifier() {
        return quoted_identifier;
    }

    public void setQuoted_identifier(Boolean quoted_identifier) {
        this.quoted_identifier = quoted_identifier;
    }

    public Boolean getArithabort() {
        return arithabort;
    }

    public void setArithabort(Boolean arithabort) {
        this.arithabort = arithabort;
    }

    public Boolean getAnsi_null_dflt_on() {
        return ansi_null_dflt_on;
    }

    public void setAnsi_null_dflt_on(Boolean ansi_null_dflt_on) {
        this.ansi_null_dflt_on = ansi_null_dflt_on;
    }

    public Boolean getAnsi_defaults() {
        return ansi_defaults;
    }

    public void setAnsi_defaults(Boolean ansi_defaults) {
        this.ansi_defaults = ansi_defaults;
    }

    public Boolean getAnsi_warnings() {
        return ansi_warnings;
    }

    public void setAnsi_warnings(Boolean ansi_warnings) {
        this.ansi_warnings = ansi_warnings;
    }

    public Boolean getAnsi_padding() {
        return ansi_padding;
    }

    public void setAnsi_padding(Boolean ansi_padding) {
        this.ansi_padding = ansi_padding;
    }

    public Boolean getAnsi_nulls() {
        return ansi_nulls;
    }

    public void setAnsi_nulls(Boolean ansi_nulls) {
        this.ansi_nulls = ansi_nulls;
    }

    public Boolean getConcat_null_yields_null() {
        return concat_null_yields_null;
    }

    public void setConcat_null_yields_null(Boolean concat_null_yields_null) {
        this.concat_null_yields_null = concat_null_yields_null;
    }

    public Short getTransaction_isolation_level() {
        return transaction_isolation_level;
    }

    public void setTransaction_isolation_level(Short transaction_isolation_level) {
        this.transaction_isolation_level = transaction_isolation_level;
    }

    public Integer getLock_timeout() {
        return lock_timeout;
    }

    public void setLock_timeout(Integer lock_timeout) {
        this.lock_timeout = lock_timeout;
    }

    public Integer getDeadlock_priority() {
        return deadlock_priority;
    }

    public void setDeadlock_priority(Integer deadlock_priority) {
        this.deadlock_priority = deadlock_priority;
    }

    public Long getRow_count() {
        return row_count;
    }

    public void setRow_count(Long row_count) {
        this.row_count = row_count;
    }

    public Integer getPrev_error() {
        return prev_error;
    }

    public void setPrev_error(Integer prev_error) {
        this.prev_error = prev_error;
    }

    public String getOriginal_login_name() {
        return original_login_name;
    }

    public void setOriginal_login_name(String original_login_name) {
        this.original_login_name = original_login_name == null ? null : original_login_name.trim();
    }

    public Date getLast_successful_logon() {
        return last_successful_logon;
    }

    public void setLast_successful_logon(Date last_successful_logon) {
        this.last_successful_logon = last_successful_logon;
    }

    public Date getLast_unsuccessful_logon() {
        return last_unsuccessful_logon;
    }

    public void setLast_unsuccessful_logon(Date last_unsuccessful_logon) {
        this.last_unsuccessful_logon = last_unsuccessful_logon;
    }

    public Long getUnsuccessful_logons() {
        return unsuccessful_logons;
    }

    public void setUnsuccessful_logons(Long unsuccessful_logons) {
        this.unsuccessful_logons = unsuccessful_logons;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }
}