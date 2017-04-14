package com.ks.monitor.pojo;

public class FulltextStopwords {
    private Integer stoplist_id;

    private String stopword;

    private String language;

    private Integer language_id;

    public Integer getStoplist_id() {
        return stoplist_id;
    }

    public void setStoplist_id(Integer stoplist_id) {
        this.stoplist_id = stoplist_id;
    }

    public String getStopword() {
        return stopword;
    }

    public void setStopword(String stopword) {
        this.stopword = stopword == null ? null : stopword.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }
}