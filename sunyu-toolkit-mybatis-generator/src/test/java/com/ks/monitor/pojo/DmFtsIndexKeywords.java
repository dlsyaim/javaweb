package com.ks.monitor.pojo;

public class DmFtsIndexKeywords {
    private String display_term;

    private Integer column_id;

    private Long document_count;

    private byte[] keyword;

    public String getDisplay_term() {
        return display_term;
    }

    public void setDisplay_term(String display_term) {
        this.display_term = display_term == null ? null : display_term.trim();
    }

    public Integer getColumn_id() {
        return column_id;
    }

    public void setColumn_id(Integer column_id) {
        this.column_id = column_id;
    }

    public Long getDocument_count() {
        return document_count;
    }

    public void setDocument_count(Long document_count) {
        this.document_count = document_count;
    }

    public byte[] getKeyword() {
        return keyword;
    }

    public void setKeyword(byte[] keyword) {
        this.keyword = keyword;
    }
}