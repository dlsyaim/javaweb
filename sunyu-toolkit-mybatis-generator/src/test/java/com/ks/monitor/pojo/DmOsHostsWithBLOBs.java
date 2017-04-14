package com.ks.monitor.pojo;

public class DmOsHostsWithBLOBs extends DmOsHosts {
    private byte[] host_address;

    private byte[] default_memory_clerk_address;

    public byte[] getHost_address() {
        return host_address;
    }

    public void setHost_address(byte[] host_address) {
        this.host_address = host_address;
    }

    public byte[] getDefault_memory_clerk_address() {
        return default_memory_clerk_address;
    }

    public void setDefault_memory_clerk_address(byte[] default_memory_clerk_address) {
        this.default_memory_clerk_address = default_memory_clerk_address;
    }
}