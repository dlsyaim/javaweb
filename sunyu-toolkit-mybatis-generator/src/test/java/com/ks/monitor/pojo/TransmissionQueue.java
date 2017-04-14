package com.ks.monitor.pojo;

import java.util.Date;

public class TransmissionQueue {
    private String conversation_handle;

    private String to_service_name;

    private String to_broker_instance;

    private String from_service_name;

    private String service_contract_name;

    private Date enqueue_time;

    private Long message_sequence_number;

    private String message_type_name;

    private Boolean is_conversation_error;

    private Boolean is_end_of_dialog;

    private String transmission_status;

    private Byte priority;

    private byte[] message_body;

    public String getConversation_handle() {
        return conversation_handle;
    }

    public void setConversation_handle(String conversation_handle) {
        this.conversation_handle = conversation_handle == null ? null : conversation_handle.trim();
    }

    public String getTo_service_name() {
        return to_service_name;
    }

    public void setTo_service_name(String to_service_name) {
        this.to_service_name = to_service_name == null ? null : to_service_name.trim();
    }

    public String getTo_broker_instance() {
        return to_broker_instance;
    }

    public void setTo_broker_instance(String to_broker_instance) {
        this.to_broker_instance = to_broker_instance == null ? null : to_broker_instance.trim();
    }

    public String getFrom_service_name() {
        return from_service_name;
    }

    public void setFrom_service_name(String from_service_name) {
        this.from_service_name = from_service_name == null ? null : from_service_name.trim();
    }

    public String getService_contract_name() {
        return service_contract_name;
    }

    public void setService_contract_name(String service_contract_name) {
        this.service_contract_name = service_contract_name == null ? null : service_contract_name.trim();
    }

    public Date getEnqueue_time() {
        return enqueue_time;
    }

    public void setEnqueue_time(Date enqueue_time) {
        this.enqueue_time = enqueue_time;
    }

    public Long getMessage_sequence_number() {
        return message_sequence_number;
    }

    public void setMessage_sequence_number(Long message_sequence_number) {
        this.message_sequence_number = message_sequence_number;
    }

    public String getMessage_type_name() {
        return message_type_name;
    }

    public void setMessage_type_name(String message_type_name) {
        this.message_type_name = message_type_name == null ? null : message_type_name.trim();
    }

    public Boolean getIs_conversation_error() {
        return is_conversation_error;
    }

    public void setIs_conversation_error(Boolean is_conversation_error) {
        this.is_conversation_error = is_conversation_error;
    }

    public Boolean getIs_end_of_dialog() {
        return is_end_of_dialog;
    }

    public void setIs_end_of_dialog(Boolean is_end_of_dialog) {
        this.is_end_of_dialog = is_end_of_dialog;
    }

    public String getTransmission_status() {
        return transmission_status;
    }

    public void setTransmission_status(String transmission_status) {
        this.transmission_status = transmission_status == null ? null : transmission_status.trim();
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public byte[] getMessage_body() {
        return message_body;
    }

    public void setMessage_body(byte[] message_body) {
        this.message_body = message_body;
    }
}