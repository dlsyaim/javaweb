package com.ks.monitor.pojo;

public class HttpEndpoints {
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

    private String site;

    private String url_path;

    private Boolean is_clear_port_enabled;

    private Integer clear_port;

    private Boolean is_ssl_port_enabled;

    private Integer ssl_port;

    private Boolean is_anonymous_enabled;

    private Boolean is_basic_auth_enabled;

    private Boolean is_digest_auth_enabled;

    private Boolean is_kerberos_auth_enabled;

    private Boolean is_ntlm_auth_enabled;

    private Boolean is_integrated_auth_enabled;

    private String authorization_realm;

    private String default_logon_domain;

    private Boolean is_compression_enabled;

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

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getUrl_path() {
        return url_path;
    }

    public void setUrl_path(String url_path) {
        this.url_path = url_path == null ? null : url_path.trim();
    }

    public Boolean getIs_clear_port_enabled() {
        return is_clear_port_enabled;
    }

    public void setIs_clear_port_enabled(Boolean is_clear_port_enabled) {
        this.is_clear_port_enabled = is_clear_port_enabled;
    }

    public Integer getClear_port() {
        return clear_port;
    }

    public void setClear_port(Integer clear_port) {
        this.clear_port = clear_port;
    }

    public Boolean getIs_ssl_port_enabled() {
        return is_ssl_port_enabled;
    }

    public void setIs_ssl_port_enabled(Boolean is_ssl_port_enabled) {
        this.is_ssl_port_enabled = is_ssl_port_enabled;
    }

    public Integer getSsl_port() {
        return ssl_port;
    }

    public void setSsl_port(Integer ssl_port) {
        this.ssl_port = ssl_port;
    }

    public Boolean getIs_anonymous_enabled() {
        return is_anonymous_enabled;
    }

    public void setIs_anonymous_enabled(Boolean is_anonymous_enabled) {
        this.is_anonymous_enabled = is_anonymous_enabled;
    }

    public Boolean getIs_basic_auth_enabled() {
        return is_basic_auth_enabled;
    }

    public void setIs_basic_auth_enabled(Boolean is_basic_auth_enabled) {
        this.is_basic_auth_enabled = is_basic_auth_enabled;
    }

    public Boolean getIs_digest_auth_enabled() {
        return is_digest_auth_enabled;
    }

    public void setIs_digest_auth_enabled(Boolean is_digest_auth_enabled) {
        this.is_digest_auth_enabled = is_digest_auth_enabled;
    }

    public Boolean getIs_kerberos_auth_enabled() {
        return is_kerberos_auth_enabled;
    }

    public void setIs_kerberos_auth_enabled(Boolean is_kerberos_auth_enabled) {
        this.is_kerberos_auth_enabled = is_kerberos_auth_enabled;
    }

    public Boolean getIs_ntlm_auth_enabled() {
        return is_ntlm_auth_enabled;
    }

    public void setIs_ntlm_auth_enabled(Boolean is_ntlm_auth_enabled) {
        this.is_ntlm_auth_enabled = is_ntlm_auth_enabled;
    }

    public Boolean getIs_integrated_auth_enabled() {
        return is_integrated_auth_enabled;
    }

    public void setIs_integrated_auth_enabled(Boolean is_integrated_auth_enabled) {
        this.is_integrated_auth_enabled = is_integrated_auth_enabled;
    }

    public String getAuthorization_realm() {
        return authorization_realm;
    }

    public void setAuthorization_realm(String authorization_realm) {
        this.authorization_realm = authorization_realm == null ? null : authorization_realm.trim();
    }

    public String getDefault_logon_domain() {
        return default_logon_domain;
    }

    public void setDefault_logon_domain(String default_logon_domain) {
        this.default_logon_domain = default_logon_domain == null ? null : default_logon_domain.trim();
    }

    public Boolean getIs_compression_enabled() {
        return is_compression_enabled;
    }

    public void setIs_compression_enabled(Boolean is_compression_enabled) {
        this.is_compression_enabled = is_compression_enabled;
    }
}