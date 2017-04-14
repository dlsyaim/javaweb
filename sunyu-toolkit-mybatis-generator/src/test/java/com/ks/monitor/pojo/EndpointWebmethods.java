package com.ks.monitor.pojo;

public class EndpointWebmethods {
    private Integer endpoint_id;

    private String namespace;

    private String method_alias;

    private String object_name;

    private Byte result_schema;

    private String result_schema_desc;

    private Byte result_format;

    private String result_format_desc;

    public Integer getEndpoint_id() {
        return endpoint_id;
    }

    public void setEndpoint_id(Integer endpoint_id) {
        this.endpoint_id = endpoint_id;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace == null ? null : namespace.trim();
    }

    public String getMethod_alias() {
        return method_alias;
    }

    public void setMethod_alias(String method_alias) {
        this.method_alias = method_alias == null ? null : method_alias.trim();
    }

    public String getObject_name() {
        return object_name;
    }

    public void setObject_name(String object_name) {
        this.object_name = object_name == null ? null : object_name.trim();
    }

    public Byte getResult_schema() {
        return result_schema;
    }

    public void setResult_schema(Byte result_schema) {
        this.result_schema = result_schema;
    }

    public String getResult_schema_desc() {
        return result_schema_desc;
    }

    public void setResult_schema_desc(String result_schema_desc) {
        this.result_schema_desc = result_schema_desc == null ? null : result_schema_desc.trim();
    }

    public Byte getResult_format() {
        return result_format;
    }

    public void setResult_format(Byte result_format) {
        this.result_format = result_format;
    }

    public String getResult_format_desc() {
        return result_format_desc;
    }

    public void setResult_format_desc(String result_format_desc) {
        this.result_format_desc = result_format_desc == null ? null : result_format_desc.trim();
    }
}