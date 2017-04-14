package com.ks.monitor.mapper;

import com.ks.monitor.pojo.PartitionParameters;

public interface PartitionParametersMapper {
    int insert(PartitionParameters record);

    int insertSelective(PartitionParameters record);
}