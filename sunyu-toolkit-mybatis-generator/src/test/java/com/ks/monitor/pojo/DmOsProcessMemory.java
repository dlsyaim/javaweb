package com.ks.monitor.pojo;

public class DmOsProcessMemory {
    private Long physical_memory_in_use_kb;

    private Long large_page_allocations_kb;

    private Long locked_page_allocations_kb;

    private Long total_virtual_address_space_kb;

    private Long virtual_address_space_reserved_kb;

    private Long virtual_address_space_committed_kb;

    private Long virtual_address_space_available_kb;

    private Long page_fault_count;

    private Integer memory_utilization_percentage;

    private Long available_commit_limit_kb;

    private Boolean process_physical_memory_low;

    private Boolean process_virtual_memory_low;

    public Long getPhysical_memory_in_use_kb() {
        return physical_memory_in_use_kb;
    }

    public void setPhysical_memory_in_use_kb(Long physical_memory_in_use_kb) {
        this.physical_memory_in_use_kb = physical_memory_in_use_kb;
    }

    public Long getLarge_page_allocations_kb() {
        return large_page_allocations_kb;
    }

    public void setLarge_page_allocations_kb(Long large_page_allocations_kb) {
        this.large_page_allocations_kb = large_page_allocations_kb;
    }

    public Long getLocked_page_allocations_kb() {
        return locked_page_allocations_kb;
    }

    public void setLocked_page_allocations_kb(Long locked_page_allocations_kb) {
        this.locked_page_allocations_kb = locked_page_allocations_kb;
    }

    public Long getTotal_virtual_address_space_kb() {
        return total_virtual_address_space_kb;
    }

    public void setTotal_virtual_address_space_kb(Long total_virtual_address_space_kb) {
        this.total_virtual_address_space_kb = total_virtual_address_space_kb;
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

    public Long getVirtual_address_space_available_kb() {
        return virtual_address_space_available_kb;
    }

    public void setVirtual_address_space_available_kb(Long virtual_address_space_available_kb) {
        this.virtual_address_space_available_kb = virtual_address_space_available_kb;
    }

    public Long getPage_fault_count() {
        return page_fault_count;
    }

    public void setPage_fault_count(Long page_fault_count) {
        this.page_fault_count = page_fault_count;
    }

    public Integer getMemory_utilization_percentage() {
        return memory_utilization_percentage;
    }

    public void setMemory_utilization_percentage(Integer memory_utilization_percentage) {
        this.memory_utilization_percentage = memory_utilization_percentage;
    }

    public Long getAvailable_commit_limit_kb() {
        return available_commit_limit_kb;
    }

    public void setAvailable_commit_limit_kb(Long available_commit_limit_kb) {
        this.available_commit_limit_kb = available_commit_limit_kb;
    }

    public Boolean getProcess_physical_memory_low() {
        return process_physical_memory_low;
    }

    public void setProcess_physical_memory_low(Boolean process_physical_memory_low) {
        this.process_physical_memory_low = process_physical_memory_low;
    }

    public Boolean getProcess_virtual_memory_low() {
        return process_virtual_memory_low;
    }

    public void setProcess_virtual_memory_low(Boolean process_virtual_memory_low) {
        this.process_virtual_memory_low = process_virtual_memory_low;
    }
}