package com.ks.monitor.pojo;

import java.util.Date;

public class DmDbMirroringConnections {
    private String connection_id;

    private String transport_stream_id;

    private Short state;

    private String state_desc;

    private Date connect_time;

    private Date login_time;

    private String authentication_method;

    private String principal_name;

    private String remote_user_name;

    private Date last_activity_time;

    private Boolean is_accept;

    private Short login_state;

    private String login_state_desc;

    private Integer peer_certificate_id;

    private Short encryption_algorithm;

    private String encryption_algorithm_desc;

    private Short receives_posted;

    private Boolean is_receive_flow_controlled;

    private Short sends_posted;

    private Boolean is_send_flow_controlled;

    private Long total_bytes_sent;

    private Long total_bytes_received;

    private Long total_fragments_sent;

    private Long total_fragments_received;

    private Long total_sends;

    private Long total_receives;

    private String peer_arbitration_id;

    public String getConnection_id() {
        return connection_id;
    }

    public void setConnection_id(String connection_id) {
        this.connection_id = connection_id == null ? null : connection_id.trim();
    }

    public String getTransport_stream_id() {
        return transport_stream_id;
    }

    public void setTransport_stream_id(String transport_stream_id) {
        this.transport_stream_id = transport_stream_id == null ? null : transport_stream_id.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getState_desc() {
        return state_desc;
    }

    public void setState_desc(String state_desc) {
        this.state_desc = state_desc == null ? null : state_desc.trim();
    }

    public Date getConnect_time() {
        return connect_time;
    }

    public void setConnect_time(Date connect_time) {
        this.connect_time = connect_time;
    }

    public Date getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }

    public String getAuthentication_method() {
        return authentication_method;
    }

    public void setAuthentication_method(String authentication_method) {
        this.authentication_method = authentication_method == null ? null : authentication_method.trim();
    }

    public String getPrincipal_name() {
        return principal_name;
    }

    public void setPrincipal_name(String principal_name) {
        this.principal_name = principal_name == null ? null : principal_name.trim();
    }

    public String getRemote_user_name() {
        return remote_user_name;
    }

    public void setRemote_user_name(String remote_user_name) {
        this.remote_user_name = remote_user_name == null ? null : remote_user_name.trim();
    }

    public Date getLast_activity_time() {
        return last_activity_time;
    }

    public void setLast_activity_time(Date last_activity_time) {
        this.last_activity_time = last_activity_time;
    }

    public Boolean getIs_accept() {
        return is_accept;
    }

    public void setIs_accept(Boolean is_accept) {
        this.is_accept = is_accept;
    }

    public Short getLogin_state() {
        return login_state;
    }

    public void setLogin_state(Short login_state) {
        this.login_state = login_state;
    }

    public String getLogin_state_desc() {
        return login_state_desc;
    }

    public void setLogin_state_desc(String login_state_desc) {
        this.login_state_desc = login_state_desc == null ? null : login_state_desc.trim();
    }

    public Integer getPeer_certificate_id() {
        return peer_certificate_id;
    }

    public void setPeer_certificate_id(Integer peer_certificate_id) {
        this.peer_certificate_id = peer_certificate_id;
    }

    public Short getEncryption_algorithm() {
        return encryption_algorithm;
    }

    public void setEncryption_algorithm(Short encryption_algorithm) {
        this.encryption_algorithm = encryption_algorithm;
    }

    public String getEncryption_algorithm_desc() {
        return encryption_algorithm_desc;
    }

    public void setEncryption_algorithm_desc(String encryption_algorithm_desc) {
        this.encryption_algorithm_desc = encryption_algorithm_desc == null ? null : encryption_algorithm_desc.trim();
    }

    public Short getReceives_posted() {
        return receives_posted;
    }

    public void setReceives_posted(Short receives_posted) {
        this.receives_posted = receives_posted;
    }

    public Boolean getIs_receive_flow_controlled() {
        return is_receive_flow_controlled;
    }

    public void setIs_receive_flow_controlled(Boolean is_receive_flow_controlled) {
        this.is_receive_flow_controlled = is_receive_flow_controlled;
    }

    public Short getSends_posted() {
        return sends_posted;
    }

    public void setSends_posted(Short sends_posted) {
        this.sends_posted = sends_posted;
    }

    public Boolean getIs_send_flow_controlled() {
        return is_send_flow_controlled;
    }

    public void setIs_send_flow_controlled(Boolean is_send_flow_controlled) {
        this.is_send_flow_controlled = is_send_flow_controlled;
    }

    public Long getTotal_bytes_sent() {
        return total_bytes_sent;
    }

    public void setTotal_bytes_sent(Long total_bytes_sent) {
        this.total_bytes_sent = total_bytes_sent;
    }

    public Long getTotal_bytes_received() {
        return total_bytes_received;
    }

    public void setTotal_bytes_received(Long total_bytes_received) {
        this.total_bytes_received = total_bytes_received;
    }

    public Long getTotal_fragments_sent() {
        return total_fragments_sent;
    }

    public void setTotal_fragments_sent(Long total_fragments_sent) {
        this.total_fragments_sent = total_fragments_sent;
    }

    public Long getTotal_fragments_received() {
        return total_fragments_received;
    }

    public void setTotal_fragments_received(Long total_fragments_received) {
        this.total_fragments_received = total_fragments_received;
    }

    public Long getTotal_sends() {
        return total_sends;
    }

    public void setTotal_sends(Long total_sends) {
        this.total_sends = total_sends;
    }

    public Long getTotal_receives() {
        return total_receives;
    }

    public void setTotal_receives(Long total_receives) {
        this.total_receives = total_receives;
    }

    public String getPeer_arbitration_id() {
        return peer_arbitration_id;
    }

    public void setPeer_arbitration_id(String peer_arbitration_id) {
        this.peer_arbitration_id = peer_arbitration_id == null ? null : peer_arbitration_id.trim();
    }
}