package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmExecTriggerStatsWithBLOBs;

public interface DmExecTriggerStatsMapper {
    int insert(DmExecTriggerStatsWithBLOBs record);

    int insertSelective(DmExecTriggerStatsWithBLOBs record);
}