package com.ks.monitor.pojo;

public class DmBrokerForwardedMessages {
    private String conversation_id;

    private Boolean is_initiator;

    private String to_service_name;

    private String to_broker_instance;

    private String from_service_name;

    private String from_broker_instance;

    private String adjacent_broker_address;

    private Long message_sequence_number;

    private Integer message_fragment_number;

    private Byte hops_remaining;

    private Integer time_to_live;

    private Integer time_consumed;

    private String message_id;

    public String getConversation_id() {
        return conversation_id;
    }

    public void setConversation_id(String conversation_id) {
        this.conversation_id = conversation_id == null ? null : conversation_id.trim();
    }

    public Boolean getIs_initiator() {
        return is_initiator;
    }

    public void setIs_initiator(Boolean is_initiator) {
        this.is_initiator = is_initiator;
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

    public String getFrom_broker_instance() {
        return from_broker_instance;
    }

    public void setFrom_broker_instance(String from_broker_instance) {
        this.from_broker_instance = from_broker_instance == null ? null : from_broker_instance.trim();
    }

    public String getAdjacent_broker_address() {
        return adjacent_broker_address;
    }

    public void setAdjacent_broker_address(String adjacent_broker_address) {
        this.adjacent_broker_address = adjacent_broker_address == null ? null : adjacent_broker_address.trim();
    }

    public Long getMessage_sequence_number() {
        return message_sequence_number;
    }

    public void setMessage_sequence_number(Long message_sequence_number) {
        this.message_sequence_number = message_sequence_number;
    }

    public Integer getMessage_fragment_number() {
        return message_fragment_number;
    }

    public void setMessage_fragment_number(Integer message_fragment_number) {
        this.message_fragment_number = message_fragment_number;
    }

    public Byte getHops_remaining() {
        return hops_remaining;
    }

    public void setHops_remaining(Byte hops_remaining) {
        this.hops_remaining = hops_remaining;
    }

    public Integer getTime_to_live() {
        return time_to_live;
    }

    public void setTime_to_live(Integer time_to_live) {
        this.time_to_live = time_to_live;
    }

    public Integer getTime_consumed() {
        return time_consumed;
    }

    public void setTime_consumed(Integer time_consumed) {
        this.time_consumed = time_consumed;
    }

    public String getMessage_id() {
        return message_id;
    }

    public void setMessage_id(String message_id) {
        this.message_id = message_id == null ? null : message_id.trim();
    }
}