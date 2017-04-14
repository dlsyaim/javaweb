package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Schemata;

public interface SchemataMapper {
    int insert(Schemata record);

    int insertSelective(Schemata record);
}