package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SpatialIndexTessellations;

public interface SpatialIndexTessellationsMapper {
    int insert(SpatialIndexTessellations record);

    int insertSelective(SpatialIndexTessellations record);
}