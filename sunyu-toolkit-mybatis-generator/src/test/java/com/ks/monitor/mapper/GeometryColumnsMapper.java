package com.ks.monitor.mapper;

import com.ks.monitor.pojo.GeometryColumns;
import com.ks.monitor.pojo.GeometryColumnsKey;

public interface GeometryColumnsMapper {
    int deleteByPrimaryKey(GeometryColumnsKey key);

    int insert(GeometryColumns record);

    int insertSelective(GeometryColumns record);

    GeometryColumns selectByPrimaryKey(GeometryColumnsKey key);

    int updateByPrimaryKeySelective(GeometryColumns record);

    int updateByPrimaryKey(GeometryColumns record);
}