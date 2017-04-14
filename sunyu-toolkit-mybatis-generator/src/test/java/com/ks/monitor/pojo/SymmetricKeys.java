package com.ks.monitor.pojo;

import java.util.Date;

public class SymmetricKeys {
    private String name;

    private Integer principal_id;

    private Integer symmetric_key_id;

    private Integer key_length;

    private String key_algorithm;

    private String algorithm_desc;

    private Date create_date;

    private Date modify_date;

    private String key_guid;

    private String key_thumbprint;

    private String provider_type;

    private String cryptographic_provider_guid;

    private String cryptographic_provider_algid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPrincipal_id() {
        return principal_id;
    }

    public void setPrincipal_id(Integer principal_id) {
        this.principal_id = principal_id;
    }

    public Integer getSymmetric_key_id() {
        return symmetric_key_id;
    }

    public void setSymmetric_key_id(Integer symmetric_key_id) {
        this.symmetric_key_id = symmetric_key_id;
    }

    public Integer getKey_length() {
        return key_length;
    }

    public void setKey_length(Integer key_length) {
        this.key_length = key_length;
    }

    public String getKey_algorithm() {
        return key_algorithm;
    }

    public void setKey_algorithm(String key_algorithm) {
        this.key_algorithm = key_algorithm == null ? null : key_algorithm.trim();
    }

    public String getAlgorithm_desc() {
        return algorithm_desc;
    }

    public void setAlgorithm_desc(String algorithm_desc) {
        this.algorithm_desc = algorithm_desc == null ? null : algorithm_desc.trim();
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getModify_date() {
        return modify_date;
    }

    public void setModify_date(Date modify_date) {
        this.modify_date = modify_date;
    }

    public String getKey_guid() {
        return key_guid;
    }

    public void setKey_guid(String key_guid) {
        this.key_guid = key_guid == null ? null : key_guid.trim();
    }

    public String getKey_thumbprint() {
        return key_thumbprint;
    }

    public void setKey_thumbprint(String key_thumbprint) {
        this.key_thumbprint = key_thumbprint == null ? null : key_thumbprint.trim();
    }

    public String getProvider_type() {
        return provider_type;
    }

    public void setProvider_type(String provider_type) {
        this.provider_type = provider_type == null ? null : provider_type.trim();
    }

    public String getCryptographic_provider_guid() {
        return cryptographic_provider_guid;
    }

    public void setCryptographic_provider_guid(String cryptographic_provider_guid) {
        this.cryptographic_provider_guid = cryptographic_provider_guid == null ? null : cryptographic_provider_guid.trim();
    }

    public String getCryptographic_provider_algid() {
        return cryptographic_provider_algid;
    }

    public void setCryptographic_provider_algid(String cryptographic_provider_algid) {
        this.cryptographic_provider_algid = cryptographic_provider_algid == null ? null : cryptographic_provider_algid.trim();
    }
}