package com.ks.monitor.pojo;

public class DmFilestreamFileIoRequestsWithBLOBs extends DmFilestreamFileIoRequests {
    private byte[] request_context_address;

    private byte[] client_thread_id;

    private byte[] client_process_id;

    private byte[] handle_context_address;

    private byte[] filestream_transaction_id;

    public byte[] getRequest_context_address() {
        return request_context_address;
    }

    public void setRequest_context_address(byte[] request_context_address) {
        this.request_context_address = request_context_address;
    }

    public byte[] getClient_thread_id() {
        return client_thread_id;
    }

    public void setClient_thread_id(byte[] client_thread_id) {
        this.client_thread_id = client_thread_id;
    }

    public byte[] getClient_process_id() {
        return client_process_id;
    }

    public void setClient_process_id(byte[] client_process_id) {
        this.client_process_id = client_process_id;
    }

    public byte[] getHandle_context_address() {
        return handle_context_address;
    }

    public void setHandle_context_address(byte[] handle_context_address) {
        this.handle_context_address = handle_context_address;
    }

    public byte[] getFilestream_transaction_id() {
        return filestream_transaction_id;
    }

    public void setFilestream_transaction_id(byte[] filestream_transaction_id) {
        this.filestream_transaction_id = filestream_transaction_id;
    }
}