package com.ks.monitor.pojo;

import java.util.Date;

public class Certificates {
    private String name;

    private Integer certificate_id;

    private Integer principal_id;

    private String pvt_key_encryption_type;

    private String pvt_key_encryption_type_desc;

    private Boolean is_active_for_begin_dialog;

    private String issuer_name;

    private String cert_serial_number;

    private String string_sid;

    private String subject;

    private Date expiry_date;

    private Date start_date;

    private String attested_by;

    private Date pvt_key_last_backup_date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCertificate_id() {
        return certificate_id;
    }

    public void setCertificate_id(Integer certificate_id) {
        this.certificate_id = certificate_id;
    }

    public Integer getPrincipal_id() {
        return principal_id;
    }

    public void setPrincipal_id(Integer principal_id) {
        this.principal_id = principal_id;
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

    public Boolean getIs_active_for_begin_dialog() {
        return is_active_for_begin_dialog;
    }

    public void setIs_active_for_begin_dialog(Boolean is_active_for_begin_dialog) {
        this.is_active_for_begin_dialog = is_active_for_begin_dialog;
    }

    public String getIssuer_name() {
        return issuer_name;
    }

    public void setIssuer_name(String issuer_name) {
        this.issuer_name = issuer_name == null ? null : issuer_name.trim();
    }

    public String getCert_serial_number() {
        return cert_serial_number;
    }

    public void setCert_serial_number(String cert_serial_number) {
        this.cert_serial_number = cert_serial_number == null ? null : cert_serial_number.trim();
    }

    public String getString_sid() {
        return string_sid;
    }

    public void setString_sid(String string_sid) {
        this.string_sid = string_sid == null ? null : string_sid.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Date getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public String getAttested_by() {
        return attested_by;
    }

    public void setAttested_by(String attested_by) {
        this.attested_by = attested_by == null ? null : attested_by.trim();
    }

    public Date getPvt_key_last_backup_date() {
        return pvt_key_last_backup_date;
    }

    public void setPvt_key_last_backup_date(Date pvt_key_last_backup_date) {
        this.pvt_key_last_backup_date = pvt_key_last_backup_date;
    }
}