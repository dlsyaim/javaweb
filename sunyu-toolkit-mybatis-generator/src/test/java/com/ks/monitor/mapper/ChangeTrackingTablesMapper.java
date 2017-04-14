package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ChangeTrackingTables;

public interface ChangeTrackingTablesMapper {
    int insert(ChangeTrackingTables record);

    int insertSelective(ChangeTrackingTables record);
}