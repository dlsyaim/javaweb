package com.ks.monitor.pojo;

public class Syscursorrefs {
    private String reference_name;

    private Byte cursor_scope;

    private Integer cursor_handl;

    public String getReference_name() {
        return reference_name;
    }

    public void setReference_name(String reference_name) {
        this.reference_name = reference_name == null ? null : reference_name.trim();
    }

    public Byte getCursor_scope() {
        return cursor_scope;
    }

    public void setCursor_scope(Byte cursor_scope) {
        this.cursor_scope = cursor_scope;
    }

    public Integer getCursor_handl() {
        return cursor_handl;
    }

    public void setCursor_handl(Integer cursor_handl) {
        this.cursor_handl = cursor_handl;
    }
}