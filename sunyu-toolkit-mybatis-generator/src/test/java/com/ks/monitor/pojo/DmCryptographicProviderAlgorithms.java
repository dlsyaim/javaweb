package com.ks.monitor.pojo;

public class DmCryptographicProviderAlgorithms {
    private Integer algorithm_id;

    private String algorithm_tag;

    private String key_type;

    private Integer key_length;

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
}