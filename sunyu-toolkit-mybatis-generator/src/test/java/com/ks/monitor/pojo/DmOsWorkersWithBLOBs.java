package com.ks.monitor.pojo;

public class DmOsWorkersWithBLOBs extends DmOsWorkers {
    private byte[] worker_address;

    private byte[] exception_address;

    private byte[] fiber_address;

    private byte[] task_address;

    private byte[] memory_object_address;

    private byte[] thread_address;

    private byte[] signal_worker_address;

    private byte[] scheduler_address;

    public byte[] getWorker_address() {
        return worker_address;
    }

    public void setWorker_address(byte[] worker_address) {
        this.worker_address = worker_address;
    }

    public byte[] getException_address() {
        return exception_address;
    }

    public void setException_address(byte[] exception_address) {
        this.exception_address = exception_address;
    }

    public byte[] getFiber_address() {
        return fiber_address;
    }

    public void setFiber_address(byte[] fiber_address) {
        this.fiber_address = fiber_address;
    }

    public byte[] getTask_address() {
        return task_address;
    }

    public void setTask_address(byte[] task_address) {
        this.task_address = task_address;
    }

    public byte[] getMemory_object_address() {
        return memory_object_address;
    }

    public void setMemory_object_address(byte[] memory_object_address) {
        this.memory_object_address = memory_object_address;
    }

    public byte[] getThread_address() {
        return thread_address;
    }

    public void setThread_address(byte[] thread_address) {
        this.thread_address = thread_address;
    }

    public byte[] getSignal_worker_address() {
        return signal_worker_address;
    }

    public void setSignal_worker_address(byte[] signal_worker_address) {
        this.signal_worker_address = signal_worker_address;
    }

    public byte[] getScheduler_address() {
        return scheduler_address;
    }

    public void setScheduler_address(byte[] scheduler_address) {
        this.scheduler_address = scheduler_address;
    }
}