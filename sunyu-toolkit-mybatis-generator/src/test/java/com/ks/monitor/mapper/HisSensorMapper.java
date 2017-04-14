package com.ks.monitor.mapper;

import com.ks.monitor.pojo.HisSensor;

public interface HisSensorMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(HisSensor record);

    int insertSelective(HisSensor record);

    HisSensor selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(HisSensor record);

    int updateByPrimaryKey(HisSensor record);
}