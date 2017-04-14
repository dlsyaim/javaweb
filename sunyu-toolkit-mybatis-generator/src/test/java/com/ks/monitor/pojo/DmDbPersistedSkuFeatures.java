package com.ks.monitor.pojo;

public class DmDbPersistedSkuFeatures {
    private String feature_name;

    private Integer feature_id;

    public String getFeature_name() {
        return feature_name;
    }

    public void setFeature_name(String feature_name) {
        this.feature_name = feature_name == null ? null : feature_name.trim();
    }

    public Integer getFeature_id() {
        return feature_id;
    }

    public void setFeature_id(Integer feature_id) {
        this.feature_id = feature_id;
    }
}