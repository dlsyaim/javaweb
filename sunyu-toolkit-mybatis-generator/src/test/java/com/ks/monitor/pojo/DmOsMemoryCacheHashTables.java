package com.ks.monitor.pojo;

public class DmOsMemoryCacheHashTables {
    private String name;

    private String type;

    private Integer table_level;

    private Integer buckets_count;

    private Integer buckets_in_use_count;

    private Integer buckets_min_length;

    private Integer buckets_max_length;

    private Integer buckets_avg_length;

    private Integer buckets_max_length_ever;

    private Long hits_count;

    private Long misses_count;

    private Integer buckets_avg_scan_hit_length;

    private Integer buckets_avg_scan_miss_length;

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

    public Integer getTable_level() {
        return table_level;
    }

    public void setTable_level(Integer table_level) {
        this.table_level = table_level;
    }

    public Integer getBuckets_count() {
        return buckets_count;
    }

    public void setBuckets_count(Integer buckets_count) {
        this.buckets_count = buckets_count;
    }

    public Integer getBuckets_in_use_count() {
        return buckets_in_use_count;
    }

    public void setBuckets_in_use_count(Integer buckets_in_use_count) {
        this.buckets_in_use_count = buckets_in_use_count;
    }

    public Integer getBuckets_min_length() {
        return buckets_min_length;
    }

    public void setBuckets_min_length(Integer buckets_min_length) {
        this.buckets_min_length = buckets_min_length;
    }

    public Integer getBuckets_max_length() {
        return buckets_max_length;
    }

    public void setBuckets_max_length(Integer buckets_max_length) {
        this.buckets_max_length = buckets_max_length;
    }

    public Integer getBuckets_avg_length() {
        return buckets_avg_length;
    }

    public void setBuckets_avg_length(Integer buckets_avg_length) {
        this.buckets_avg_length = buckets_avg_length;
    }

    public Integer getBuckets_max_length_ever() {
        return buckets_max_length_ever;
    }

    public void setBuckets_max_length_ever(Integer buckets_max_length_ever) {
        this.buckets_max_length_ever = buckets_max_length_ever;
    }

    public Long getHits_count() {
        return hits_count;
    }

    public void setHits_count(Long hits_count) {
        this.hits_count = hits_count;
    }

    public Long getMisses_count() {
        return misses_count;
    }

    public void setMisses_count(Long misses_count) {
        this.misses_count = misses_count;
    }

    public Integer getBuckets_avg_scan_hit_length() {
        return buckets_avg_scan_hit_length;
    }

    public void setBuckets_avg_scan_hit_length(Integer buckets_avg_scan_hit_length) {
        this.buckets_avg_scan_hit_length = buckets_avg_scan_hit_length;
    }

    public Integer getBuckets_avg_scan_miss_length() {
        return buckets_avg_scan_miss_length;
    }

    public void setBuckets_avg_scan_miss_length(Integer buckets_avg_scan_miss_length) {
        this.buckets_avg_scan_miss_length = buckets_avg_scan_miss_length;
    }

    public byte[] getCache_address() {
        return cache_address;
    }

    public void setCache_address(byte[] cache_address) {
        this.cache_address = cache_address;
    }
}