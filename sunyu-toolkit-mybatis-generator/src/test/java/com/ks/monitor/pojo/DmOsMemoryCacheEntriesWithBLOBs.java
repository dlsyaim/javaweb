package com.ks.monitor.pojo;

public class DmOsMemoryCacheEntriesWithBLOBs extends DmOsMemoryCacheEntries {
    private byte[] cache_address;

    private byte[] entry_address;

    private byte[] entry_data_address;

    private byte[] memory_object_address;

    public byte[] getCache_address() {
        return cache_address;
    }

    public void setCache_address(byte[] cache_address) {
        this.cache_address = cache_address;
    }

    public byte[] getEntry_address() {
        return entry_address;
    }

    public void setEntry_address(byte[] entry_address) {
        this.entry_address = entry_address;
    }

    public byte[] getEntry_data_address() {
        return entry_data_address;
    }

    public void setEntry_data_address(byte[] entry_data_address) {
        this.entry_data_address = entry_data_address;
    }

    public byte[] getMemory_object_address() {
        return memory_object_address;
    }

    public void setMemory_object_address(byte[] memory_object_address) {
        this.memory_object_address = memory_object_address;
    }
}