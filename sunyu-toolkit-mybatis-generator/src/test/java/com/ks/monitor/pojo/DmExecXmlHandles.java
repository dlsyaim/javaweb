package com.ks.monitor.pojo;

import java.util.Date;

public class DmExecXmlHandles {
    private Integer session_id;

    private Integer document_id;

    private Integer namespace_document_id;

    private Integer statement_start_offset;

    private Integer statement_end_offset;

    private Date creation_time;

    private Long original_document_size_bytes;

    private Long original_namespace_document_size_bytes;

    private Long num_openxml_calls;

    private Long dormant_duration_ms;

    private Long row_count;

    private byte[] sql_handle;

    public Integer getSession_id() {
        return session_id;
    }

    public void setSession_id(Integer session_id) {
        this.session_id = session_id;
    }

    public Integer getDocument_id() {
        return document_id;
    }

    public void setDocument_id(Integer document_id) {
        this.document_id = document_id;
    }

    public Integer getNamespace_document_id() {
        return namespace_document_id;
    }

    public void setNamespace_document_id(Integer namespace_document_id) {
        this.namespace_document_id = namespace_document_id;
    }

    public Integer getStatement_start_offset() {
        return statement_start_offset;
    }

    public void setStatement_start_offset(Integer statement_start_offset) {
        this.statement_start_offset = statement_start_offset;
    }

    public Integer getStatement_end_offset() {
        return statement_end_offset;
    }

    public void setStatement_end_offset(Integer statement_end_offset) {
        this.statement_end_offset = statement_end_offset;
    }

    public Date getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }

    public Long getOriginal_document_size_bytes() {
        return original_document_size_bytes;
    }

    public void setOriginal_document_size_bytes(Long original_document_size_bytes) {
        this.original_document_size_bytes = original_document_size_bytes;
    }

    public Long getOriginal_namespace_document_size_bytes() {
        return original_namespace_document_size_bytes;
    }

    public void setOriginal_namespace_document_size_bytes(Long original_namespace_document_size_bytes) {
        this.original_namespace_document_size_bytes = original_namespace_document_size_bytes;
    }

    public Long getNum_openxml_calls() {
        return num_openxml_calls;
    }

    public void setNum_openxml_calls(Long num_openxml_calls) {
        this.num_openxml_calls = num_openxml_calls;
    }

    public Long getDormant_duration_ms() {
        return dormant_duration_ms;
    }

    public void setDormant_duration_ms(Long dormant_duration_ms) {
        this.dormant_duration_ms = dormant_duration_ms;
    }

    public Long getRow_count() {
        return row_count;
    }

    public void setRow_count(Long row_count) {
        this.row_count = row_count;
    }

    public byte[] getSql_handle() {
        return sql_handle;
    }

    public void setSql_handle(byte[] sql_handle) {
        this.sql_handle = sql_handle;
    }
}