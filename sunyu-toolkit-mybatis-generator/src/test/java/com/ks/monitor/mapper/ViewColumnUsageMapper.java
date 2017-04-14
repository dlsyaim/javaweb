package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ViewColumnUsage;

public interface ViewColumnUsageMapper {
    int insert(ViewColumnUsage record);

    int insertSelective(ViewColumnUsage record);
}