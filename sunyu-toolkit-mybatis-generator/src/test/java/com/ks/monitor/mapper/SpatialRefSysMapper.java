package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SpatialRefSys;

public interface SpatialRefSysMapper {
    int deleteByPrimaryKey(Integer srid);

    int insert(SpatialRefSys record);

    int insertSelective(SpatialRefSys record);

    SpatialRefSys selectByPrimaryKey(Integer srid);

    int updateByPrimaryKeySelective(SpatialRefSys record);

    int updateByPrimaryKey(SpatialRefSys record);
}