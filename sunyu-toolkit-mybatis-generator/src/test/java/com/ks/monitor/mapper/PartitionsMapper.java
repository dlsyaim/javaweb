package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Partitions;

public interface PartitionsMapper {
    int insert(Partitions record);

    int insertSelective(Partitions record);
}