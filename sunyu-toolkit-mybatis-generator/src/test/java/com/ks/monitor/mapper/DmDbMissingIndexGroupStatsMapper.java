package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmDbMissingIndexGroupStats;

public interface DmDbMissingIndexGroupStatsMapper {
    int insert(DmDbMissingIndexGroupStats record);

    int insertSelective(DmDbMissingIndexGroupStats record);
}