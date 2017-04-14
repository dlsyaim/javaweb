package com.ks.monitor.mapper;

import com.ks.monitor.pojo.StatsColumns;

public interface StatsColumnsMapper {
    int insert(StatsColumns record);

    int insertSelective(StatsColumns record);
}