package com.ks.monitor.pojo;

public class DmFtsIndexPopulationWithBLOBs extends DmFtsIndexPopulation {
    private byte[] memory_address;

    private byte[] incremental_timestamp;

    public byte[] getMemory_address() {
        return memory_address;
    }

    public void setMemory_address(byte[] memory_address) {
        this.memory_address = memory_address;
    }

    public byte[] getIncremental_timestamp() {
        return incremental_timestamp;
    }

    public void setIncremental_timestamp(byte[] incremental_timestamp) {
        this.incremental_timestamp = incremental_timestamp;
    }
}