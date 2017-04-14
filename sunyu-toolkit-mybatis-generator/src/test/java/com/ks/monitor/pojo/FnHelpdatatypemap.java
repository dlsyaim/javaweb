package com.ks.monitor.pojo;

public class FnHelpdatatypemap {
    private Integer mapping_id;

    private String source_dbms;

    private String source_version;

    private String source_type;

    private Long source_length_min;

    private Long source_length_max;

    private Long source_precision_min;

    private Long source_precision_max;

    private Integer source_scale_min;

    private Integer source_scale_max;

    private Boolean source_nullable;

    private Integer source_createparams;

    private String destination_dbms;

    private String destination_version;

    private String destination_type;

    private Long destination_length;

    private Long destination_precision;

    private Integer destination_scale;

    private Boolean destination_nullable;

    private Integer destination_createparams;

    private Boolean dataloss;

    private Boolean is_default;

    public Integer getMapping_id() {
        return mapping_id;
    }

    public void setMapping_id(Integer mapping_id) {
        this.mapping_id = mapping_id;
    }

    public String getSource_dbms() {
        return source_dbms;
    }

    public void setSource_dbms(String source_dbms) {
        this.source_dbms = source_dbms == null ? null : source_dbms.trim();
    }

    public String getSource_version() {
        return source_version;
    }

    public void setSource_version(String source_version) {
        this.source_version = source_version == null ? null : source_version.trim();
    }

    public String getSource_type() {
        return source_type;
    }

    public void setSource_type(String source_type) {
        this.source_type = source_type == null ? null : source_type.trim();
    }

    public Long getSource_length_min() {
        return source_length_min;
    }

    public void setSource_length_min(Long source_length_min) {
        this.source_length_min = source_length_min;
    }

    public Long getSource_length_max() {
        return source_length_max;
    }

    public void setSource_length_max(Long source_length_max) {
        this.source_length_max = source_length_max;
    }

    public Long getSource_precision_min() {
        return source_precision_min;
    }

    public void setSource_precision_min(Long source_precision_min) {
        this.source_precision_min = source_precision_min;
    }

    public Long getSource_precision_max() {
        return source_precision_max;
    }

    public void setSource_precision_max(Long source_precision_max) {
        this.source_precision_max = source_precision_max;
    }

    public Integer getSource_scale_min() {
        return source_scale_min;
    }

    public void setSource_scale_min(Integer source_scale_min) {
        this.source_scale_min = source_scale_min;
    }

    public Integer getSource_scale_max() {
        return source_scale_max;
    }

    public void setSource_scale_max(Integer source_scale_max) {
        this.source_scale_max = source_scale_max;
    }

    public Boolean getSource_nullable() {
        return source_nullable;
    }

    public void setSource_nullable(Boolean source_nullable) {
        this.source_nullable = source_nullable;
    }

    public Integer getSource_createparams() {
        return source_createparams;
    }

    public void setSource_createparams(Integer source_createparams) {
        this.source_createparams = source_createparams;
    }

    public String getDestination_dbms() {
        return destination_dbms;
    }

    public void setDestination_dbms(String destination_dbms) {
        this.destination_dbms = destination_dbms == null ? null : destination_dbms.trim();
    }

    public String getDestination_version() {
        return destination_version;
    }

    public void setDestination_version(String destination_version) {
        this.destination_version = destination_version == null ? null : destination_version.trim();
    }

    public String getDestination_type() {
        return destination_type;
    }

    public void setDestination_type(String destination_type) {
        this.destination_type = destination_type == null ? null : destination_type.trim();
    }

    public Long getDestination_length() {
        return destination_length;
    }

    public void setDestination_length(Long destination_length) {
        this.destination_length = destination_length;
    }

    public Long getDestination_precision() {
        return destination_precision;
    }

    public void setDestination_precision(Long destination_precision) {
        this.destination_precision = destination_precision;
    }

    public Integer getDestination_scale() {
        return destination_scale;
    }

    public void setDestination_scale(Integer destination_scale) {
        this.destination_scale = destination_scale;
    }

    public Boolean getDestination_nullable() {
        return destination_nullable;
    }

    public void setDestination_nullable(Boolean destination_nullable) {
        this.destination_nullable = destination_nullable;
    }

    public Integer getDestination_createparams() {
        return destination_createparams;
    }

    public void setDestination_createparams(Integer destination_createparams) {
        this.destination_createparams = destination_createparams;
    }

    public Boolean getDataloss() {
        return dataloss;
    }

    public void setDataloss(Boolean dataloss) {
        this.dataloss = dataloss;
    }

    public Boolean getIs_default() {
        return is_default;
    }

    public void setIs_default(Boolean is_default) {
        this.is_default = is_default;
    }
}