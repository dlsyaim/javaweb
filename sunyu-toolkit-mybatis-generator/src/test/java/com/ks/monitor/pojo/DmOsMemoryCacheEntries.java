package com.ks.monitor.pojo;

public class DmOsMemoryCacheEntries {
    private String name;

    private String type;

    private Integer in_use_count;

    private Boolean is_dirty;

    private Integer disk_ios_count;

    private Integer context_switches_count;

    private Integer original_cost;

    private Integer current_cost;

    private Long pages_allocated_count;

    private String entry_data;

    private Integer pool_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getIn_use_count() {
        return in_use_count;
    }

    public void setIn_use_count(Integer in_use_count) {
        this.in_use_count = in_use_count;
    }

    public Boolean getIs_dirty() {
        return is_dirty;
    }

    public void setIs_dirty(Boolean is_dirty) {
        this.is_dirty = is_dirty;
    }

    public Integer getDisk_ios_count() {
        return disk_ios_count;
    }

    public void setDisk_ios_count(Integer disk_ios_count) {
        this.disk_ios_count = disk_ios_count;
    }

    public Integer getContext_switches_count() {
        return context_switches_count;
    }

    public void setContext_switches_count(Integer context_switches_count) {
        this.context_switches_count = context_switches_count;
    }

    public Integer getOriginal_cost() {
        return original_cost;
    }

    public void setOriginal_cost(Integer original_cost) {
        this.original_cost = original_cost;
    }

    public Integer getCurrent_cost() {
        return current_cost;
    }

    public void setCurrent_cost(Integer current_cost) {
        this.current_cost = current_cost;
    }

    public Long getPages_allocated_count() {
        return pages_allocated_count;
    }

    public void setPages_allocated_count(Long pages_allocated_count) {
        this.pages_allocated_count = pages_allocated_count;
    }

    public String getEntry_data() {
        return entry_data;
    }

    public void setEntry_data(String entry_data) {
        this.entry_data = entry_data == null ? null : entry_data.trim();
    }

    public Integer getPool_id() {
        return pool_id;
    }

    public void setPool_id(Integer pool_id) {
        this.pool_id = pool_id;
    }
}