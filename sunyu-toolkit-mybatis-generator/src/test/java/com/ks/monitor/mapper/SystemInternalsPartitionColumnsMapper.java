package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SystemInternalsPartitionColumns;

public interface SystemInternalsPartitionColumnsMapper {
    int insert(SystemInternalsPartitionColumns record);

    int insertSelective(SystemInternalsPartitionColumns record);
}