package com.ks.monitor.pojo;

public class DmFtsOutstandingBatchesWithBLOBs extends DmFtsOutstandingBatches {
    private byte[] memory_address;

    private byte[] crawl_memory_address;

    private byte[] memregion_memory_address;

    private byte[] batch_timestamp;

    public byte[] getMemory_address() {
        return memory_address;
    }

    public void setMemory_address(byte[] memory_address) {
        this.memory_address = memory_address;
    }

    public byte[] getCrawl_memory_address() {
        return crawl_memory_address;
    }

    public void setCrawl_memory_address(byte[] crawl_memory_address) {
        this.crawl_memory_address = crawl_memory_address;
    }

    public byte[] getMemregion_memory_address() {
        return memregion_memory_address;
    }

    public void setMemregion_memory_address(byte[] memregion_memory_address) {
        this.memregion_memory_address = memregion_memory_address;
    }

    public byte[] getBatch_timestamp() {
        return batch_timestamp;
    }

    public void setBatch_timestamp(byte[] batch_timestamp) {
        this.batch_timestamp = batch_timestamp;
    }
}