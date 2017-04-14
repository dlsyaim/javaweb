package com.ks.monitor.pojo;

public class DmOsVirtualAddressDump {
    private Long region_size_in_bytes;

    private byte[] region_base_address;

    private byte[] region_allocation_base_address;

    private byte[] region_allocation_protection;

    private byte[] region_state;

    private byte[] region_current_protection;

    private byte[] region_type;

    public Long getRegion_size_in_bytes() {
        return region_size_in_bytes;
    }

    public void setRegion_size_in_bytes(Long region_size_in_bytes) {
        this.region_size_in_bytes = region_size_in_bytes;
    }

    public byte[] getRegion_base_address() {
        return region_base_address;
    }

    public void setRegion_base_address(byte[] region_base_address) {
        this.region_base_address = region_base_address;
    }

    public byte[] getRegion_allocation_base_address() {
        return region_allocation_base_address;
    }

    public void setRegion_allocation_base_address(byte[] region_allocation_base_address) {
        this.region_allocation_base_address = region_allocation_base_address;
    }

    public byte[] getRegion_allocation_protection() {
        return region_allocation_protection;
    }

    public void setRegion_allocation_protection(byte[] region_allocation_protection) {
        this.region_allocation_protection = region_allocation_protection;
    }

    public byte[] getRegion_state() {
        return region_state;
    }

    public void setRegion_state(byte[] region_state) {
        this.region_state = region_state;
    }

    public byte[] getRegion_current_protection() {
        return region_current_protection;
    }

    public void setRegion_current_protection(byte[] region_current_protection) {
        this.region_current_protection = region_current_protection;
    }

    public byte[] getRegion_type() {
        return region_type;
    }

    public void setRegion_type(byte[] region_type) {
        this.region_type = region_type;
    }
}