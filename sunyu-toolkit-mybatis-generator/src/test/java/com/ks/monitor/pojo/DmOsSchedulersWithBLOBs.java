package com.ks.monitor.pojo;

public class DmOsSchedulersWithBLOBs extends DmOsSchedulers {
    private byte[] scheduler_address;

    private byte[] active_worker_address;

    private byte[] memory_object_address;

    private byte[] task_memory_object_address;

    public byte[] getScheduler_address() {
        return scheduler_address;
    }

    public void setScheduler_address(byte[] scheduler_address) {
        this.scheduler_address = scheduler_address;
    }

    public byte[] getActive_worker_address() {
        return active_worker_address;
    }

    public void setActive_worker_address(byte[] active_worker_address) {
        this.active_worker_address = active_worker_address;
    }

    public byte[] getMemory_object_address() {
        return memory_object_address;
    }

    public void setMemory_object_address(byte[] memory_object_address) {
        this.memory_object_address = memory_object_address;
    }

    public byte[] getTask_memory_object_address() {
        return task_memory_object_address;
    }

    public void setTask_memory_object_address(byte[] task_memory_object_address) {
        this.task_memory_object_address = task_memory_object_address;
    }
}