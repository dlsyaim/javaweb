package com.ks.monitor.pojo;

public class DmOsSublatches {
    private Integer partition_id;

    private byte[] superlatch_address;

    private byte[] sublatch_address;

    public Integer getPartition_id() {
        return partition_id;
    }

    public void setPartition_id(Integer partition_id) {
        this.partition_id = partition_id;
    }

    public byte[] getSuperlatch_address() {
        return superlatch_address;
    }

    public void setSuperlatch_address(byte[] superlatch_address) {
        this.superlatch_address = superlatch_address;
    }

    public byte[] getSublatch_address() {
        return sublatch_address;
    }

    public void setSublatch_address(byte[] sublatch_address) {
        this.sublatch_address = sublatch_address;
    }
}