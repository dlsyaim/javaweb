package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmDbTaskSpaceUsage;

public interface DmDbTaskSpaceUsageMapper {
    int insert(DmDbTaskSpaceUsage record);

    int insertSelective(DmDbTaskSpaceUsage record);
}