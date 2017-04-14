package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ChangeTrackingDatabases;

public interface ChangeTrackingDatabasesMapper {
    int insert(ChangeTrackingDatabases record);

    int insertSelective(ChangeTrackingDatabases record);
}