package com.ks.monitor.mapper;

import com.ks.monitor.pojo.PartitionSchemes;

public interface PartitionSchemesMapper {
    int insert(PartitionSchemes record);

    int insertSelective(PartitionSchemes record);
}