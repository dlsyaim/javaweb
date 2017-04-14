package com.ks.monitor.pojo;

public class ServerEventSessions {
    private Integer event_session_id;

    private String name;

    private String event_retention_mode;

    private String event_retention_mode_desc;

    private Integer max_dispatch_latency;

    private Integer max_memory;

    private Integer max_event_size;

    private String memory_partition_mode;

    private String memory_partition_mode_desc;

    private Boolean track_causality;

    private Boolean startup_state;

    public Integer getEvent_session_id() {
        return event_session_id;
    }

    public void setEvent_session_id(Integer event_session_id) {
        this.event_session_id = event_session_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEvent_retention_mode() {
        return event_retention_mode;
    }

    public void setEvent_retention_mode(String event_retention_mode) {
        this.event_retention_mode = event_retention_mode == null ? null : event_retention_mode.trim();
    }

    public String getEvent_retention_mode_desc() {
        return event_retention_mode_desc;
    }

    public void setEvent_retention_mode_desc(String event_retention_mode_desc) {
        this.event_retention_mode_desc = event_retention_mode_desc == null ? null : event_retention_mode_desc.trim();
    }

    public Integer getMax_dispatch_latency() {
        return max_dispatch_latency;
    }

    public void setMax_dispatch_latency(Integer max_dispatch_latency) {
        this.max_dispatch_latency = max_dispatch_latency;
    }

    public Integer getMax_memory() {
        return max_memory;
    }

    public void setMax_memory(Integer max_memory) {
        this.max_memory = max_memory;
    }

    public Integer getMax_event_size() {
        return max_event_size;
    }

    public void setMax_event_size(Integer max_event_size) {
        this.max_event_size = max_event_size;
    }

    public String getMemory_partition_mode() {
        return memory_partition_mode;
    }

    public void setMemory_partition_mode(String memory_partition_mode) {
        this.memory_partition_mode = memory_partition_mode == null ? null : memory_partition_mode.trim();
    }

    public String getMemory_partition_mode_desc() {
        return memory_partition_mode_desc;
    }

    public void setMemory_partition_mode_desc(String memory_partition_mode_desc) {
        this.memory_partition_mode_desc = memory_partition_mode_desc == null ? null : memory_partition_mode_desc.trim();
    }

    public Boolean getTrack_causality() {
        return track_causality;
    }

    public void setTrack_causality(Boolean track_causality) {
        this.track_causality = track_causality;
    }

    public Boolean getStartup_state() {
        return startup_state;
    }

    public void setStartup_state(Boolean startup_state) {
        this.startup_state = startup_state;
    }
}