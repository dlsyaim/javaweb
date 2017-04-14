package com.ks.monitor.mapper;

import com.ks.monitor.pojo.HisSensorreal;

public interface HisSensorrealMapper {
    int deleteByPrimaryKey(Integer sensorID);

    int insert(HisSensorreal record);

    int insertSelective(HisSensorreal record);

    HisSensorreal selectByPrimaryKey(Integer sensorID);

    int updateByPrimaryKeySelective(HisSensorreal record);

    int updateByPrimaryKeyWithBLOBs(HisSensorreal record);

    int updateByPrimaryKey(HisSensorreal record);
}