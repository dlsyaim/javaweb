package com.ks.monitor.pojo;

public class DmDbSessionSpaceUsage {
    private Short session_id;

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