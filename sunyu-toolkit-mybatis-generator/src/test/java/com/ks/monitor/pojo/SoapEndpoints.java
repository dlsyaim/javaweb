package com.ks.monitor.pojo;

public class SoapEndpoints {
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

    private Boolean is_sql_language_enabled;

    private String wsdl_generator_procedure;

    private String default_database;

    private String default_namespace;

    private Byte default_result_schema;

    private String default_result_schema_desc;

    private Boolean is_xml_charset_enforced;

    private Boolean is_session_enabled;

    private Integer session_timeout;

    private String login_type;

    private Integer header_limit;

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

    public Boolean getIs_sql_language_enabled() {
        return is_sql_language_enabled;
    }

    public void setIs_sql_language_enabled(Boolean is_sql_language_enabled) {
        this.is_sql_language_enabled = is_sql_language_enabled;
    }

    public String getWsdl_generator_procedure() {
        return wsdl_generator_procedure;
    }

    public void setWsdl_generator_procedure(String wsdl_generator_procedure) {
        this.wsdl_generator_procedure = wsdl_generator_procedure == null ? null : wsdl_generator_procedure.trim();
    }

    public String getDefault_database() {
        return default_database;
    }

    public void setDefault_database(String default_database) {
        this.default_database = default_database == null ? null : default_database.trim();
    }

    public String getDefault_namespace() {
        return default_namespace;
    }

    public void setDefault_namespace(String default_namespace) {
        this.default_namespace = default_namespace == null ? null : default_namespace.trim();
    }

    public Byte getDefault_result_schema() {
        return default_result_schema;
    }

    public void setDefault_result_schema(Byte default_result_schema) {
        this.default_result_schema = default_result_schema;
    }

    public String getDefault_result_schema_desc() {
        return default_result_schema_desc;
    }

    public void setDefault_result_schema_desc(String default_result_schema_desc) {
        this.default_result_schema_desc = default_result_schema_desc == null ? null : default_result_schema_desc.trim();
    }

    public Boolean getIs_xml_charset_enforced() {
        return is_xml_charset_enforced;
    }

    public void setIs_xml_charset_enforced(Boolean is_xml_charset_enforced) {
        this.is_xml_charset_enforced = is_xml_charset_enforced;
    }

    public Boolean getIs_session_enabled() {
        return is_session_enabled;
    }

    public void setIs_session_enabled(Boolean is_session_enabled) {
        this.is_session_enabled = is_session_enabled;
    }

    public Integer getSession_timeout() {
        return session_timeout;
    }

    public void setSession_timeout(Integer session_timeout) {
        this.session_timeout = session_timeout;
    }

    public String getLogin_type() {
        return login_type;
    }

    public void setLogin_type(String login_type) {
        this.login_type = login_type == null ? null : login_type.trim();
    }

    public Integer getHeader_limit() {
        return header_limit;
    }

    public void setHeader_limit(Integer header_limit) {
        this.header_limit = header_limit;
    }
}