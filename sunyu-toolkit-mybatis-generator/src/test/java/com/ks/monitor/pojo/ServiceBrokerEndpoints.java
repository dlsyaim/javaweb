package com.ks.monitor.pojo;

public class ServiceBrokerEndpoints {
    private String name;

    private Integer endpoint_id;

    private Integer principal_id;

    private Byte protocol;

    private String protocol_desc;

    private Byte type;

    private String type_desc;

    private Byte state;

    private String state_desc;

    private Boolean is_admin_endpoint;

    private Boolean is_message_forwarding_enabled;

    private Integer message_forwarding_size;

    private Byte connection_auth;

    private String connection_auth_desc;

    private Integer certificate_id;

    private Byte encryption_algorithm;

    private String encryption_algorithm_desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getEndpoint_id() {
        return endpoint_id;
    }

    public void setEndpoint_id(Integer endpoint_id) {
        this.endpoint_id = endpoint_id;
    }

    public Integer getPrincipal_id() {
        return principal_id;
    }

    public void setPrincipal_id(Integer principal_id) {
        this.principal_id = principal_id;
    }

    public Byte getProtocol() {
        return protocol;
    }

    public void setProtocol(Byte protocol) {
        this.protocol = protocol;
    }

    public String getProtocol_desc() {
        return protocol_desc;
    }

    public void setProtocol_desc(String protocol_desc) {
        this.protocol_desc = protocol_desc == null ? null : protocol_desc.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getType_desc() {
        return type_desc;
    }

    public void setType_desc(String type_desc) {
        this.type_desc = type_desc == null ? null : type_desc.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getState_desc() {
        return state_desc;
    }

    public void setState_desc(String state_desc) {
        this.state_desc = state_desc == null ? null : state_desc.trim();
    }

    public Boolean getIs_admin_endpoint() {
        return is_admin_endpoint;
    }

    public void setIs_admin_endpoint(Boolean is_admin_endpoint) {
        this.is_admin_endpoint = is_admin_endpoint;
    }

    public Boolean getIs_message_forwarding_enabled() {
        return is_message_forwarding_enabled;
    }

    public void setIs_message_forwarding_enabled(Boolean is_message_forwarding_enabled) {
        this.is_message_forwarding_enabled = is_message_forwarding_enabled;
    }

    public Integer getMessage_forwarding_size() {
        return message_forwarding_size;
    }

    public void setMessage_forwarding_size(Integer message_forwarding_size) {
        this.message_forwarding_size = message_forwarding_size;
    }

    public Byte getConnection_auth() {
        return connection_auth;
    }

    public void setConnection_auth(Byte connection_auth) {
        this.connection_auth = connection_auth;
    }

    public String getConnection_auth_desc() {
        return connection_auth_desc;
    }

    public void setConnection_auth_desc(String connection_auth_desc) {
        this.connection_auth_desc = connection_auth_desc == null ? null : connection_auth_desc.trim();
    }

    public Integer getCertificate_id() {
        return certificate_id;
    }

    public void setCertificate_id(Integer certificate_id) {
        this.certificate_id = certificate_id;
    }

    public Byte getEncryption_algorithm() {
        return encryption_algorithm;
    }

    public void setEncryption_algorithm(Byte encryption_algorithm) {
        this.encryption_algorithm = encryption_algorithm;
    }

    public String getEncryption_algorithm_desc() {
        return encryption_algorithm_desc;
    }

    public void setEncryption_algorithm_desc(String encryption_algorithm_desc) {
        this.encryption_algorithm_desc = encryption_algorithm_desc == null ? null : encryption_algorithm_desc.trim();
    }
}