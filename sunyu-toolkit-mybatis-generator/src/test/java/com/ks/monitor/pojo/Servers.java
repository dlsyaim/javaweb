package com.ks.monitor.pojo;

import java.util.Date;

public class Servers {
    private Integer server_id;

    private String name;

    private String product;

    private String provider;

    private String data_source;

    private String location;

    private String provider_string;

    private String catalog;

    private Integer connect_timeout;

    private Integer query_timeout;

    private Boolean is_linked;

    private Boolean is_remote_login_enabled;

    private Boolean is_rpc_out_enabled;

    private Boolean is_data_access_enabled;

    private Boolean is_collation_compatible;

    private Boolean uses_remote_collation;

    private String collation_name;

    private Boolean lazy_schema_validation;

    private Boolean is_system;

    private Boolean is_publisher;

    private Boolean is_subscriber;

    private Boolean is_distributor;

    private Boolean is_nonsql_subscriber;

    private Boolean is_remote_proc_transaction_promotion_enabled;

    private Date modify_date;

    public Integer getServer_id() {
        return server_id;
    }

    public void setServer_id(Integer server_id) {
        this.server_id = server_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    public String getData_source() {
        return data_source;
    }

    public void setData_source(String data_source) {
        this.data_source = data_source == null ? null : data_source.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getProvider_string() {
        return provider_string;
    }

    public void setProvider_string(String provider_string) {
        this.provider_string = provider_string == null ? null : provider_string.trim();
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog == null ? null : catalog.trim();
    }

    public Integer getConnect_timeout() {
        return connect_timeout;
    }

    public void setConnect_timeout(Integer connect_timeout) {
        this.connect_timeout = connect_timeout;
    }

    public Integer getQuery_timeout() {
        return query_timeout;
    }

    public void setQuery_timeout(Integer query_timeout) {
        this.query_timeout = query_timeout;
    }

    public Boolean getIs_linked() {
        return is_linked;
    }

    public void setIs_linked(Boolean is_linked) {
        this.is_linked = is_linked;
    }

    public Boolean getIs_remote_login_enabled() {
        return is_remote_login_enabled;
    }

    public void setIs_remote_login_enabled(Boolean is_remote_login_enabled) {
        this.is_remote_login_enabled = is_remote_login_enabled;
    }

    public Boolean getIs_rpc_out_enabled() {
        return is_rpc_out_enabled;
    }

    public void setIs_rpc_out_enabled(Boolean is_rpc_out_enabled) {
        this.is_rpc_out_enabled = is_rpc_out_enabled;
    }

    public Boolean getIs_data_access_enabled() {
        return is_data_access_enabled;
    }

    public void setIs_data_access_enabled(Boolean is_data_access_enabled) {
        this.is_data_access_enabled = is_data_access_enabled;
    }

    public Boolean getIs_collation_compatible() {
        return is_collation_compatible;
    }

    public void setIs_collation_compatible(Boolean is_collation_compatible) {
        this.is_collation_compatible = is_collation_compatible;
    }

    public Boolean getUses_remote_collation() {
        return uses_remote_collation;
    }

    public void setUses_remote_collation(Boolean uses_remote_collation) {
        this.uses_remote_collation = uses_remote_collation;
    }

    public String getCollation_name() {
        return collation_name;
    }

    public void setCollation_name(String collation_name) {
        this.collation_name = collation_name == null ? null : collation_name.trim();
    }

    public Boolean getLazy_schema_validation() {
        return lazy_schema_validation;
    }

    public void setLazy_schema_validation(Boolean lazy_schema_validation) {
        this.lazy_schema_validation = lazy_schema_validation;
    }

    public Boolean getIs_system() {
        return is_system;
    }

    public void setIs_system(Boolean is_system) {
        this.is_system = is_system;
    }

    public Boolean getIs_publisher() {
        return is_publisher;
    }

    public void setIs_publisher(Boolean is_publisher) {
        this.is_publisher = is_publisher;
    }

    public Boolean getIs_subscriber() {
        return is_subscriber;
    }

    public void setIs_subscriber(Boolean is_subscriber) {
        this.is_subscriber = is_subscriber;
    }

    public Boolean getIs_distributor() {
        return is_distributor;
    }

    public void setIs_distributor(Boolean is_distributor) {
        this.is_distributor = is_distributor;
    }

    public Boolean getIs_nonsql_subscriber() {
        return is_nonsql_subscriber;
    }

    public void setIs_nonsql_subscriber(Boolean is_nonsql_subscriber) {
        this.is_nonsql_subscriber = is_nonsql_subscriber;
    }

    public Boolean getIs_remote_proc_transaction_promotion_enabled() {
        return is_remote_proc_transaction_promotion_enabled;
    }

    public void setIs_remote_proc_transaction_promotion_enabled(Boolean is_remote_proc_transaction_promotion_enabled) {
        this.is_remote_proc_transaction_promotion_enabled = is_remote_proc_transaction_promotion_enabled;
    }

    public Date getModify_date() {
        return modify_date;
    }

    public void setModify_date(Date modify_date) {
        this.modify_date = modify_date;
    }
}