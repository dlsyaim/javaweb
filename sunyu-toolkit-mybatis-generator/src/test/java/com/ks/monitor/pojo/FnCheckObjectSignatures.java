package com.ks.monitor.pojo;

public class FnCheckObjectSignatures {
    private String type;

    private Integer entity_id;

    private Integer is_signed;

    private Integer is_signature_valid;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getEntity_id() {
        return entity_id;
    }

    public void setEntity_id(Integer entity_id) {
        this.entity_id = entity_id;
    }

    public Integer getIs_signed() {
        return is_signed;
    }

    public void setIs_signed(Integer is_signed) {
        this.is_signed = is_signed;
    }

    public Integer getIs_signature_valid() {
        return is_signature_valid;
    }

    public void setIs_signature_valid(Integer is_signature_valid) {
        this.is_signature_valid = is_signature_valid;
    }
}