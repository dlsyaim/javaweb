package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SqlModules;

public interface SqlModulesMapper {
    int insert(SqlModules record);

    int insertSelective(SqlModules record);
}