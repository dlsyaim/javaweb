package com.ks.monitor.pojo;

public class DmFtsParser {
    private Integer group_id;

    private Integer phrase_id;

    private Integer occurrence;

    private String special_term;

    private String display_term;

    private Integer expansion_type;

    private String source_term;

    private byte[] keyword;

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    public Integer getPhrase_id() {
        return phrase_id;
    }

    public void setPhrase_id(Integer phrase_id) {
        this.phrase_id = phrase_id;
    }

    public Integer getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(Integer occurrence) {
        this.occurrence = occurrence;
    }

    public String getSpecial_term() {
        return special_term;
    }

    public void setSpecial_term(String special_term) {
        this.special_term = special_term == null ? null : special_term.trim();
    }

    public String getDisplay_term() {
        return display_term;
    }

    public void setDisplay_term(String display_term) {
        this.display_term = display_term == null ? null : display_term.trim();
    }

    public Integer getExpansion_type() {
        return expansion_type;
    }

    public void setExpansion_type(Integer expansion_type) {
        this.expansion_type = expansion_type;
    }

    public String getSource_term() {
        return source_term;
    }

    public void setSource_term(String source_term) {
        this.source_term = source_term == null ? null : source_term.trim();
    }

    public byte[] getKeyword() {
        return keyword;
    }

    public void setKeyword(byte[] keyword) {
        this.keyword = keyword;
    }
}