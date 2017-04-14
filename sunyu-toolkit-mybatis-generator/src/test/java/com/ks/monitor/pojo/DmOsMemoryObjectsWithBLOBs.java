package com.ks.monitor.pojo;

public class DmOsMemoryObjectsWithBLOBs extends DmOsMemoryObjects {
    private byte[] memory_object_address;

    private byte[] parent_address;

    private byte[] page_allocator_address;

    private byte[] creation_stack_address;

    public byte[] getMemory_object_address() {
        return memory_object_address;
    }

    public void setMemory_object_address(byte[] memory_object_address) {
        this.memory_object_address = memory_object_address;
    }

    public byte[] getParent_address() {
        return parent_address;
    }

    public void setParent_address(byte[] parent_address) {
        this.parent_address = parent_address;
    }

    public byte[] getPage_allocator_address() {
        return page_allocator_address;
    }

    public void setPage_allocator_address(byte[] page_allocator_address) {
        this.page_allocator_address = page_allocator_address;
    }

    public byte[] getCreation_stack_address() {
        return creation_stack_address;
    }

    public void setCreation_stack_address(byte[] creation_stack_address) {
        this.creation_stack_address = creation_stack_address;
    }
}