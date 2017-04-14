package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmExecQueryPlan;

public interface DmExecQueryPlanMapper {
    int insert(DmExecQueryPlan record);

    int insertSelective(DmExecQueryPlan record);
}