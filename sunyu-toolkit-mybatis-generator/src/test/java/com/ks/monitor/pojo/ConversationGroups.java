package com.ks.monitor.pojo;

public class ConversationGroups {
    private String conversation_group_id;

    private Integer service_id;

    private Boolean is_system;

    public String getConversation_group_id() {
        return conversation_group_id;
    }

    public void setConversation_group_id(String conversation_group_id) {
        this.conversation_group_id = conversation_group_id == null ? null : conversation_group_id.trim();
    }

    public Integer getService_id() {
        return service_id;
    }

    public void setService_id(Integer service_id) {
        this.service_id = service_id;
    }

    public Boolean getIs_system() {
        return is_system;
    }

    public void setIs_system(Boolean is_system) {
        this.is_system = is_system;
    }
}