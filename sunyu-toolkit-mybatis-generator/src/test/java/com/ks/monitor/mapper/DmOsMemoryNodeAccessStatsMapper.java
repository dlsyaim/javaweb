package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsMemoryNodeAccessStats;

public interface DmOsMemoryNodeAccessStatsMapper {
    int insert(DmOsMemoryNodeAccessStats record);

    int insertSelective(DmOsMemoryNodeAccessStats record);
}