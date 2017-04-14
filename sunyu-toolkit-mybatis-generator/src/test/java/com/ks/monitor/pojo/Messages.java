package com.ks.monitor.pojo;

public class Messages {
    private Integer message_id;

    private Short language_id;

    private Byte severity;

    private Boolean is_event_logged;

    private String text;

    public Integer getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Integer message_id) {
        this.message_id = message_id;
    }

    public Short getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Short language_id) {
        this.language_id = language_id;
    }

    public Byte getSeverity() {
        return severity;
    }

    public void setSeverity(Byte severity) {
        this.severity = severity;
    }

    public Boolean getIs_event_logged() {
        return is_event_logged;
    }

    public void setIs_event_logged(Boolean is_event_logged) {
        this.is_event_logged = is_event_logged;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}