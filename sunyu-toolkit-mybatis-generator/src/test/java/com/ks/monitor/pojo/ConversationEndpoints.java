package com.ks.monitor.pojo;

import java.util.Date;

public class ConversationEndpoints {
    private String conversation_handle;

    private String conversation_id;

    private Boolean is_initiator;

    private Integer service_contract_id;

    private String conversation_group_id;

    private Integer service_id;

    private Date lifetime;

    private String state;

    private String state_desc;

    private String far_service;

    private String far_broker_instance;

    private Integer principal_id;

    private Integer far_principal_id;

    private String outbound_session_key_identifier;

    private String inbound_session_key_identifier;

    private Date security_timestamp;

    private Date dialog_timer;

    private Long send_sequence;

    private Long end_dialog_sequence;

    private Long receive_sequence;

    private Integer receive_sequence_frag;

    private Long system_sequence;

    private Long first_out_of_order_sequence;

    private Long last_out_of_order_sequence;

    private Integer last_out_of_order_frag;

    private Boolean is_system;

    private Byte priority;

    private byte[] last_send_tran_id;

    public String getConversation_handle() {
        return conversation_handle;
    }

    public void setConversation_handle(String conversation_handle) {
        this.conversation_handle = conversation_handle == null ? null : conversation_handle.trim();
    }

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

    public Integer getService_contract_id() {
        return service_contract_id;
    }

    public void setService_contract_id(Integer service_contract_id) {
        this.service_contract_id = service_contract_id;
    }

    public String getConversation_group_id() {
        return conversation_group_id;
    }

    public void setConversation_group_id(String conversation_group_id) {
        this.conversation_group_id = conversation_group_id == null ? null : conversation_group_id.trim();
    }

    public Integer getService_id() {
        return service_id;
    }

    public void setService_id(Integer service_id) {
        this.service_id = service_id;
    }

    public Date getLifetime() {
        return lifetime;
    }

    public void setLifetime(Date lifetime) {
        this.lifetime = lifetime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getState_desc() {
        return state_desc;
    }

    public void setState_desc(String state_desc) {
        this.state_desc = state_desc == null ? null : state_desc.trim();
    }

    public String getFar_service() {
        return far_service;
    }

    public void setFar_service(String far_service) {
        this.far_service = far_service == null ? null : far_service.trim();
    }

    public String getFar_broker_instance() {
        return far_broker_instance;
    }

    public void setFar_broker_instance(String far_broker_instance) {
        this.far_broker_instance = far_broker_instance == null ? null : far_broker_instance.trim();
    }

    public Integer getPrincipal_id() {
        return principal_id;
    }

    public void setPrincipal_id(Integer principal_id) {
        this.principal_id = principal_id;
    }

    public Integer getFar_principal_id() {
        return far_principal_id;
    }

    public void setFar_principal_id(Integer far_principal_id) {
        this.far_principal_id = far_principal_id;
    }

    public String getOutbound_session_key_identifier() {
        return outbound_session_key_identifier;
    }

    public void setOutbound_session_key_identifier(String outbound_session_key_identifier) {
        this.outbound_session_key_identifier = outbound_session_key_identifier == null ? null : outbound_session_key_identifier.trim();
    }

    public String getInbound_session_key_identifier() {
        return inbound_session_key_identifier;
    }

    public void setInbound_session_key_identifier(String inbound_session_key_identifier) {
        this.inbound_session_key_identifier = inbound_session_key_identifier == null ? null : inbound_session_key_identifier.trim();
    }

    public Date getSecurity_timestamp() {
        return security_timestamp;
    }

    public void setSecurity_timestamp(Date security_timestamp) {
        this.security_timestamp = security_timestamp;
    }

    public Date getDialog_timer() {
        return dialog_timer;
    }

    public void setDialog_timer(Date dialog_timer) {
        this.dialog_timer = dialog_timer;
    }

    public Long getSend_sequence() {
        return send_sequence;
    }

    public void setSend_sequence(Long send_sequence) {
        this.send_sequence = send_sequence;
    }

    public Long getEnd_dialog_sequence() {
        return end_dialog_sequence;
    }

    public void setEnd_dialog_sequence(Long end_dialog_sequence) {
        this.end_dialog_sequence = end_dialog_sequence;
    }

    public Long getReceive_sequence() {
        return receive_sequence;
    }

    public void setReceive_sequence(Long receive_sequence) {
        this.receive_sequence = receive_sequence;
    }

    public Integer getReceive_sequence_frag() {
        return receive_sequence_frag;
    }

    public void setReceive_sequence_frag(Integer receive_sequence_frag) {
        this.receive_sequence_frag = receive_sequence_frag;
    }

    public Long getSystem_sequence() {
        return system_sequence;
    }

    public void setSystem_sequence(Long system_sequence) {
        this.system_sequence = system_sequence;
    }

    public Long getFirst_out_of_order_sequence() {
        return first_out_of_order_sequence;
    }

    public void setFirst_out_of_order_sequence(Long first_out_of_order_sequence) {
        this.first_out_of_order_sequence = first_out_of_order_sequence;
    }

    public Long getLast_out_of_order_sequence() {
        return last_out_of_order_sequence;
    }

    public void setLast_out_of_order_sequence(Long last_out_of_order_sequence) {
        this.last_out_of_order_sequence = last_out_of_order_sequence;
    }

    public Integer getLast_out_of_order_frag() {
        return last_out_of_order_frag;
    }

    public void setLast_out_of_order_frag(Integer last_out_of_order_frag) {
        this.last_out_of_order_frag = last_out_of_order_frag;
    }

    public Boolean getIs_system() {
        return is_system;
    }

    public void setIs_system(Boolean is_system) {
        this.is_system = is_system;
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public byte[] getLast_send_tran_id() {
        return last_send_tran_id;
    }

    public void setLast_send_tran_id(byte[] last_send_tran_id) {
        this.last_send_tran_id = last_send_tran_id;
    }
}