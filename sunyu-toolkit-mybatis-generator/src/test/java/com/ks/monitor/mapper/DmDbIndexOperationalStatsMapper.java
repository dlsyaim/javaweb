package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmDbIndexOperationalStats;

public interface DmDbIndexOperationalStatsMapper {
    int insert(DmDbIndexOperationalStats record);

    int insertSelective(DmDbIndexOperationalStats record);
}