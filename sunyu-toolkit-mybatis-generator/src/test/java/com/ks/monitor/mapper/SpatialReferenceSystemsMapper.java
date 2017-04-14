package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SpatialReferenceSystems;

public interface SpatialReferenceSystemsMapper {
    int insert(SpatialReferenceSystems record);

    int insertSelective(SpatialReferenceSystems record);
}