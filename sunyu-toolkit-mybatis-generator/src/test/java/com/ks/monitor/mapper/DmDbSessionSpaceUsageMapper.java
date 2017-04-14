package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmDbSessionSpaceUsage;

public interface DmDbSessionSpaceUsageMapper {
    int insert(DmDbSessionSpaceUsage record);

    int insertSelective(DmDbSessionSpaceUsage record);
}