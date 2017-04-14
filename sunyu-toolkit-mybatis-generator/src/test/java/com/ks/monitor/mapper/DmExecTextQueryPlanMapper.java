package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmExecTextQueryPlan;

public interface DmExecTextQueryPlanMapper {
    int insert(DmExecTextQueryPlan record);

    int insertSelective(DmExecTextQueryPlan record);
}