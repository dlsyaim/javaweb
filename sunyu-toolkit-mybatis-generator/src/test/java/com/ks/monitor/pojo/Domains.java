package com.ks.monitor.pojo;

public class Domains {
    private String DOMAIN_CATALOG;

    private String DOMAIN_SCHEMA;

    private String DOMAIN_NAME;

    private String DATA_TYPE;

    private Integer CHARACTER_MAXIMUM_LENGTH;

    private Integer CHARACTER_OCTET_LENGTH;

    private String COLLATION_CATALOG;

    private String COLLATION_SCHEMA;

    private String COLLATION_NAME;

    private String CHARACTER_SET_CATALOG;

    private String CHARACTER_SET_SCHEMA;

    private String CHARACTER_SET_NAME;

    private Byte NUMERIC_PRECISION;

    private Short NUMERIC_PRECISION_RADIX;

    private Integer NUMERIC_SCALE;

    private Short DATETIME_PRECISION;

    private String DOMAIN_DEFAULT;

    public String getDOMAIN_CATALOG() {
        return DOMAIN_CATALOG;
    }

    public void setDOMAIN_CATALOG(String DOMAIN_CATALOG) {
        this.DOMAIN_CATALOG = DOMAIN_CATALOG == null ? null : DOMAIN_CATALOG.trim();
    }

    public String getDOMAIN_SCHEMA() {
        return DOMAIN_SCHEMA;
    }

    public void setDOMAIN_SCHEMA(String DOMAIN_SCHEMA) {
        this.DOMAIN_SCHEMA = DOMAIN_SCHEMA == null ? null : DOMAIN_SCHEMA.trim();
    }

    public String getDOMAIN_NAME() {
        return DOMAIN_NAME;
    }

    public void setDOMAIN_NAME(String DOMAIN_NAME) {
        this.DOMAIN_NAME = DOMAIN_NAME == null ? null : DOMAIN_NAME.trim();
    }

    public String getDATA_TYPE() {
        return DATA_TYPE;
    }

    public void setDATA_TYPE(String DATA_TYPE) {
        this.DATA_TYPE = DATA_TYPE == null ? null : DATA_TYPE.trim();
    }

    public Integer getCHARACTER_MAXIMUM_LENGTH() {
        return CHARACTER_MAXIMUM_LENGTH;
    }

    public void setCHARACTER_MAXIMUM_LENGTH(Integer CHARACTER_MAXIMUM_LENGTH) {
        this.CHARACTER_MAXIMUM_LENGTH = CHARACTER_MAXIMUM_LENGTH;
    }

    public Integer getCHARACTER_OCTET_LENGTH() {
        return CHARACTER_OCTET_LENGTH;
    }

    public void setCHARACTER_OCTET_LENGTH(Integer CHARACTER_OCTET_LENGTH) {
        this.CHARACTER_OCTET_LENGTH = CHARACTER_OCTET_LENGTH;
    }

    public String getCOLLATION_CATALOG() {
        return COLLATION_CATALOG;
    }

    public void setCOLLATION_CATALOG(String COLLATION_CATALOG) {
        this.COLLATION_CATALOG = COLLATION_CATALOG == null ? null : COLLATION_CATALOG.trim();
    }

    public String getCOLLATION_SCHEMA() {
        return COLLATION_SCHEMA;
    }

    public void setCOLLATION_SCHEMA(String COLLATION_SCHEMA) {
        this.COLLATION_SCHEMA = COLLATION_SCHEMA == null ? null : COLLATION_SCHEMA.trim();
    }

    public String getCOLLATION_NAME() {
        return COLLATION_NAME;
    }

    public void setCOLLATION_NAME(String COLLATION_NAME) {
        this.COLLATION_NAME = COLLATION_NAME == null ? null : COLLATION_NAME.trim();
    }

    public String getCHARACTER_SET_CATALOG() {
        return CHARACTER_SET_CATALOG;
    }

    public void setCHARACTER_SET_CATALOG(String CHARACTER_SET_CATALOG) {
        this.CHARACTER_SET_CATALOG = CHARACTER_SET_CATALOG == null ? null : CHARACTER_SET_CATALOG.trim();
    }

    public String getCHARACTER_SET_SCHEMA() {
        return CHARACTER_SET_SCHEMA;
    }

    public void setCHARACTER_SET_SCHEMA(String CHARACTER_SET_SCHEMA) {
        this.CHARACTER_SET_SCHEMA = CHARACTER_SET_SCHEMA == null ? null : CHARACTER_SET_SCHEMA.trim();
    }

    public String getCHARACTER_SET_NAME() {
        return CHARACTER_SET_NAME;
    }

    public void setCHARACTER_SET_NAME(String CHARACTER_SET_NAME) {
        this.CHARACTER_SET_NAME = CHARACTER_SET_NAME == null ? null : CHARACTER_SET_NAME.trim();
    }

    public Byte getNUMERIC_PRECISION() {
        return NUMERIC_PRECISION;
    }

    public void setNUMERIC_PRECISION(Byte NUMERIC_PRECISION) {
        this.NUMERIC_PRECISION = NUMERIC_PRECISION;
    }

    public Short getNUMERIC_PRECISION_RADIX() {
        return NUMERIC_PRECISION_RADIX;
    }

    public void setNUMERIC_PRECISION_RADIX(Short NUMERIC_PRECISION_RADIX) {
        this.NUMERIC_PRECISION_RADIX = NUMERIC_PRECISION_RADIX;
    }

    public Integer getNUMERIC_SCALE() {
        return NUMERIC_SCALE;
    }

    public void setNUMERIC_SCALE(Integer NUMERIC_SCALE) {
        this.NUMERIC_SCALE = NUMERIC_SCALE;
    }

    public Short getDATETIME_PRECISION() {
        return DATETIME_PRECISION;
    }

    public void setDATETIME_PRECISION(Short DATETIME_PRECISION) {
        this.DATETIME_PRECISION = DATETIME_PRECISION;
    }

    public String getDOMAIN_DEFAULT() {
        return DOMAIN_DEFAULT;
    }

    public void setDOMAIN_DEFAULT(String DOMAIN_DEFAULT) {
        this.DOMAIN_DEFAULT = DOMAIN_DEFAULT == null ? null : DOMAIN_DEFAULT.trim();
    }
}