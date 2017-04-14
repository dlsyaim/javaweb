package com.ks.monitor.pojo;

public class DmFilestreamFileIoHandlesWithBLOBs extends DmFilestreamFileIoHandles {
    private byte[] handle_context_address;

    private byte[] creation_client_thread_id;

    private byte[] creation_client_process_id;

    private byte[] filestream_transaction_id;

    public byte[] getHandle_context_address() {
        return handle_context_address;
    }

    public void setHandle_context_address(byte[] handle_context_address) {
        this.handle_context_address = handle_context_address;
    }

    public byte[] getCreation_client_thread_id() {
        return creation_client_thread_id;
    }

    public void setCreation_client_thread_id(byte[] creation_client_thread_id) {
        this.creation_client_thread_id = creation_client_thread_id;
    }

    public byte[] getCreation_client_process_id() {
        return creation_client_process_id;
    }

    public void setCreation_client_process_id(byte[] creation_client_process_id) {
        this.creation_client_process_id = creation_client_process_id;
    }

    public byte[] getFilestream_transaction_id() {
        return filestream_transaction_id;
    }

    public void setFilestream_transaction_id(byte[] filestream_transaction_id) {
        this.filestream_transaction_id = filestream_transaction_id;
    }
}