package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DatabasePermissions;

public interface DatabasePermissionsMapper {
    int insert(DatabasePermissions record);

    int insertSelective(DatabasePermissions record);
}