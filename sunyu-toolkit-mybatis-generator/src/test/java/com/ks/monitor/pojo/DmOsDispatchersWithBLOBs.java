package com.ks.monitor.pojo;

public class DmOsDispatchersWithBLOBs extends DmOsDispatchers {
    private byte[] dispatcher_pool_address;

    private byte[] task_address;

    public byte[] getDispatcher_pool_address() {
        return dispatcher_pool_address;
    }

    public void setDispatcher_pool_address(byte[] dispatcher_pool_address) {
        this.dispatcher_pool_address = dispatcher_pool_address;
    }

    public byte[] getTask_address() {
        return task_address;
    }

    public void setTask_address(byte[] task_address) {
        this.task_address = task_address;
    }
}