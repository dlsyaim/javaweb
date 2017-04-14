package com.ks.monitor.pojo;

public class DmDbIndexPhysicalStats {
    private Short database_id;

    private Integer object_id;

    private Integer index_id;

    private Integer partition_number;

    private String index_type_desc;

    private String alloc_unit_type_desc;

    private Byte index_depth;

    private Byte index_level;

    private Double avg_fragmentation_in_percent;

    private Long fragment_count;

    private Double avg_fragment_size_in_pages;

    private Long page_count;

    private Double avg_page_space_used_in_percent;

    private Long record_count;

    private Long ghost_record_count;

    private Long version_ghost_record_count;

    private Integer min_record_size_in_bytes;

    private Integer max_record_size_in_bytes;

    private Double avg_record_size_in_bytes;

    private Long forwarded_record_count;

    private Long compressed_page_count;

    public Short getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Short database_id) {
        this.database_id = database_id;
    }

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public Integer getIndex_id() {
        return index_id;
    }

    public void setIndex_id(Integer index_id) {
        this.index_id = index_id;
    }

    public Integer getPartition_number() {
        return partition_number;
    }

    public void setPartition_number(Integer partition_number) {
        this.partition_number = partition_number;
    }

    public String getIndex_type_desc() {
        return index_type_desc;
    }

    public void setIndex_type_desc(String index_type_desc) {
        this.index_type_desc = index_type_desc == null ? null : index_type_desc.trim();
    }

    public String getAlloc_unit_type_desc() {
        return alloc_unit_type_desc;
    }

    public void setAlloc_unit_type_desc(String alloc_unit_type_desc) {
        this.alloc_unit_type_desc = alloc_unit_type_desc == null ? null : alloc_unit_type_desc.trim();
    }

    public Byte getIndex_depth() {
        return index_depth;
    }

    public void setIndex_depth(Byte index_depth) {
        this.index_depth = index_depth;
    }

    public Byte getIndex_level() {
        return index_level;
    }

    public void setIndex_level(Byte index_level) {
        this.index_level = index_level;
    }

    public Double getAvg_fragmentation_in_percent() {
        return avg_fragmentation_in_percent;
    }

    public void setAvg_fragmentation_in_percent(Double avg_fragmentation_in_percent) {
        this.avg_fragmentation_in_percent = avg_fragmentation_in_percent;
    }

    public Long getFragment_count() {
        return fragment_count;
    }

    public void setFragment_count(Long fragment_count) {
        this.fragment_count = fragment_count;
    }

    public Double getAvg_fragment_size_in_pages() {
        return avg_fragment_size_in_pages;
    }

    public void setAvg_fragment_size_in_pages(Double avg_fragment_size_in_pages) {
        this.avg_fragment_size_in_pages = avg_fragment_size_in_pages;
    }

    public Long getPage_count() {
        return page_count;
    }

    public void setPage_count(Long page_count) {
        this.page_count = page_count;
    }

    public Double getAvg_page_space_used_in_percent() {
        return avg_page_space_used_in_percent;
    }

    public void setAvg_page_space_used_in_percent(Double avg_page_space_used_in_percent) {
        this.avg_page_space_used_in_percent = avg_page_space_used_in_percent;
    }

    public Long getRecord_count() {
        return record_count;
    }

    public void setRecord_count(Long record_count) {
        this.record_count = record_count;
    }

    public Long getGhost_record_count() {
        return ghost_record_count;
    }

    public void setGhost_record_count(Long ghost_record_count) {
        this.ghost_record_count = ghost_record_count;
    }

    public Long getVersion_ghost_record_count() {
        return version_ghost_record_count;
    }

    public void setVersion_ghost_record_count(Long version_ghost_record_count) {
        this.version_ghost_record_count = version_ghost_record_count;
    }

    public Integer getMin_record_size_in_bytes() {
        return min_record_size_in_bytes;
    }

    public void setMin_record_size_in_bytes(Integer min_record_size_in_bytes) {
        this.min_record_size_in_bytes = min_record_size_in_bytes;
    }

    public Integer getMax_record_size_in_bytes() {
        return max_record_size_in_bytes;
    }

    public void setMax_record_size_in_bytes(Integer max_record_size_in_bytes) {
        this.max_record_size_in_bytes = max_record_size_in_bytes;
    }

    public Double getAvg_record_size_in_bytes() {
        return avg_record_size_in_bytes;
    }

    public void setAvg_record_size_in_bytes(Double avg_record_size_in_bytes) {
        this.avg_record_size_in_bytes = avg_record_size_in_bytes;
    }

    public Long getForwarded_record_count() {
        return forwarded_record_count;
    }

    public void setForwarded_record_count(Long forwarded_record_count) {
        this.forwarded_record_count = forwarded_record_count;
    }

    public Long getCompressed_page_count() {
        return compressed_page_count;
    }

    public void setCompressed_page_count(Long compressed_page_count) {
        this.compressed_page_count = compressed_page_count;
    }
}