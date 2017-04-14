package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SystemInternalsPartitions;

public interface SystemInternalsPartitionsMapper {
    int insert(SystemInternalsPartitions record);

    int insertSelective(SystemInternalsPartitions record);
}