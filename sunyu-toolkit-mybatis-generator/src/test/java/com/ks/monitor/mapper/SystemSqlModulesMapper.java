package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SystemSqlModules;

public interface SystemSqlModulesMapper {
    int insert(SystemSqlModules record);

    int insertSelective(SystemSqlModules record);
}