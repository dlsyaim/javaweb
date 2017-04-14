package com.ks.monitor.pojo;

import java.util.Date;

public class DmExecConnections {
    private Integer session_id;

    private Integer most_recent_session_id;

    private Date connect_time;

    private String net_transport;

    private String protocol_type;

    private Integer protocol_version;

    private Integer endpoint_id;

    private String encrypt_option;

    private String auth_scheme;

    private Short node_affinity;

    private Integer num_reads;

    private Integer num_writes;

    private Date last_read;

    private Date last_write;

    private Integer net_packet_size;

    private String client_net_address;

    private Integer client_tcp_port;

    private String local_net_address;

    private Integer local_tcp_port;

    private String connection_id;

    private String parent_connection_id;

    private byte[] most_recent_sql_handle;

    public Integer getSession_id() {
        return session_id;
    }

    public void setSession_id(Integer session_id) {
        this.session_id = session_id;
    }

    public Integer getMost_recent_session_id() {
        return most_recent_session_id;
    }

    public void setMost_recent_session_id(Integer most_recent_session_id) {
        this.most_recent_session_id = most_recent_session_id;
    }

    public Date getConnect_time() {
        return connect_time;
    }

    public void setConnect_time(Date connect_time) {
        this.connect_time = connect_time;
    }

    public String getNet_transport() {
        return net_transport;
    }

    public void setNet_transport(String net_transport) {
        this.net_transport = net_transport == null ? null : net_transport.trim();
    }

    public String getProtocol_type() {
        return protocol_type;
    }

    public void setProtocol_type(String protocol_type) {
        this.protocol_type = protocol_type == null ? null : protocol_type.trim();
    }

    public Integer getProtocol_version() {
        return protocol_version;
    }

    public void setProtocol_version(Integer protocol_version) {
        this.protocol_version = protocol_version;
    }

    public Integer getEndpoint_id() {
        return endpoint_id;
    }

    public void setEndpoint_id(Integer endpoint_id) {
        this.endpoint_id = endpoint_id;
    }

    public String getEncrypt_option() {
        return encrypt_option;
    }

    public void setEncrypt_option(String encrypt_option) {
        this.encrypt_option = encrypt_option == null ? null : encrypt_option.trim();
    }

    public String getAuth_scheme() {
        return auth_scheme;
    }

    public void setAuth_scheme(String auth_scheme) {
        this.auth_scheme = auth_scheme == null ? null : auth_scheme.trim();
    }

    public Short getNode_affinity() {
        return node_affinity;
    }

    public void setNode_affinity(Short node_affinity) {
        this.node_affinity = node_affinity;
    }

    public Integer getNum_reads() {
        return num_reads;
    }

    public void setNum_reads(Integer num_reads) {
        this.num_reads = num_reads;
    }

    public Integer getNum_writes() {
        return num_writes;
    }

    public void setNum_writes(Integer num_writes) {
        this.num_writes = num_writes;
    }

    public Date getLast_read() {
        return last_read;
    }

    public void setLast_read(Date last_read) {
        this.last_read = last_read;
    }

    public Date getLast_write() {
        return last_write;
    }

    public void setLast_write(Date last_write) {
        this.last_write = last_write;
    }

    public Integer getNet_packet_size() {
        return net_packet_size;
    }

    public void setNet_packet_size(Integer net_packet_size) {
        this.net_packet_size = net_packet_size;
    }

    public String getClient_net_address() {
        return client_net_address;
    }

    public void setClient_net_address(String client_net_address) {
        this.client_net_address = client_net_address == null ? null : client_net_address.trim();
    }

    public Integer getClient_tcp_port() {
        return client_tcp_port;
    }

    public void setClient_tcp_port(Integer client_tcp_port) {
        this.client_tcp_port = client_tcp_port;
    }

    public String getLocal_net_address() {
        return local_net_address;
    }

    public void setLocal_net_address(String local_net_address) {
        this.local_net_address = local_net_address == null ? null : local_net_address.trim();
    }

    public Integer getLocal_tcp_port() {
        return local_tcp_port;
    }

    public void setLocal_tcp_port(Integer local_tcp_port) {
        this.local_tcp_port = local_tcp_port;
    }

    public String getConnection_id() {
        return connection_id;
    }

    public void setConnection_id(String connection_id) {
        this.connection_id = connection_id == null ? null : connection_id.trim();
    }

    public String getParent_connection_id() {
        return parent_connection_id;
    }

    public void setParent_connection_id(String parent_connection_id) {
        this.parent_connection_id = parent_connection_id == null ? null : parent_connection_id.trim();
    }

    public byte[] getMost_recent_sql_handle() {
        return most_recent_sql_handle;
    }

    public void setMost_recent_sql_handle(byte[] most_recent_sql_handle) {
        this.most_recent_sql_handle = most_recent_sql_handle;
    }
}