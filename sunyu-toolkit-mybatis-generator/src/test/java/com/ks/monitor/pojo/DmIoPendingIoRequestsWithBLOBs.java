package com.ks.monitor.pojo;

public class DmIoPendingIoRequestsWithBLOBs extends DmIoPendingIoRequests {
    private byte[] io_completion_request_address;

    private byte[] io_completion_routine_address;

    private byte[] io_user_data_address;

    private byte[] scheduler_address;

    private byte[] io_handle;

    public byte[] getIo_completion_request_address() {
        return io_completion_request_address;
    }

    public void setIo_completion_request_address(byte[] io_completion_request_address) {
        this.io_completion_request_address = io_completion_request_address;
    }

    public byte[] getIo_completion_routine_address() {
        return io_completion_routine_address;
    }

    public void setIo_completion_routine_address(byte[] io_completion_routine_address) {
        this.io_completion_routine_address = io_completion_routine_address;
    }

    public byte[] getIo_user_data_address() {
        return io_user_data_address;
    }

    public void setIo_user_data_address(byte[] io_user_data_address) {
        this.io_user_data_address = io_user_data_address;
    }

    public byte[] getScheduler_address() {
        return scheduler_address;
    }

    public void setScheduler_address(byte[] scheduler_address) {
        this.scheduler_address = scheduler_address;
    }

    public byte[] getIo_handle() {
        return io_handle;
    }

    public void setIo_handle(byte[] io_handle) {
        this.io_handle = io_handle;
    }
}