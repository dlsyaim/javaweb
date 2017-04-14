package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KeyColumnUsage;

public interface KeyColumnUsageMapper {
    int insert(KeyColumnUsage record);

    int insertSelective(KeyColumnUsage record);
}