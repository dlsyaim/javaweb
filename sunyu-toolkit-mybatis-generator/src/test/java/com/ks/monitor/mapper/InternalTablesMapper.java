package com.ks.monitor.mapper;

import com.ks.monitor.pojo.InternalTables;

public interface InternalTablesMapper {
    int insert(InternalTables record);

    int insertSelective(InternalTables record);
}