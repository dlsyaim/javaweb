package com.ks.monitor.pojo;

public class DmFtsPopulationRangesWithBLOBs extends DmFtsPopulationRanges {
    private byte[] memory_address;

    private byte[] parent_memory_address;

    public byte[] getMemory_address() {
        return memory_address;
    }

    public void setMemory_address(byte[] memory_address) {
        this.memory_address = memory_address;
    }

    public byte[] getParent_memory_address() {
        return parent_memory_address;
    }

    public void setParent_memory_address(byte[] parent_memory_address) {
        this.parent_memory_address = parent_memory_address;
    }
}