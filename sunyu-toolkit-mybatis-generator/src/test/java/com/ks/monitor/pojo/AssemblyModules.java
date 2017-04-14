package com.ks.monitor.pojo;

public class AssemblyModules {
    private Integer object_id;

    private Integer assembly_id;

    private String assembly_class;

    private String assembly_method;

    private Boolean null_on_null_input;

    private Integer execute_as_principal_id;

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public Integer getAssembly_id() {
        return assembly_id;
    }

    public void setAssembly_id(Integer assembly_id) {
        this.assembly_id = assembly_id;
    }

    public String getAssembly_class() {
        return assembly_class;
    }

    public void setAssembly_class(String assembly_class) {
        this.assembly_class = assembly_class == null ? null : assembly_class.trim();
    }

    public String getAssembly_method() {
        return assembly_method;
    }

    public void setAssembly_method(String assembly_method) {
        this.assembly_method = assembly_method == null ? null : assembly_method.trim();
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
}