package com.ks.monitor.pojo;

public class DmExecCachedPlansWithBLOBs extends DmExecCachedPlans {
    private byte[] memory_object_address;

    private byte[] plan_handle;

    public byte[] getMemory_object_address() {
        return memory_object_address;
    }

    public void setMemory_object_address(byte[] memory_object_address) {
        this.memory_object_address = memory_object_address;
    }

    public byte[] getPlan_handle() {
        return plan_handle;
    }

    public void setPlan_handle(byte[] plan_handle) {
        this.plan_handle = plan_handle;
    }
}