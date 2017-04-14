package com.ks.monitor.pojo;

public class DmOsMemoryNodes {
    private Short memory_node_id;

    private Long virtual_address_space_reserved_kb;

    private Long virtual_address_space_committed_kb;

    private Long locked_page_allocations_kb;

    private Long single_pages_kb;

    private Long multi_pages_kb;

    private Long shared_memory_reserved_kb;

    private Long shared_memory_committed_kb;

    private Long cpu_affinity_mask;

    private Long online_scheduler_mask;

    private Short processor_group;

    public Short getMemory_node_id() {
        return memory_node_id;
    }

    public void setMemory_node_id(Short memory_node_id) {
        this.memory_node_id = memory_node_id;
    }

    public Long getVirtual_address_space_reserved_kb() {
        return virtual_address_space_reserved_kb;
    }

    public void setVirtual_address_space_reserved_kb(Long virtual_address_space_reserved_kb) {
        this.virtual_address_space_reserved_kb = virtual_address_space_reserved_kb;
    }

    public Long getVirtual_address_space_committed_kb() {
        return virtual_address_space_committed_kb;
    }

    public void setVirtual_address_space_committed_kb(Long virtual_address_space_committed_kb) {
        this.virtual_address_space_committed_kb = virtual_address_space_committed_kb;
    }

    public Long getLocked_page_allocations_kb() {
        return locked_page_allocations_kb;
    }

    public void setLocked_page_allocations_kb(Long locked_page_allocations_kb) {
        this.locked_page_allocations_kb = locked_page_allocations_kb;
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

    public Long getCpu_affinity_mask() {
        return cpu_affinity_mask;
    }

    public void setCpu_affinity_mask(Long cpu_affinity_mask) {
        this.cpu_affinity_mask = cpu_affinity_mask;
    }

    public Long getOnline_scheduler_mask() {
        return online_scheduler_mask;
    }

    public void setOnline_scheduler_mask(Long online_scheduler_mask) {
        this.online_scheduler_mask = online_scheduler_mask;
    }

    public Short getProcessor_group() {
        return processor_group;
    }

    public void setProcessor_group(Short processor_group) {
        this.processor_group = processor_group;
    }
}