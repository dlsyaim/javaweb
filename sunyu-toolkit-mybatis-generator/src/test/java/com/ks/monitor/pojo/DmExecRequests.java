package com.ks.monitor.pojo;

import java.util.Date;

public class DmExecRequests {
    private Short session_id;

    private Integer request_id;

    private Date start_time;

    private String status;

    private String command;

    private Integer statement_start_offset;

    private Integer statement_end_offset;

    private Short database_id;

    private Integer user_id;

    private String connection_id;

    private Short blocking_session_id;

    private String wait_type;

    private Integer wait_time;

    private String last_wait_type;

    private String wait_resource;

    private Integer open_transaction_count;

    private Integer open_resultset_count;

    private Long transaction_id;

    private Float percent_complete;

    private Long estimated_completion_time;

    private Integer cpu_time;

    private Integer total_elapsed_time;

    private Integer scheduler_id;

    private Long reads;

    private Long writes;

    private Long logical_reads;

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

    private Integer nest_level;

    private Integer granted_query_memory;

    private Boolean executing_managed_code;

    private Integer group_id;

    public Short getSession_id() {
        return session_id;
    }

    public void setSession_id(Short session_id) {
        this.session_id = session_id;
    }

    public Integer getRequest_id() {
        return request_id;
    }

    public void setRequest_id(Integer request_id) {
        this.request_id = request_id;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    public Integer getStatement_start_offset() {
        return statement_start_offset;
    }

    public void setStatement_start_offset(Integer statement_start_offset) {
        this.statement_start_offset = statement_start_offset;
    }

    public Integer getStatement_end_offset() {
        return statement_end_offset;
    }

    public void setStatement_end_offset(Integer statement_end_offset) {
        this.statement_end_offset = statement_end_offset;
    }

    public Short getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Short database_id) {
        this.database_id = database_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getConnection_id() {
        return connection_id;
    }

    public void setConnection_id(String connection_id) {
        this.connection_id = connection_id == null ? null : connection_id.trim();
    }

    public Short getBlocking_session_id() {
        return blocking_session_id;
    }

    public void setBlocking_session_id(Short blocking_session_id) {
        this.blocking_session_id = blocking_session_id;
    }

    public String getWait_type() {
        return wait_type;
    }

    public void setWait_type(String wait_type) {
        this.wait_type = wait_type == null ? null : wait_type.trim();
    }

    public Integer getWait_time() {
        return wait_time;
    }

    public void setWait_time(Integer wait_time) {
        this.wait_time = wait_time;
    }

    public String getLast_wait_type() {
        return last_wait_type;
    }

    public void setLast_wait_type(String last_wait_type) {
        this.last_wait_type = last_wait_type == null ? null : last_wait_type.trim();
    }

    public String getWait_resource() {
        return wait_resource;
    }

    public void setWait_resource(String wait_resource) {
        this.wait_resource = wait_resource == null ? null : wait_resource.trim();
    }

    public Integer getOpen_transaction_count() {
        return open_transaction_count;
    }

    public void setOpen_transaction_count(Integer open_transaction_count) {
        this.open_transaction_count = open_transaction_count;
    }

    public Integer getOpen_resultset_count() {
        return open_resultset_count;
    }

    public void setOpen_resultset_count(Integer open_resultset_count) {
        this.open_resultset_count = open_resultset_count;
    }

    public Long getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(Long transaction_id) {
        this.transaction_id = transaction_id;
    }

    public Float getPercent_complete() {
        return percent_complete;
    }

    public void setPercent_complete(Float percent_complete) {
        this.percent_complete = percent_complete;
    }

    public Long getEstimated_completion_time() {
        return estimated_completion_time;
    }

    public void setEstimated_completion_time(Long estimated_completion_time) {
        this.estimated_completion_time = estimated_completion_time;
    }

    public Integer getCpu_time() {
        return cpu_time;
    }

    public void setCpu_time(Integer cpu_time) {
        this.cpu_time = cpu_time;
    }

    public Integer getTotal_elapsed_time() {
        return total_elapsed_time;
    }

    public void setTotal_elapsed_time(Integer total_elapsed_time) {
        this.total_elapsed_time = total_elapsed_time;
    }

    public Integer getScheduler_id() {
        return scheduler_id;
    }

    public void setScheduler_id(Integer scheduler_id) {
        this.scheduler_id = scheduler_id;
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

    public Integer getNest_level() {
        return nest_level;
    }

    public void setNest_level(Integer nest_level) {
        this.nest_level = nest_level;
    }

    public Integer getGranted_query_memory() {
        return granted_query_memory;
    }

    public void setGranted_query_memory(Integer granted_query_memory) {
        this.granted_query_memory = granted_query_memory;
    }

    public Boolean getExecuting_managed_code() {
        return executing_managed_code;
    }

    public void setExecuting_managed_code(Boolean executing_managed_code) {
        this.executing_managed_code = executing_managed_code;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }
}