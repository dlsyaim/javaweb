package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ConstraintTableUsage;

public interface ConstraintTableUsageMapper {
    int insert(ConstraintTableUsage record);

    int insertSelective(ConstraintTableUsage record);
}