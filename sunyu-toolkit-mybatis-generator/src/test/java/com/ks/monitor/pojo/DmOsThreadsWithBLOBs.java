package com.ks.monitor.pojo;

public class DmOsThreadsWithBLOBs extends DmOsThreads {
    private byte[] thread_address;

    private byte[] instruction_address;

    private byte[] stack_base_address;

    private byte[] stack_end_address;

    private byte[] token;

    private byte[] fiber_data;

    private byte[] thread_handle;

    private byte[] event_handle;

    private byte[] scheduler_address;

    private byte[] worker_address;

    private byte[] fiber_context_address;

    private byte[] self_address;

    public byte[] getThread_address() {
        return thread_address;
    }

    public void setThread_address(byte[] thread_address) {
        this.thread_address = thread_address;
    }

    public byte[] getInstruction_address() {
        return instruction_address;
    }

    public void setInstruction_address(byte[] instruction_address) {
        this.instruction_address = instruction_address;
    }

    public byte[] getStack_base_address() {
        return stack_base_address;
    }

    public void setStack_base_address(byte[] stack_base_address) {
        this.stack_base_address = stack_base_address;
    }

    public byte[] getStack_end_address() {
        return stack_end_address;
    }

    public void setStack_end_address(byte[] stack_end_address) {
        this.stack_end_address = stack_end_address;
    }

    public byte[] getToken() {
        return token;
    }

    public void setToken(byte[] token) {
        this.token = token;
    }

    public byte[] getFiber_data() {
        return fiber_data;
    }

    public void setFiber_data(byte[] fiber_data) {
        this.fiber_data = fiber_data;
    }

    public byte[] getThread_handle() {
        return thread_handle;
    }

    public void setThread_handle(byte[] thread_handle) {
        this.thread_handle = thread_handle;
    }

    public byte[] getEvent_handle() {
        return event_handle;
    }

    public void setEvent_handle(byte[] event_handle) {
        this.event_handle = event_handle;
    }

    public byte[] getScheduler_address() {
        return scheduler_address;
    }

    public void setScheduler_address(byte[] scheduler_address) {
        this.scheduler_address = scheduler_address;
    }

    public byte[] getWorker_address() {
        return worker_address;
    }

    public void setWorker_address(byte[] worker_address) {
        this.worker_address = worker_address;
    }

    public byte[] getFiber_context_address() {
        return fiber_context_address;
    }

    public void setFiber_context_address(byte[] fiber_context_address) {
        this.fiber_context_address = fiber_context_address;
    }

    public byte[] getSelf_address() {
        return self_address;
    }

    public void setSelf_address(byte[] self_address) {
        this.self_address = self_address;
    }
}