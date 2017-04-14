package com.ks.monitor.pojo;

public class DmDbFileSpaceUsage {
    private Short database_id;

    private Short file_id;

    private Long unallocated_extent_page_count;

    private Long version_store_reserved_page_count;

    private Long user_object_reserved_page_count;

    private Long internal_object_reserved_page_count;

    private Long mixed_extent_page_count;

    public Short getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Short database_id) {
        this.database_id = database_id;
    }

    public Short getFile_id() {
        return file_id;
    }

    public void setFile_id(Short file_id) {
        this.file_id = file_id;
    }

    public Long getUnallocated_extent_page_count() {
        return unallocated_extent_page_count;
    }

    public void setUnallocated_extent_page_count(Long unallocated_extent_page_count) {
        this.unallocated_extent_page_count = unallocated_extent_page_count;
    }

    public Long getVersion_store_reserved_page_count() {
        return version_store_reserved_page_count;
    }

    public void setVersion_store_reserved_page_count(Long version_store_reserved_page_count) {
        this.version_store_reserved_page_count = version_store_reserved_page_count;
    }

    public Long getUser_object_reserved_page_count() {
        return user_object_reserved_page_count;
    }

    public void setUser_object_reserved_page_count(Long user_object_reserved_page_count) {
        this.user_object_reserved_page_count = user_object_reserved_page_count;
    }

    public Long getInternal_object_reserved_page_count() {
        return internal_object_reserved_page_count;
    }

    public void setInternal_object_reserved_page_count(Long internal_object_reserved_page_count) {
        this.internal_object_reserved_page_count = internal_object_reserved_page_count;
    }

    public Long getMixed_extent_page_count() {
        return mixed_extent_page_count;
    }

    public void setMixed_extent_page_count(Long mixed_extent_page_count) {
        this.mixed_extent_page_count = mixed_extent_page_count;
    }
}