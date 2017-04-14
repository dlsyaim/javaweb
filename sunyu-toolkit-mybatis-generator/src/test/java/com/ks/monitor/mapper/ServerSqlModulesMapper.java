package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerSqlModules;

public interface ServerSqlModulesMapper {
    int insert(ServerSqlModules record);

    int insertSelective(ServerSqlModules record);
}