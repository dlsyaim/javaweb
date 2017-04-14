package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmDbIndexUsageStats;

public interface DmDbIndexUsageStatsMapper {
    int insert(DmDbIndexUsageStats record);

    int insertSelective(DmDbIndexUsageStats record);
}