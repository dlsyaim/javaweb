package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerPermissions;

public interface ServerPermissionsMapper {
    int insert(ServerPermissions record);

    int insertSelective(ServerPermissions record);
}