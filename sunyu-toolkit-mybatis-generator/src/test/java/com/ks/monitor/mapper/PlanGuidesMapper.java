package com.ks.monitor.mapper;

import com.ks.monitor.pojo.PlanGuidesWithBLOBs;

public interface PlanGuidesMapper {
    int insert(PlanGuidesWithBLOBs record);

    int insertSelective(PlanGuidesWithBLOBs record);
}