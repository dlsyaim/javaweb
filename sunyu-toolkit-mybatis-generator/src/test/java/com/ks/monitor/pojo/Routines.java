package com.ks.monitor.pojo;

import java.util.Date;

public class Routines {
    private String SPECIFIC_CATALOG;

    private String SPECIFIC_SCHEMA;

    private String SPECIFIC_NAME;

    private String ROUTINE_CATALOG;

    private String ROUTINE_SCHEMA;

    private String ROUTINE_NAME;

    private String ROUTINE_TYPE;

    private String MODULE_CATALOG;

    private String MODULE_SCHEMA;

    private String MODULE_NAME;

    private String UDT_CATALOG;

    private String UDT_SCHEMA;

    private String UDT_NAME;

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

    private String INTERVAL_TYPE;

    private Short INTERVAL_PRECISION;

    private String TYPE_UDT_CATALOG;

    private String TYPE_UDT_SCHEMA;

    private String TYPE_UDT_NAME;

    private String SCOPE_CATALOG;

    private String SCOPE_SCHEMA;

    private String SCOPE_NAME;

    private Long MAXIMUM_CARDINALITY;

    private String DTD_IDENTIFIER;

    private String ROUTINE_BODY;

    private String ROUTINE_DEFINITION;

    private String EXTERNAL_NAME;

    private String EXTERNAL_LANGUAGE;

    private String PARAMETER_STYLE;

    private String IS_DETERMINISTIC;

    private String SQL_DATA_ACCESS;

    private String IS_NULL_CALL;

    private String SQL_PATH;

    private String SCHEMA_LEVEL_ROUTINE;

    private Short MAX_DYNAMIC_RESULT_SETS;

    private String IS_USER_DEFINED_CAST;

    private String IS_IMPLICITLY_INVOCABLE;

    private Date CREATED;

    private Date LAST_ALTERED;

    public String getSPECIFIC_CATALOG() {
        return SPECIFIC_CATALOG;
    }

    public void setSPECIFIC_CATALOG(String SPECIFIC_CATALOG) {
        this.SPECIFIC_CATALOG = SPECIFIC_CATALOG == null ? null : SPECIFIC_CATALOG.trim();
    }

    public String getSPECIFIC_SCHEMA() {
        return SPECIFIC_SCHEMA;
    }

    public void setSPECIFIC_SCHEMA(String SPECIFIC_SCHEMA) {
        this.SPECIFIC_SCHEMA = SPECIFIC_SCHEMA == null ? null : SPECIFIC_SCHEMA.trim();
    }

    public String getSPECIFIC_NAME() {
        return SPECIFIC_NAME;
    }

    public void setSPECIFIC_NAME(String SPECIFIC_NAME) {
        this.SPECIFIC_NAME = SPECIFIC_NAME == null ? null : SPECIFIC_NAME.trim();
    }

    public String getROUTINE_CATALOG() {
        return ROUTINE_CATALOG;
    }

    public void setROUTINE_CATALOG(String ROUTINE_CATALOG) {
        this.ROUTINE_CATALOG = ROUTINE_CATALOG == null ? null : ROUTINE_CATALOG.trim();
    }

    public String getROUTINE_SCHEMA() {
        return ROUTINE_SCHEMA;
    }

    public void setROUTINE_SCHEMA(String ROUTINE_SCHEMA) {
        this.ROUTINE_SCHEMA = ROUTINE_SCHEMA == null ? null : ROUTINE_SCHEMA.trim();
    }

    public String getROUTINE_NAME() {
        return ROUTINE_NAME;
    }

    public void setROUTINE_NAME(String ROUTINE_NAME) {
        this.ROUTINE_NAME = ROUTINE_NAME == null ? null : ROUTINE_NAME.trim();
    }

    public String getROUTINE_TYPE() {
        return ROUTINE_TYPE;
    }

    public void setROUTINE_TYPE(String ROUTINE_TYPE) {
        this.ROUTINE_TYPE = ROUTINE_TYPE == null ? null : ROUTINE_TYPE.trim();
    }

    public String getMODULE_CATALOG() {
        return MODULE_CATALOG;
    }

    public void setMODULE_CATALOG(String MODULE_CATALOG) {
        this.MODULE_CATALOG = MODULE_CATALOG == null ? null : MODULE_CATALOG.trim();
    }

    public String getMODULE_SCHEMA() {
        return MODULE_SCHEMA;
    }

    public void setMODULE_SCHEMA(String MODULE_SCHEMA) {
        this.MODULE_SCHEMA = MODULE_SCHEMA == null ? null : MODULE_SCHEMA.trim();
    }

    public String getMODULE_NAME() {
        return MODULE_NAME;
    }

    public void setMODULE_NAME(String MODULE_NAME) {
        this.MODULE_NAME = MODULE_NAME == null ? null : MODULE_NAME.trim();
    }

    public String getUDT_CATALOG() {
        return UDT_CATALOG;
    }

    public void setUDT_CATALOG(String UDT_CATALOG) {
        this.UDT_CATALOG = UDT_CATALOG == null ? null : UDT_CATALOG.trim();
    }

    public String getUDT_SCHEMA() {
        return UDT_SCHEMA;
    }

    public void setUDT_SCHEMA(String UDT_SCHEMA) {
        this.UDT_SCHEMA = UDT_SCHEMA == null ? null : UDT_SCHEMA.trim();
    }

    public String getUDT_NAME() {
        return UDT_NAME;
    }

    public void setUDT_NAME(String UDT_NAME) {
        this.UDT_NAME = UDT_NAME == null ? null : UDT_NAME.trim();
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

    public String getINTERVAL_TYPE() {
        return INTERVAL_TYPE;
    }

    public void setINTERVAL_TYPE(String INTERVAL_TYPE) {
        this.INTERVAL_TYPE = INTERVAL_TYPE == null ? null : INTERVAL_TYPE.trim();
    }

    public Short getINTERVAL_PRECISION() {
        return INTERVAL_PRECISION;
    }

    public void setINTERVAL_PRECISION(Short INTERVAL_PRECISION) {
        this.INTERVAL_PRECISION = INTERVAL_PRECISION;
    }

    public String getTYPE_UDT_CATALOG() {
        return TYPE_UDT_CATALOG;
    }

    public void setTYPE_UDT_CATALOG(String TYPE_UDT_CATALOG) {
        this.TYPE_UDT_CATALOG = TYPE_UDT_CATALOG == null ? null : TYPE_UDT_CATALOG.trim();
    }

    public String getTYPE_UDT_SCHEMA() {
        return TYPE_UDT_SCHEMA;
    }

    public void setTYPE_UDT_SCHEMA(String TYPE_UDT_SCHEMA) {
        this.TYPE_UDT_SCHEMA = TYPE_UDT_SCHEMA == null ? null : TYPE_UDT_SCHEMA.trim();
    }

    public String getTYPE_UDT_NAME() {
        return TYPE_UDT_NAME;
    }

    public void setTYPE_UDT_NAME(String TYPE_UDT_NAME) {
        this.TYPE_UDT_NAME = TYPE_UDT_NAME == null ? null : TYPE_UDT_NAME.trim();
    }

    public String getSCOPE_CATALOG() {
        return SCOPE_CATALOG;
    }

    public void setSCOPE_CATALOG(String SCOPE_CATALOG) {
        this.SCOPE_CATALOG = SCOPE_CATALOG == null ? null : SCOPE_CATALOG.trim();
    }

    public String getSCOPE_SCHEMA() {
        return SCOPE_SCHEMA;
    }

    public void setSCOPE_SCHEMA(String SCOPE_SCHEMA) {
        this.SCOPE_SCHEMA = SCOPE_SCHEMA == null ? null : SCOPE_SCHEMA.trim();
    }

    public String getSCOPE_NAME() {
        return SCOPE_NAME;
    }

    public void setSCOPE_NAME(String SCOPE_NAME) {
        this.SCOPE_NAME = SCOPE_NAME == null ? null : SCOPE_NAME.trim();
    }

    public Long getMAXIMUM_CARDINALITY() {
        return MAXIMUM_CARDINALITY;
    }

    public void setMAXIMUM_CARDINALITY(Long MAXIMUM_CARDINALITY) {
        this.MAXIMUM_CARDINALITY = MAXIMUM_CARDINALITY;
    }

    public String getDTD_IDENTIFIER() {
        return DTD_IDENTIFIER;
    }

    public void setDTD_IDENTIFIER(String DTD_IDENTIFIER) {
        this.DTD_IDENTIFIER = DTD_IDENTIFIER == null ? null : DTD_IDENTIFIER.trim();
    }

    public String getROUTINE_BODY() {
        return ROUTINE_BODY;
    }

    public void setROUTINE_BODY(String ROUTINE_BODY) {
        this.ROUTINE_BODY = ROUTINE_BODY == null ? null : ROUTINE_BODY.trim();
    }

    public String getROUTINE_DEFINITION() {
        return ROUTINE_DEFINITION;
    }

    public void setROUTINE_DEFINITION(String ROUTINE_DEFINITION) {
        this.ROUTINE_DEFINITION = ROUTINE_DEFINITION == null ? null : ROUTINE_DEFINITION.trim();
    }

    public String getEXTERNAL_NAME() {
        return EXTERNAL_NAME;
    }

    public void setEXTERNAL_NAME(String EXTERNAL_NAME) {
        this.EXTERNAL_NAME = EXTERNAL_NAME == null ? null : EXTERNAL_NAME.trim();
    }

    public String getEXTERNAL_LANGUAGE() {
        return EXTERNAL_LANGUAGE;
    }

    public void setEXTERNAL_LANGUAGE(String EXTERNAL_LANGUAGE) {
        this.EXTERNAL_LANGUAGE = EXTERNAL_LANGUAGE == null ? null : EXTERNAL_LANGUAGE.trim();
    }

    public String getPARAMETER_STYLE() {
        return PARAMETER_STYLE;
    }

    public void setPARAMETER_STYLE(String PARAMETER_STYLE) {
        this.PARAMETER_STYLE = PARAMETER_STYLE == null ? null : PARAMETER_STYLE.trim();
    }

    public String getIS_DETERMINISTIC() {
        return IS_DETERMINISTIC;
    }

    public void setIS_DETERMINISTIC(String IS_DETERMINISTIC) {
        this.IS_DETERMINISTIC = IS_DETERMINISTIC == null ? null : IS_DETERMINISTIC.trim();
    }

    public String getSQL_DATA_ACCESS() {
        return SQL_DATA_ACCESS;
    }

    public void setSQL_DATA_ACCESS(String SQL_DATA_ACCESS) {
        this.SQL_DATA_ACCESS = SQL_DATA_ACCESS == null ? null : SQL_DATA_ACCESS.trim();
    }

    public String getIS_NULL_CALL() {
        return IS_NULL_CALL;
    }

    public void setIS_NULL_CALL(String IS_NULL_CALL) {
        this.IS_NULL_CALL = IS_NULL_CALL == null ? null : IS_NULL_CALL.trim();
    }

    public String getSQL_PATH() {
        return SQL_PATH;
    }

    public void setSQL_PATH(String SQL_PATH) {
        this.SQL_PATH = SQL_PATH == null ? null : SQL_PATH.trim();
    }

    public String getSCHEMA_LEVEL_ROUTINE() {
        return SCHEMA_LEVEL_ROUTINE;
    }

    public void setSCHEMA_LEVEL_ROUTINE(String SCHEMA_LEVEL_ROUTINE) {
        this.SCHEMA_LEVEL_ROUTINE = SCHEMA_LEVEL_ROUTINE == null ? null : SCHEMA_LEVEL_ROUTINE.trim();
    }

    public Short getMAX_DYNAMIC_RESULT_SETS() {
        return MAX_DYNAMIC_RESULT_SETS;
    }

    public void setMAX_DYNAMIC_RESULT_SETS(Short MAX_DYNAMIC_RESULT_SETS) {
        this.MAX_DYNAMIC_RESULT_SETS = MAX_DYNAMIC_RESULT_SETS;
    }

    public String getIS_USER_DEFINED_CAST() {
        return IS_USER_DEFINED_CAST;
    }

    public void setIS_USER_DEFINED_CAST(String IS_USER_DEFINED_CAST) {
        this.IS_USER_DEFINED_CAST = IS_USER_DEFINED_CAST == null ? null : IS_USER_DEFINED_CAST.trim();
    }

    public String getIS_IMPLICITLY_INVOCABLE() {
        return IS_IMPLICITLY_INVOCABLE;
    }

    public void setIS_IMPLICITLY_INVOCABLE(String IS_IMPLICITLY_INVOCABLE) {
        this.IS_IMPLICITLY_INVOCABLE = IS_IMPLICITLY_INVOCABLE == null ? null : IS_IMPLICITLY_INVOCABLE.trim();
    }

    public Date getCREATED() {
        return CREATED;
    }

    public void setCREATED(Date CREATED) {
        this.CREATED = CREATED;
    }

    public Date getLAST_ALTERED() {
        return LAST_ALTERED;
    }

    public void setLAST_ALTERED(Date LAST_ALTERED) {
        this.LAST_ALTERED = LAST_ALTERED;
    }
}