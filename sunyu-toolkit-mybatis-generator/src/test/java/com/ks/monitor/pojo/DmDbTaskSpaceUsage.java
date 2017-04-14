package com.ks.monitor.pojo;

public class DmDbTaskSpaceUsage {
    private Short session_id;

    private Integer request_id;

    private Integer exec_context_id;

    private Short database_id;

    private Long user_objects_alloc_page_count;

    private Long user_objects_dealloc_page_count;

    private Long internal_objects_alloc_page_count;

    private Long internal_objects_dealloc_page_count;

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

    public Integer getExec_context_id() {
        return exec_context_id;
    }

    public void setExec_context_id(Integer exec_context_id) {
        this.exec_context_id = exec_context_id;
    }

    public Short getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Short database_id) {
        this.database_id = database_id;
    }

    public Long getUser_objects_alloc_page_count() {
        return user_objects_alloc_page_count;
    }

    public void setUser_objects_alloc_page_count(Long user_objects_alloc_page_count) {
        this.user_objects_alloc_page_count = user_objects_alloc_page_count;
    }

    public Long getUser_objects_dealloc_page_count() {
        return user_objects_dealloc_page_count;
    }

    public void setUser_objects_dealloc_page_count(Long user_objects_dealloc_page_count) {
        this.user_objects_dealloc_page_count = user_objects_dealloc_page_count;
    }

    public Long getInternal_objects_alloc_page_count() {
        return internal_objects_alloc_page_count;
    }

    public void setInternal_objects_alloc_page_count(Long internal_objects_alloc_page_count) {
        this.internal_objects_alloc_page_count = internal_objects_alloc_page_count;
    }

    public Long getInternal_objects_dealloc_page_count() {
        return internal_objects_dealloc_page_count;
    }

    public void setInternal_objects_dealloc_page_count(Long internal_objects_dealloc_page_count) {
        this.internal_objects_dealloc_page_count = internal_objects_dealloc_page_count;
    }
}