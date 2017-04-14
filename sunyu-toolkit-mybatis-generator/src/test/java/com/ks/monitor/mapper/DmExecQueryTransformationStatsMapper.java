package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmExecQueryTransformationStats;

public interface DmExecQueryTransformationStatsMapper {
    int insert(DmExecQueryTransformationStats record);

    int insertSelective(DmExecQueryTransformationStats record);
}