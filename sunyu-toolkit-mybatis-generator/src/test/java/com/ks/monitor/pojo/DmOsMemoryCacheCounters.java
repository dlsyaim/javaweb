package com.ks.monitor.pojo;

public class DmOsMemoryCacheCounters {
    private String name;

    private String type;

    private Long single_pages_kb;

    private Long multi_pages_kb;

    private Long single_pages_in_use_kb;

    private Long multi_pages_in_use_kb;

    private Long entries_count;

    private Long entries_in_use_count;

    private byte[] cache_address;

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

    public Long getSingle_pages_kb() {
        return single_pages_kb;
    }

    public void setSingle_pages_kb(Long single_pages_kb) {
        this.single_pages_kb = single_pages_kb;
    }

    public Long getMulti_pages_kb() {
        return multi_pages_kb;
    }

    public void setMulti_pages_kb(Long multi_pages_kb) {
        this.multi_pages_kb = multi_pages_kb;
    }

    public Long getSingle_pages_in_use_kb() {
        return single_pages_in_use_kb;
    }

    public void setSingle_pages_in_use_kb(Long single_pages_in_use_kb) {
        this.single_pages_in_use_kb = single_pages_in_use_kb;
    }

    public Long getMulti_pages_in_use_kb() {
        return multi_pages_in_use_kb;
    }

    public void setMulti_pages_in_use_kb(Long multi_pages_in_use_kb) {
        this.multi_pages_in_use_kb = multi_pages_in_use_kb;
    }

    public Long getEntries_count() {
        return entries_count;
    }

    public void setEntries_count(Long entries_count) {
        this.entries_count = entries_count;
    }

    public Long getEntries_in_use_count() {
        return entries_in_use_count;
    }

    public void setEntries_in_use_count(Long entries_in_use_count) {
        this.entries_in_use_count = entries_in_use_count;
    }

    public byte[] getCache_address() {
        return cache_address;
    }

    public void setCache_address(byte[] cache_address) {
        this.cache_address = cache_address;
    }
}