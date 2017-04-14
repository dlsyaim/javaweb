package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsWaitStats;

public interface DmOsWaitStatsMapper {
    int insert(DmOsWaitStats record);

    int insertSelective(DmOsWaitStats record);
}