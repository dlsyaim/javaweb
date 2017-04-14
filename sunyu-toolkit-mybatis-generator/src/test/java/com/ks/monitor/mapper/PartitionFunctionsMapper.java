package com.ks.monitor.mapper;

import com.ks.monitor.pojo.PartitionFunctions;

public interface PartitionFunctionsMapper {
    int insert(PartitionFunctions record);

    int insertSelective(PartitionFunctions record);
}