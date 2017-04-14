package com.ks.monitor.pojo;

public class DmFtsIndexKeywordsByDocument {
    private String display_term;

    private Integer column_id;

    private Long document_id;

    private Integer occurrence_count;

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

    public Long getDocument_id() {
        return document_id;
    }

    public void setDocument_id(Long document_id) {
        this.document_id = document_id;
    }

    public Integer getOccurrence_count() {
        return occurrence_count;
    }

    public void setOccurrence_count(Integer occurrence_count) {
        this.occurrence_count = occurrence_count;
    }

    public byte[] getKeyword() {
        return keyword;
    }

    public void setKeyword(byte[] keyword) {
        this.keyword = keyword;
    }
}