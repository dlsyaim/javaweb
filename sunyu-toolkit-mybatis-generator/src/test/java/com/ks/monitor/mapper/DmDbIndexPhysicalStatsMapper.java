package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmDbIndexPhysicalStats;

public interface DmDbIndexPhysicalStatsMapper {
    int insert(DmDbIndexPhysicalStats record);

    int insertSelective(DmDbIndexPhysicalStats record);
}