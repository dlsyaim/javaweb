package com.ks.monitor.pojo;

public class SystemInternalsPartitionColumns {
    private Long partition_id;

    private Integer partition_column_id;

    private Long modified_count;

    private Short max_inrow_length;

    private Boolean is_replicated;

    private Boolean is_logged_for_replication;

    private Boolean is_dropped;

    private Byte system_type_id;

    private Short max_length;

    private Byte precision;

    private Byte scale;

    private String collation_name;

    private Boolean is_filestream;

    private Short key_ordinal;

    private Boolean is_nullable;

    private Boolean is_descending_key;

    private Boolean is_uniqueifier;

    private Short leaf_offset;

    private Short internal_offset;

    private Byte leaf_bit_position;

    private Byte internal_bit_position;

    private Short leaf_null_bit;

    private Short internal_null_bit;

    private Boolean is_anti_matter;

    private String partition_column_guid;

    private Boolean is_sparse;

    public Long getPartition_id() {
        return partition_id;
    }

    public void setPartition_id(Long partition_id) {
        this.partition_id = partition_id;
    }

    public Integer getPartition_column_id() {
        return partition_column_id;
    }

    public void setPartition_column_id(Integer partition_column_id) {
        this.partition_column_id = partition_column_id;
    }

    public Long getModified_count() {
        return modified_count;
    }

    public void setModified_count(Long modified_count) {
        this.modified_count = modified_count;
    }

    public Short getMax_inrow_length() {
        return max_inrow_length;
    }

    public void setMax_inrow_length(Short max_inrow_length) {
        this.max_inrow_length = max_inrow_length;
    }

    public Boolean getIs_replicated() {
        return is_replicated;
    }

    public void setIs_replicated(Boolean is_replicated) {
        this.is_replicated = is_replicated;
    }

    public Boolean getIs_logged_for_replication() {
        return is_logged_for_replication;
    }

    public void setIs_logged_for_replication(Boolean is_logged_for_replication) {
        this.is_logged_for_replication = is_logged_for_replication;
    }

    public Boolean getIs_dropped() {
        return is_dropped;
    }

    public void setIs_dropped(Boolean is_dropped) {
        this.is_dropped = is_dropped;
    }

    public Byte getSystem_type_id() {
        return system_type_id;
    }

    public void setSystem_type_id(Byte system_type_id) {
        this.system_type_id = system_type_id;
    }

    public Short getMax_length() {
        return max_length;
    }

    public void setMax_length(Short max_length) {
        this.max_length = max_length;
    }

    public Byte getPrecision() {
        return precision;
    }

    public void setPrecision(Byte precision) {
        this.precision = precision;
    }

    public Byte getScale() {
        return scale;
    }

    public void setScale(Byte scale) {
        this.scale = scale;
    }

    public String getCollation_name() {
        return collation_name;
    }

    public void setCollation_name(String collation_name) {
        this.collation_name = collation_name == null ? null : collation_name.trim();
    }

    public Boolean getIs_filestream() {
        return is_filestream;
    }

    public void setIs_filestream(Boolean is_filestream) {
        this.is_filestream = is_filestream;
    }

    public Short getKey_ordinal() {
        return key_ordinal;
    }

    public void setKey_ordinal(Short key_ordinal) {
        this.key_ordinal = key_ordinal;
    }

    public Boolean getIs_nullable() {
        return is_nullable;
    }

    public void setIs_nullable(Boolean is_nullable) {
        this.is_nullable = is_nullable;
    }

    public Boolean getIs_descending_key() {
        return is_descending_key;
    }

    public void setIs_descending_key(Boolean is_descending_key) {
        this.is_descending_key = is_descending_key;
    }

    public Boolean getIs_uniqueifier() {
        return is_uniqueifier;
    }

    public void setIs_uniqueifier(Boolean is_uniqueifier) {
        this.is_uniqueifier = is_uniqueifier;
    }

    public Short getLeaf_offset() {
        return leaf_offset;
    }

    public void setLeaf_offset(Short leaf_offset) {
        this.leaf_offset = leaf_offset;
    }

    public Short getInternal_offset() {
        return internal_offset;
    }

    public void setInternal_offset(Short internal_offset) {
        this.internal_offset = internal_offset;
    }

    public Byte getLeaf_bit_position() {
        return leaf_bit_position;
    }

    public void setLeaf_bit_position(Byte leaf_bit_position) {
        this.leaf_bit_position = leaf_bit_position;
    }

    public Byte getInternal_bit_position() {
        return internal_bit_position;
    }

    public void setInternal_bit_position(Byte internal_bit_position) {
        this.internal_bit_position = internal_bit_position;
    }

    public Short getLeaf_null_bit() {
        return leaf_null_bit;
    }

    public void setLeaf_null_bit(Short leaf_null_bit) {
        this.leaf_null_bit = leaf_null_bit;
    }

    public Short getInternal_null_bit() {
        return internal_null_bit;
    }

    public void setInternal_null_bit(Short internal_null_bit) {
        this.internal_null_bit = internal_null_bit;
    }

    public Boolean getIs_anti_matter() {
        return is_anti_matter;
    }

    public void setIs_anti_matter(Boolean is_anti_matter) {
        this.is_anti_matter = is_anti_matter;
    }

    public String getPartition_column_guid() {
        return partition_column_guid;
    }

    public void setPartition_column_guid(String partition_column_guid) {
        this.partition_column_guid = partition_column_guid == null ? null : partition_column_guid.trim();
    }

    public Boolean getIs_sparse() {
        return is_sparse;
    }

    public void setIs_sparse(Boolean is_sparse) {
        this.is_sparse = is_sparse;
    }
}