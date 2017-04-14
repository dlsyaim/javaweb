package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SpatialIndexes;

public interface SpatialIndexesMapper {
    int insert(SpatialIndexes record);

    int insertSelective(SpatialIndexes record);
}