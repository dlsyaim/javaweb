package com.ks.monitor.pojo;

public class DmOsTasksWithBLOBs extends DmOsTasks {
    private byte[] task_address;

    private byte[] worker_address;

    private byte[] host_address;

    private byte[] parent_task_address;

    public byte[] getTask_address() {
        return task_address;
    }

    public void setTask_address(byte[] task_address) {
        this.task_address = task_address;
    }

    public byte[] getWorker_address() {
        return worker_address;
    }

    public void setWorker_address(byte[] worker_address) {
        this.worker_address = worker_address;
    }

    public byte[] getHost_address() {
        return host_address;
    }

    public void setHost_address(byte[] host_address) {
        this.host_address = host_address;
    }

    public byte[] getParent_task_address() {
        return parent_task_address;
    }

    public void setParent_task_address(byte[] parent_task_address) {
        this.parent_task_address = parent_task_address;
    }
}