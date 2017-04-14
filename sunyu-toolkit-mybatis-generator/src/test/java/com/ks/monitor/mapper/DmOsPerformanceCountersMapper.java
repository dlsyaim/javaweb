package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsPerformanceCounters;

public interface DmOsPerformanceCountersMapper {
    int insert(DmOsPerformanceCounters record);

    int insertSelective(DmOsPerformanceCounters record);
}