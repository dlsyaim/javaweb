package com.ks.monitor.pojo;

import java.util.Date;

public class FulltextIndexes {
    private Integer object_id;

    private Integer unique_index_id;

    private Integer fulltext_catalog_id;

    private Boolean is_enabled;

    private String change_tracking_state;

    private String change_tracking_state_desc;

    private Boolean has_crawl_completed;

    private String crawl_type;

    private String crawl_type_desc;

    private Date crawl_start_date;

    private Date crawl_end_date;

    private Integer stoplist_id;

    private Integer data_space_id;

    private byte[] incremental_timestamp;

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public Integer getUnique_index_id() {
        return unique_index_id;
    }

    public void setUnique_index_id(Integer unique_index_id) {
        this.unique_index_id = unique_index_id;
    }

    public Integer getFulltext_catalog_id() {
        return fulltext_catalog_id;
    }

    public void setFulltext_catalog_id(Integer fulltext_catalog_id) {
        this.fulltext_catalog_id = fulltext_catalog_id;
    }

    public Boolean getIs_enabled() {
        return is_enabled;
    }

    public void setIs_enabled(Boolean is_enabled) {
        this.is_enabled = is_enabled;
    }

    public String getChange_tracking_state() {
        return change_tracking_state;
    }

    public void setChange_tracking_state(String change_tracking_state) {
        this.change_tracking_state = change_tracking_state == null ? null : change_tracking_state.trim();
    }

    public String getChange_tracking_state_desc() {
        return change_tracking_state_desc;
    }

    public void setChange_tracking_state_desc(String change_tracking_state_desc) {
        this.change_tracking_state_desc = change_tracking_state_desc == null ? null : change_tracking_state_desc.trim();
    }

    public Boolean getHas_crawl_completed() {
        return has_crawl_completed;
    }

    public void setHas_crawl_completed(Boolean has_crawl_completed) {
        this.has_crawl_completed = has_crawl_completed;
    }

    public String getCrawl_type() {
        return crawl_type;
    }

    public void setCrawl_type(String crawl_type) {
        this.crawl_type = crawl_type == null ? null : crawl_type.trim();
    }

    public String getCrawl_type_desc() {
        return crawl_type_desc;
    }

    public void setCrawl_type_desc(String crawl_type_desc) {
        this.crawl_type_desc = crawl_type_desc == null ? null : crawl_type_desc.trim();
    }

    public Date getCrawl_start_date() {
        return crawl_start_date;
    }

    public void setCrawl_start_date(Date crawl_start_date) {
        this.crawl_start_date = crawl_start_date;
    }

    public Date getCrawl_end_date() {
        return crawl_end_date;
    }

    public void setCrawl_end_date(Date crawl_end_date) {
        this.crawl_end_date = crawl_end_date;
    }

    public Integer getStoplist_id() {
        return stoplist_id;
    }

    public void setStoplist_id(Integer stoplist_id) {
        this.stoplist_id = stoplist_id;
    }

    public Integer getData_space_id() {
        return data_space_id;
    }

    public void setData_space_id(Integer data_space_id) {
        this.data_space_id = data_space_id;
    }

    public byte[] getIncremental_timestamp() {
        return incremental_timestamp;
    }

    public void setIncremental_timestamp(byte[] incremental_timestamp) {
        this.incremental_timestamp = incremental_timestamp;
    }
}