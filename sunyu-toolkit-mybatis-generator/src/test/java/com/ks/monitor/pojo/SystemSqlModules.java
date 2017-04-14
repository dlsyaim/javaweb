package com.ks.monitor.pojo;

public class SystemSqlModules {
    private Integer object_id;

    private Boolean uses_ansi_nulls;

    private Boolean uses_quoted_identifier;

    private Boolean is_schema_bound;

    private Boolean uses_database_collation;

    private Boolean is_recompiled;

    private Boolean null_on_null_input;

    private Integer execute_as_principal_id;

    private String definition;

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public Boolean getUses_ansi_nulls() {
        return uses_ansi_nulls;
    }

    public void setUses_ansi_nulls(Boolean uses_ansi_nulls) {
        this.uses_ansi_nulls = uses_ansi_nulls;
    }

    public Boolean getUses_quoted_identifier() {
        return uses_quoted_identifier;
    }

    public void setUses_quoted_identifier(Boolean uses_quoted_identifier) {
        this.uses_quoted_identifier = uses_quoted_identifier;
    }

    public Boolean getIs_schema_bound() {
        return is_schema_bound;
    }

    public void setIs_schema_bound(Boolean is_schema_bound) {
        this.is_schema_bound = is_schema_bound;
    }

    public Boolean getUses_database_collation() {
        return uses_database_collation;
    }

    public void setUses_database_collation(Boolean uses_database_collation) {
        this.uses_database_collation = uses_database_collation;
    }

    public Boolean getIs_recompiled() {
        return is_recompiled;
    }

    public void setIs_recompiled(Boolean is_recompiled) {
        this.is_recompiled = is_recompiled;
    }

    public Boolean getNull_on_null_input() {
        return null_on_null_input;
    }

    public void setNull_on_null_input(Boolean null_on_null_input) {
        this.null_on_null_input = null_on_null_input;
    }

    public Integer getExecute_as_principal_id() {
        return execute_as_principal_id;
    }

    public void setExecute_as_principal_id(Integer execute_as_principal_id) {
        this.execute_as_principal_id = execute_as_principal_id;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition == null ? null : definition.trim();
    }
}