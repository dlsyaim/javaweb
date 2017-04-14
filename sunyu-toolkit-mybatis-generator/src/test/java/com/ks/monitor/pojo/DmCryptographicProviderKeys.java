package com.ks.monitor.pojo;

public class DmCryptographicProviderKeys {
    private Integer key_id;

    private String key_name;

    private Integer algorithm_id;

    private String algorithm_tag;

    private String key_type;

    private Integer key_length;

    private byte[] key_thumbprint;

    public Integer getKey_id() {
        return key_id;
    }

    public void setKey_id(Integer key_id) {
        this.key_id = key_id;
    }

    public String getKey_name() {
        return key_name;
    }

    public void setKey_name(String key_name) {
        this.key_name = key_name == null ? null : key_name.trim();
    }

    public Integer getAlgorithm_id() {
        return algorithm_id;
    }

    public void setAlgorithm_id(Integer algorithm_id) {
        this.algorithm_id = algorithm_id;
    }

    public String getAlgorithm_tag() {
        return algorithm_tag;
    }

    public void setAlgorithm_tag(String algorithm_tag) {
        this.algorithm_tag = algorithm_tag == null ? null : algorithm_tag.trim();
    }

    public String getKey_type() {
        return key_type;
    }

    public void setKey_type(String key_type) {
        this.key_type = key_type == null ? null : key_type.trim();
    }

    public Integer getKey_length() {
        return key_length;
    }

    public void setKey_length(Integer key_length) {
        this.key_length = key_length;
    }

    public byte[] getKey_thumbprint() {
        return key_thumbprint;
    }

    public void setKey_thumbprint(byte[] key_thumbprint) {
        this.key_thumbprint = key_thumbprint;
    }
}