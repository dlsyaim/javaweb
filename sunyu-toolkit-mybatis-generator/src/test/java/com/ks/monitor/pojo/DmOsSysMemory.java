package com.ks.monitor.pojo;

public class DmOsSysMemory {
    private Long total_physical_memory_kb;

    private Long available_physical_memory_kb;

    private Long total_page_file_kb;

    private Long available_page_file_kb;

    private Long system_cache_kb;

    private Long kernel_paged_pool_kb;

    private Long kernel_nonpaged_pool_kb;

    private Boolean system_high_memory_signal_state;

    private Boolean system_low_memory_signal_state;

    private String system_memory_state_desc;

    public Long getTotal_physical_memory_kb() {
        return total_physical_memory_kb;
    }

    public void setTotal_physical_memory_kb(Long total_physical_memory_kb) {
        this.total_physical_memory_kb = total_physical_memory_kb;
    }

    public Long getAvailable_physical_memory_kb() {
        return available_physical_memory_kb;
    }

    public void setAvailable_physical_memory_kb(Long available_physical_memory_kb) {
        this.available_physical_memory_kb = available_physical_memory_kb;
    }

    public Long getTotal_page_file_kb() {
        return total_page_file_kb;
    }

    public void setTotal_page_file_kb(Long total_page_file_kb) {
        this.total_page_file_kb = total_page_file_kb;
    }

    public Long getAvailable_page_file_kb() {
        return available_page_file_kb;
    }

    public void setAvailable_page_file_kb(Long available_page_file_kb) {
        this.available_page_file_kb = available_page_file_kb;
    }

    public Long getSystem_cache_kb() {
        return system_cache_kb;
    }

    public void setSystem_cache_kb(Long system_cache_kb) {
        this.system_cache_kb = system_cache_kb;
    }

    public Long getKernel_paged_pool_kb() {
        return kernel_paged_pool_kb;
    }

    public void setKernel_paged_pool_kb(Long kernel_paged_pool_kb) {
        this.kernel_paged_pool_kb = kernel_paged_pool_kb;
    }

    public Long getKernel_nonpaged_pool_kb() {
        return kernel_nonpaged_pool_kb;
    }

    public void setKernel_nonpaged_pool_kb(Long kernel_nonpaged_pool_kb) {
        this.kernel_nonpaged_pool_kb = kernel_nonpaged_pool_kb;
    }

    public Boolean getSystem_high_memory_signal_state() {
        return system_high_memory_signal_state;
    }

    public void setSystem_high_memory_signal_state(Boolean system_high_memory_signal_state) {
        this.system_high_memory_signal_state = system_high_memory_signal_state;
    }

    public Boolean getSystem_low_memory_signal_state() {
        return system_low_memory_signal_state;
    }

    public void setSystem_low_memory_signal_state(Boolean system_low_memory_signal_state) {
        this.system_low_memory_signal_state = system_low_memory_signal_state;
    }

    public String getSystem_memory_state_desc() {
        return system_memory_state_desc;
    }

    public void setSystem_memory_state_desc(String system_memory_state_desc) {
        this.system_memory_state_desc = system_memory_state_desc == null ? null : system_memory_state_desc.trim();
    }
}