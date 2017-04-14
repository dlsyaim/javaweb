package com.ks.monitor.pojo;

public class CryptProperties {
    private Byte class;

    private String class_desc;

    private Integer major_id;

    private String crypt_type;

    private String crypt_type_desc;

    public Byte getClass() {
        return class;
    }

    public void setClass(Byte class) {
        this.class = class;
    }

    public String getClass_desc() {
        return class_desc;
    }

    public void setClass_desc(String class_desc) {
        this.class_desc = class_desc == null ? null : class_desc.trim();
    }

    public Integer getMajor_id() {
        return major_id;
    }

    public void setMajor_id(Integer major_id) {
        this.major_id = major_id;
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