package com.ks.monitor.pojo;

public class DmTranLocks {
    private String resource_type;

    private String resource_subtype;

    private Integer resource_database_id;

    private String resource_description;

    private Long resource_associated_entity_id;

    private Integer resource_lock_partition;

    private String request_mode;

    private String request_type;

    private String request_status;

    private Short request_reference_count;

    private Integer request_lifetime;

    private Integer request_session_id;

    private Integer request_exec_context_id;

    private Integer request_request_id;

    private String request_owner_type;

    private Long request_owner_id;

    private String request_owner_guid;

    private String request_owner_lockspace_id;

    private byte[] lock_owner_address;

    public String getResource_type() {
        return resource_type;
    }

    public void setResource_type(String resource_type) {
        this.resource_type = resource_type == null ? null : resource_type.trim();
    }

    public String getResource_subtype() {
        return resource_subtype;
    }

    public void setResource_subtype(String resource_subtype) {
        this.resource_subtype = resource_subtype == null ? null : resource_subtype.trim();
    }

    public Integer getResource_database_id() {
        return resource_database_id;
    }

    public void setResource_database_id(Integer resource_database_id) {
        this.resource_database_id = resource_database_id;
    }

    public String getResource_description() {
        return resource_description;
    }

    public void setResource_description(String resource_description) {
        this.resource_description = resource_description == null ? null : resource_description.trim();
    }

    public Long getResource_associated_entity_id() {
        return resource_associated_entity_id;
    }

    public void setResource_associated_entity_id(Long resource_associated_entity_id) {
        this.resource_associated_entity_id = resource_associated_entity_id;
    }

    public Integer getResource_lock_partition() {
        return resource_lock_partition;
    }

    public void setResource_lock_partition(Integer resource_lock_partition) {
        this.resource_lock_partition = resource_lock_partition;
    }

    public String getRequest_mode() {
        return request_mode;
    }

    public void setRequest_mode(String request_mode) {
        this.request_mode = request_mode == null ? null : request_mode.trim();
    }

    public String getRequest_type() {
        return request_type;
    }

    public void setRequest_type(String request_type) {
        this.request_type = request_type == null ? null : request_type.trim();
    }

    public String getRequest_status() {
        return request_status;
    }

    public void setRequest_status(String request_status) {
        this.request_status = request_status == null ? null : request_status.trim();
    }

    public Short getRequest_reference_count() {
        return request_reference_count;
    }

    public void setRequest_reference_count(Short request_reference_count) {
        this.request_reference_count = request_reference_count;
    }

    public Integer getRequest_lifetime() {
        return request_lifetime;
    }

    public void setRequest_lifetime(Integer request_lifetime) {
        this.request_lifetime = request_lifetime;
    }

    public Integer getRequest_session_id() {
        return request_session_id;
    }

    public void setRequest_session_id(Integer request_session_id) {
        this.request_session_id = request_session_id;
    }

    public Integer getRequest_exec_context_id() {
        return request_exec_context_id;
    }

    public void setRequest_exec_context_id(Integer request_exec_context_id) {
        this.request_exec_context_id = request_exec_context_id;
    }

    public Integer getRequest_request_id() {
        return request_request_id;
    }

    public void setRequest_request_id(Integer request_request_id) {
        this.request_request_id = request_request_id;
    }

    public String getRequest_owner_type() {
        return request_owner_type;
    }

    public void setRequest_owner_type(String request_owner_type) {
        this.request_owner_type = request_owner_type == null ? null : request_owner_type.trim();
    }

    public Long getRequest_owner_id() {
        return request_owner_id;
    }

    public void setRequest_owner_id(Long request_owner_id) {
        this.request_owner_id = request_owner_id;
    }

    public String getRequest_owner_guid() {
        return request_owner_guid;
    }

    public void setRequest_owner_guid(String request_owner_guid) {
        this.request_owner_guid = request_owner_guid == null ? null : request_owner_guid.trim();
    }

    public String getRequest_owner_lockspace_id() {
        return request_owner_lockspace_id;
    }

    public void setRequest_owner_lockspace_id(String request_owner_lockspace_id) {
        this.request_owner_lockspace_id = request_owner_lockspace_id == null ? null : request_owner_lockspace_id.trim();
    }

    public byte[] getLock_owner_address() {
        return lock_owner_address;
    }

    public void setLock_owner_address(byte[] lock_owner_address) {
        this.lock_owner_address = lock_owner_address;
    }
}