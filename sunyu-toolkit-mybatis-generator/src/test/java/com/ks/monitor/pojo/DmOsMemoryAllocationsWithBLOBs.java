package com.ks.monitor.pojo;

public class DmOsMemoryAllocationsWithBLOBs extends DmOsMemoryAllocations {
    private byte[] memory_allocation_address;

    private byte[] memory_object_address;

    private byte[] allocator_stack_address;

    public byte[] getMemory_allocation_address() {
        return memory_allocation_address;
    }

    public void setMemory_allocation_address(byte[] memory_allocation_address) {
        this.memory_allocation_address = memory_allocation_address;
    }

    public byte[] getMemory_object_address() {
        return memory_object_address;
    }

    public void setMemory_object_address(byte[] memory_object_address) {
        this.memory_object_address = memory_object_address;
    }

    public byte[] getAllocator_stack_address() {
        return allocator_stack_address;
    }

    public void setAllocator_stack_address(byte[] allocator_stack_address) {
        this.allocator_stack_address = allocator_stack_address;
    }
}