package com.ks.monitor.pojo;

public class KeyEncryptions {
    private Integer key_id;

    private String crypt_type;

    private String crypt_type_desc;

    public Integer getKey_id() {
        return key_id;
    }

    public void setKey_id(Integer key_id) {
        this.key_id = key_id;
    }

    public String getCrypt_type() {
        return crypt_type;
    }

    public void setCrypt_type(String crypt_type) {
        this.crypt_type = crypt_type == null ? null : crypt_type.trim();
    }

    public String getCrypt_type_desc() {
        return crypt_type_desc;
    }

    public void setCrypt_type_desc(String crypt_type_desc) {
        this.crypt_type_desc = crypt_type_desc == null ? null : crypt_type_desc.trim();
    }
}