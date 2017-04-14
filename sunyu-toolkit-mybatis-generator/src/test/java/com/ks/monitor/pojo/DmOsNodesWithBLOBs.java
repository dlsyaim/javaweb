package com.ks.monitor.pojo;

public class DmOsNodesWithBLOBs extends DmOsNodes {
    private byte[] memory_object_address;

    private byte[] memory_clerk_address;

    private byte[] io_completion_worker_address;

    public byte[] getMemory_object_address() {
        return memory_object_address;
    }

    public void setMemory_object_address(byte[] memory_object_address) {
        this.memory_object_address = memory_object_address;
    }

    public byte[] getMemory_clerk_address() {
        return memory_clerk_address;
    }

    public void setMemory_clerk_address(byte[] memory_clerk_address) {
        this.memory_clerk_address = memory_clerk_address;
    }

    public byte[] getIo_completion_worker_address() {
        return io_completion_worker_address;
    }

    public void setIo_completion_worker_address(byte[] io_completion_worker_address) {
        this.io_completion_worker_address = io_completion_worker_address;
    }
}