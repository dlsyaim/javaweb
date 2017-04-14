package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmExecQueryStatsWithBLOBs;

public interface DmExecQueryStatsMapper {
    int insert(DmExecQueryStatsWithBLOBs record);

    int insertSelective(DmExecQueryStatsWithBLOBs record);
}