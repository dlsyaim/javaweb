package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmDbFileSpaceUsage;

public interface DmDbFileSpaceUsageMapper {
    int insert(DmDbFileSpaceUsage record);

    int insertSelective(DmDbFileSpaceUsage record);
}