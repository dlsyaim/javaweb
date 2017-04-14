package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmExecProcedureStatsWithBLOBs;

public interface DmExecProcedureStatsMapper {
    int insert(DmExecProcedureStatsWithBLOBs record);

    int insertSelective(DmExecProcedureStatsWithBLOBs record);
}