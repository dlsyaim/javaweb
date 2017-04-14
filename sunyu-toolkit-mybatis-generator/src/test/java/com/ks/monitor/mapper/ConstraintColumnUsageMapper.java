package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ConstraintColumnUsage;

public interface ConstraintColumnUsageMapper {
    int insert(ConstraintColumnUsage record);

    int insertSelective(ConstraintColumnUsage record);
}