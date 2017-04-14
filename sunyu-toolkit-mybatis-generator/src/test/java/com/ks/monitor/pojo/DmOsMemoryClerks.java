package com.ks.monitor.pojo;

public class DmOsMemoryClerks {
    private String type;

    private String name;

    private Short memory_node_id;

    private Long single_pages_kb;

    private Long multi_pages_kb;

    private Long virtual_memory_reserved_kb;

    private Long virtual_memory_committed_kb;

    private Long awe_allocated_kb;

    private Long shared_memory_reserved_kb;

    private Long shared_memory_committed_kb;

    private Long page_size_bytes;

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

    public Short getMemory_node_id() {
        return memory_node_id;
    }

    public void setMemory_node_id(Short memory_node_id) {
        this.memory_node_id = memory_node_id;
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

    public Long getVirtual_memory_reserved_kb() {
        return virtual_memory_reserved_kb;
    }

    public void setVirtual_memory_reserved_kb(Long virtual_memory_reserved_kb) {
        this.virtual_memory_reserved_kb = virtual_memory_reserved_kb;
    }

    public Long getVirtual_memory_committed_kb() {
        return virtual_memory_committed_kb;
    }

    public void setVirtual_memory_committed_kb(Long virtual_memory_committed_kb) {
        this.virtual_memory_committed_kb = virtual_memory_committed_kb;
    }

    public Long getAwe_allocated_kb() {
        return awe_allocated_kb;
    }

    public void setAwe_allocated_kb(Long awe_allocated_kb) {
        this.awe_allocated_kb = awe_allocated_kb;
    }

    public Long getShared_memory_reserved_kb() {
        return shared_memory_reserved_kb;
    }

    public void setShared_memory_reserved_kb(Long shared_memory_reserved_kb) {
        this.shared_memory_reserved_kb = shared_memory_reserved_kb;
    }

    public Long getShared_memory_committed_kb() {
        return shared_memory_committed_kb;
    }

    public void setShared_memory_committed_kb(Long shared_memory_committed_kb) {
        this.shared_memory_committed_kb = shared_memory_committed_kb;
    }

    public Long getPage_size_bytes() {
        return page_size_bytes;
    }

    public void setPage_size_bytes(Long page_size_bytes) {
        this.page_size_bytes = page_size_bytes;
    }
}