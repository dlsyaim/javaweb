package com.ks.monitor.pojo;

public class FnGetAuditFile {
    private String event_time;

    private Integer sequence_number;

    private String action_id;

    private Boolean succeeded;

    private Long permission_bitmask;

    private Boolean is_column_permission;

    private Short session_id;

    private Integer server_principal_id;

    private Integer database_principal_id;

    private Integer target_server_principal_id;

    private Integer target_database_principal_id;

    private Integer object_id;

    private String class_type;

    private String session_server_principal_name;

    private String server_principal_name;

    private String database_principal_name;

    private String target_server_principal_name;

    private String target_database_principal_name;

    private String server_instance_name;

    private String database_name;

    private String schema_name;

    private String object_name;

    private String statement;

    private String additional_information;

    private String file_name;

    private Long audit_file_offset;

    public String getEvent_time() {
        return event_time;
    }

    public void setEvent_time(String event_time) {
        this.event_time = event_time == null ? null : event_time.trim();
    }

    public Integer getSequence_number() {
        return sequence_number;
    }

    public void setSequence_number(Integer sequence_number) {
        this.sequence_number = sequence_number;
    }

    public String getAction_id() {
        return action_id;
    }

    public void setAction_id(String action_id) {
        this.action_id = action_id == null ? null : action_id.trim();
    }

    public Boolean getSucceeded() {
        return succeeded;
    }

    public void setSucceeded(Boolean succeeded) {
        this.succeeded = succeeded;
    }

    public Long getPermission_bitmask() {
        return permission_bitmask;
    }

    public void setPermission_bitmask(Long permission_bitmask) {
        this.permission_bitmask = permission_bitmask;
    }

    public Boolean getIs_column_permission() {
        return is_column_permission;
    }

    public void setIs_column_permission(Boolean is_column_permission) {
        this.is_column_permission = is_column_permission;
    }

    public Short getSession_id() {
        return session_id;
    }

    public void setSession_id(Short session_id) {
        this.session_id = session_id;
    }

    public Integer getServer_principal_id() {
        return server_principal_id;
    }

    public void setServer_principal_id(Integer server_principal_id) {
        this.server_principal_id = server_principal_id;
    }

    public Integer getDatabase_principal_id() {
        return database_principal_id;
    }

    public void setDatabase_principal_id(Integer database_principal_id) {
        this.database_principal_id = database_principal_id;
    }

    public Integer getTarget_server_principal_id() {
        return target_server_principal_id;
    }

    public void setTarget_server_principal_id(Integer target_server_principal_id) {
        this.target_server_principal_id = target_server_principal_id;
    }

    public Integer getTarget_database_principal_id() {
        return target_database_principal_id;
    }

    public void setTarget_database_principal_id(Integer target_database_principal_id) {
        this.target_database_principal_id = target_database_principal_id;
    }

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public String getClass_type() {
        return class_type;
    }

    public void setClass_type(String class_type) {
        this.class_type = class_type == null ? null : class_type.trim();
    }

    public String getSession_server_principal_name() {
        return session_server_principal_name;
    }

    public void setSession_server_principal_name(String session_server_principal_name) {
        this.session_server_principal_name = session_server_principal_name == null ? null : session_server_principal_name.trim();
    }

    public String getServer_principal_name() {
        return server_principal_name;
    }

    public void setServer_principal_name(String server_principal_name) {
        this.server_principal_name = server_principal_name == null ? null : server_principal_name.trim();
    }

    public String getDatabase_principal_name() {
        return database_principal_name;
    }

    public void setDatabase_principal_name(String database_principal_name) {
        this.database_principal_name = database_principal_name == null ? null : database_principal_name.trim();
    }

    public String getTarget_server_principal_name() {
        return target_server_principal_name;
    }

    public void setTarget_server_principal_name(String target_server_principal_name) {
        this.target_server_principal_name = target_server_principal_name == null ? null : target_server_principal_name.trim();
    }

    public String getTarget_database_principal_name() {
        return target_database_principal_name;
    }

    public void setTarget_database_principal_name(String target_database_principal_name) {
        this.target_database_principal_name = target_database_principal_name == null ? null : target_database_principal_name.trim();
    }

    public String getServer_instance_name() {
        return server_instance_name;
    }

    public void setServer_instance_name(String server_instance_name) {
        this.server_instance_name = server_instance_name == null ? null : server_instance_name.trim();
    }

    public String getDatabase_name() {
        return database_name;
    }

    public void setDatabase_name(String database_name) {
        this.database_name = database_name == null ? null : database_name.trim();
    }

    public String getSchema_name() {
        return schema_name;
    }

    public void setSchema_name(String schema_name) {
        this.schema_name = schema_name == null ? null : schema_name.trim();
    }

    public String getObject_name() {
        return object_name;
    }

    public void setObject_name(String object_name) {
        this.object_name = object_name == null ? null : object_name.trim();
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement == null ? null : statement.trim();
    }

    public String getAdditional_information() {
        return additional_information;
    }

    public void setAdditional_information(String additional_information) {
        this.additional_information = additional_information == null ? null : additional_information.trim();
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name == null ? null : file_name.trim();
    }

    public Long getAudit_file_offset() {
        return audit_file_offset;
    }

    public void setAudit_file_offset(Long audit_file_offset) {
        this.audit_file_offset = audit_file_offset;
    }
}