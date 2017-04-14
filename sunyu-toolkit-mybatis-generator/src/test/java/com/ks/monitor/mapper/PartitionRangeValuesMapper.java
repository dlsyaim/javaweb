package com.ks.monitor.mapper;

import com.ks.monitor.pojo.PartitionRangeValues;

public interface PartitionRangeValuesMapper {
    int insert(PartitionRangeValues record);

    int insertSelective(PartitionRangeValues record);
}