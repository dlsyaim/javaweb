package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsLatchStats;

public interface DmOsLatchStatsMapper {
    int insert(DmOsLatchStats record);

    int insertSelective(DmOsLatchStats record);
}