package com.ks.monitor.mapper;

import com.ks.monitor.pojo.AllSqlModules;

public interface AllSqlModulesMapper {
    int insert(AllSqlModules record);

    int insertSelective(AllSqlModules record);
}