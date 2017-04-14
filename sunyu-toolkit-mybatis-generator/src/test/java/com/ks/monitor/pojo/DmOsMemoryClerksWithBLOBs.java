package com.ks.monitor.pojo;

public class DmOsMemoryClerksWithBLOBs extends DmOsMemoryClerks {
    private byte[] memory_clerk_address;

    private byte[] page_allocator_address;

    private byte[] host_address;

    public byte[] getMemory_clerk_address() {
        return memory_clerk_address;
    }

    public void setMemory_clerk_address(byte[] memory_clerk_address) {
        this.memory_clerk_address = memory_clerk_address;
    }

    public byte[] getPage_allocator_address() {
        return page_allocator_address;
    }

    public void setPage_allocator_address(byte[] page_allocator_address) {
        this.page_allocator_address = page_allocator_address;
    }

    public byte[] getHost_address() {
        return host_address;
    }

    public void setHost_address(byte[] host_address) {
        this.host_address = host_address;
    }
}