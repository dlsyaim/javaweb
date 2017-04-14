package com.ks.monitor.pojo;

public class FulltextSystemStopwords {
    private String stopword;

    private Integer language_id;

    public String getStopword() {
        return stopword;
    }

    public void setStopword(String stopword) {
        this.stopword = stopword == null ? null : stopword.trim();
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }
}