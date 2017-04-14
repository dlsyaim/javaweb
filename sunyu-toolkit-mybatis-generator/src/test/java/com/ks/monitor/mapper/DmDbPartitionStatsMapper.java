package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmDbPartitionStats;

public interface DmDbPartitionStatsMapper {
    int insert(DmDbPartitionStats record);

    int insertSelective(DmDbPartitionStats record);
}