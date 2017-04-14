package com.ks.monitor.pojo;

public class AsymmetricKeys {
    private String name;

    private Integer principal_id;

    private Integer asymmetric_key_id;

    private String pvt_key_encryption_type;

    private String pvt_key_encryption_type_desc;

    private String algorithm;

    private String algorithm_desc;

    private Integer key_length;

    private String string_sid;

    private String attested_by;

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

    public Integer getAsymmetric_key_id() {
        return asymmetric_key_id;
    }

    public void setAsymmetric_key_id(Integer asymmetric_key_id) {
        this.asymmetric_key_id = asymmetric_key_id;
    }

    public String getPvt_key_encryption_type() {
        return pvt_key_encryption_type;
    }

    public void setPvt_key_encryption_type(String pvt_key_encryption_type) {
        this.pvt_key_encryption_type = pvt_key_encryption_type == null ? null : pvt_key_encryption_type.trim();
    }

    public String getPvt_key_encryption_type_desc() {
        return pvt_key_encryption_type_desc;
    }

    public void setPvt_key_encryption_type_desc(String pvt_key_encryption_type_desc) {
        this.pvt_key_encryption_type_desc = pvt_key_encryption_type_desc == null ? null : pvt_key_encryption_type_desc.trim();
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm == null ? null : algorithm.trim();
    }

    public String getAlgorithm_desc() {
        return algorithm_desc;
    }

    public void setAlgorithm_desc(String algorithm_desc) {
        this.algorithm_desc = algorithm_desc == null ? null : algorithm_desc.trim();
    }

    public Integer getKey_length() {
        return key_length;
    }

    public void setKey_length(Integer key_length) {
        this.key_length = key_length;
    }

    public String getString_sid() {
        return string_sid;
    }

    public void setString_sid(String string_sid) {
        this.string_sid = string_sid == null ? null : string_sid.trim();
    }

    public String getAttested_by() {
        return attested_by;
    }

    public void setAttested_by(String attested_by) {
        this.attested_by = attested_by == null ? null : attested_by.trim();
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