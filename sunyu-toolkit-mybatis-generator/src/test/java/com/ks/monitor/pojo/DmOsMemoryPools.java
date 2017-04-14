package com.ks.monitor.pojo;

public class DmOsMemoryPools {
    private Integer pool_id;

    private String type;

    private String name;

    private Long max_free_entries_count;

    private Long free_entries_count;

    private Long removed_in_all_rounds_count;

    private byte[] memory_pool_address;

    public Integer getPool_id() {
        return pool_id;
    }

    public void setPool_id(Integer pool_id) {
        this.pool_id = pool_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getMax_free_entries_count() {
        return max_free_entries_count;
    }

    public void setMax_free_entries_count(Long max_free_entries_count) {
        this.max_free_entries_count = max_free_entries_count;
    }

    public Long getFree_entries_count() {
        return free_entries_count;
    }

    public void setFree_entries_count(Long free_entries_count) {
        this.free_entries_count = free_entries_count;
    }

    public Long getRemoved_in_all_rounds_count() {
        return removed_in_all_rounds_count;
    }

    public void setRemoved_in_all_rounds_count(Long removed_in_all_rounds_count) {
        this.removed_in_all_rounds_count = removed_in_all_rounds_count;
    }

    public byte[] getMemory_pool_address() {
        return memory_pool_address;
    }

    public void setMemory_pool_address(byte[] memory_pool_address) {
        this.memory_pool_address = memory_pool_address;
    }
}