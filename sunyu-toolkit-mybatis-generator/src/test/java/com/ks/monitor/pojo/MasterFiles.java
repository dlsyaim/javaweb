package com.ks.monitor.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class MasterFiles {
    private Integer database_id;

    private Integer file_id;

    private String file_guid;

    private Byte type;

    private String type_desc;

    private Integer data_space_id;

    private String name;

    private String physical_name;

    private Byte state;

    private String state_desc;

    private Integer size;

    private Integer max_size;

    private Integer growth;

    private Boolean is_media_read_only;

    private Boolean is_read_only;

    private Boolean is_sparse;

    private Boolean is_percent_growth;

    private Boolean is_name_reserved;

    private BigDecimal create_lsn;

    private BigDecimal drop_lsn;

    private BigDecimal read_only_lsn;

    private BigDecimal read_write_lsn;

    private BigDecimal differential_base_lsn;

    private String differential_base_guid;

    private Date differential_base_time;

    private BigDecimal redo_start_lsn;

    private String redo_start_fork_guid;

    private BigDecimal redo_target_lsn;

    private String redo_target_fork_guid;

    private BigDecimal backup_lsn;

    public Integer getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Integer database_id) {
        this.database_id = database_id;
    }

    public Integer getFile_id() {
        return file_id;
    }

    public void setFile_id(Integer file_id) {
        this.file_id = file_id;
    }

    public String getFile_guid() {
        return file_guid;
    }

    public void setFile_guid(String file_guid) {
        this.file_guid = file_guid == null ? null : file_guid.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getType_desc() {
        return type_desc;
    }

    public void setType_desc(String type_desc) {
        this.type_desc = type_desc == null ? null : type_desc.trim();
    }

    public Integer getData_space_id() {
        return data_space_id;
    }

    public void setData_space_id(Integer data_space_id) {
        this.data_space_id = data_space_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhysical_name() {
        return physical_name;
    }

    public void setPhysical_name(String physical_name) {
        this.physical_name = physical_name == null ? null : physical_name.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getState_desc() {
        return state_desc;
    }

    public void setState_desc(String state_desc) {
        this.state_desc = state_desc == null ? null : state_desc.trim();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getMax_size() {
        return max_size;
    }

    public void setMax_size(Integer max_size) {
        this.max_size = max_size;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Boolean getIs_media_read_only() {
        return is_media_read_only;
    }

    public void setIs_media_read_only(Boolean is_media_read_only) {
        this.is_media_read_only = is_media_read_only;
    }

    public Boolean getIs_read_only() {
        return is_read_only;
    }

    public void setIs_read_only(Boolean is_read_only) {
        this.is_read_only = is_read_only;
    }

    public Boolean getIs_sparse() {
        return is_sparse;
    }

    public void setIs_sparse(Boolean is_sparse) {
        this.is_sparse = is_sparse;
    }

    public Boolean getIs_percent_growth() {
        return is_percent_growth;
    }

    public void setIs_percent_growth(Boolean is_percent_growth) {
        this.is_percent_growth = is_percent_growth;
    }

    public Boolean getIs_name_reserved() {
        return is_name_reserved;
    }

    public void setIs_name_reserved(Boolean is_name_reserved) {
        this.is_name_reserved = is_name_reserved;
    }

    public BigDecimal getCreate_lsn() {
        return create_lsn;
    }

    public void setCreate_lsn(BigDecimal create_lsn) {
        this.create_lsn = create_lsn;
    }

    public BigDecimal getDrop_lsn() {
        return drop_lsn;
    }

    public void setDrop_lsn(BigDecimal drop_lsn) {
        this.drop_lsn = drop_lsn;
    }

    public BigDecimal getRead_only_lsn() {
        return read_only_lsn;
    }

    public void setRead_only_lsn(BigDecimal read_only_lsn) {
        this.read_only_lsn = read_only_lsn;
    }

    public BigDecimal getRead_write_lsn() {
        return read_write_lsn;
    }

    public void setRead_write_lsn(BigDecimal read_write_lsn) {
        this.read_write_lsn = read_write_lsn;
    }

    public BigDecimal getDifferential_base_lsn() {
        return differential_base_lsn;
    }

    public void setDifferential_base_lsn(BigDecimal differential_base_lsn) {
        this.differential_base_lsn = differential_base_lsn;
    }

    public String getDifferential_base_guid() {
        return differential_base_guid;
    }

    public void setDifferential_base_guid(String differential_base_guid) {
        this.differential_base_guid = differential_base_guid == null ? null : differential_base_guid.trim();
    }

    public Date getDifferential_base_time() {
        return differential_base_time;
    }

    public void setDifferential_base_time(Date differential_base_time) {
        this.differential_base_time = differential_base_time;
    }

    public BigDecimal getRedo_start_lsn() {
        return redo_start_lsn;
    }

    public void setRedo_start_lsn(BigDecimal redo_start_lsn) {
        this.redo_start_lsn = redo_start_lsn;
    }

    public String getRedo_start_fork_guid() {
        return redo_start_fork_guid;
    }

    public void setRedo_start_fork_guid(String redo_start_fork_guid) {
        this.redo_start_fork_guid = redo_start_fork_guid == null ? null : redo_start_fork_guid.trim();
    }

    public BigDecimal getRedo_target_lsn() {
        return redo_target_lsn;
    }

    public void setRedo_target_lsn(BigDecimal redo_target_lsn) {
        this.redo_target_lsn = redo_target_lsn;
    }

    public String getRedo_target_fork_guid() {
        return redo_target_fork_guid;
    }

    public void setRedo_target_fork_guid(String redo_target_fork_guid) {
        this.redo_target_fork_guid = redo_target_fork_guid == null ? null : redo_target_fork_guid.trim();
    }

    public BigDecimal getBackup_lsn() {
        return backup_lsn;
    }

    public void setBackup_lsn(BigDecimal backup_lsn) {
        this.backup_lsn = backup_lsn;
    }
}