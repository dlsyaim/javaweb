package com.ks.monitor.pojo;

import java.util.Date;

public class DmDatabaseEncryptionKeys {
    private Integer database_id;

    private Integer encryption_state;

    private Date create_date;

    private Date regenerate_date;

    private Date modify_date;

    private Date set_date;

    private Date opened_date;

    private String key_algorithm;

    private Integer key_length;

    private Float percent_complete;

    private byte[] encryptor_thumbprint;

    public Integer getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Integer database_id) {
        this.database_id = database_id;
    }

    public Integer getEncryption_state() {
        return encryption_state;
    }

    public void setEncryption_state(Integer encryption_state) {
        this.encryption_state = encryption_state;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getRegenerate_date() {
        return regenerate_date;
    }

    public void setRegenerate_date(Date regenerate_date) {
        this.regenerate_date = regenerate_date;
    }

    public Date getModify_date() {
        return modify_date;
    }

    public void setModify_date(Date modify_date) {
        this.modify_date = modify_date;
    }

    public Date getSet_date() {
        return set_date;
    }

    public void setSet_date(Date set_date) {
        this.set_date = set_date;
    }

    public Date getOpened_date() {
        return opened_date;
    }

    public void setOpened_date(Date opened_date) {
        this.opened_date = opened_date;
    }

    public String getKey_algorithm() {
        return key_algorithm;
    }

    public void setKey_algorithm(String key_algorithm) {
        this.key_algorithm = key_algorithm == null ? null : key_algorithm.trim();
    }

    public Integer getKey_length() {
        return key_length;
    }

    public void setKey_length(Integer key_length) {
        this.key_length = key_length;
    }

    public Float getPercent_complete() {
        return percent_complete;
    }

    public void setPercent_complete(Float percent_complete) {
        this.percent_complete = percent_complete;
    }

    public byte[] getEncryptor_thumbprint() {
        return encryptor_thumbprint;
    }

    public void setEncryptor_thumbprint(byte[] encryptor_thumbprint) {
        this.encryptor_thumbprint = encryptor_thumbprint;
    }
}