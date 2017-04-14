package com.ks.monitor.pojo;

public class DmOsWaitingTasksWithBLOBs extends DmOsWaitingTasks {
    private byte[] waiting_task_address;

    private byte[] resource_address;

    private byte[] blocking_task_address;

    public byte[] getWaiting_task_address() {
        return waiting_task_address;
    }

    public void setWaiting_task_address(byte[] waiting_task_address) {
        this.waiting_task_address = waiting_task_address;
    }

    public byte[] getResource_address() {
        return resource_address;
    }

    public void setResource_address(byte[] resource_address) {
        this.resource_address = resource_address;
    }

    public byte[] getBlocking_task_address() {
        return blocking_task_address;
    }

    public void setBlocking_task_address(byte[] blocking_task_address) {
        this.blocking_task_address = blocking_task_address;
    }
}