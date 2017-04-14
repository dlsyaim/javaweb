package com.ks.monitor.pojo;

public class ServerSqlModules {
    private Integer object_id;

    private Boolean uses_ansi_nulls;

    private Boolean uses_quoted_identifier;

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