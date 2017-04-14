package com.ks.monitor.mapper;

import com.ks.monitor.pojo.HisLogicalstation;

public interface HisLogicalstationMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(HisLogicalstation record);

    int insertSelective(HisLogicalstation record);

    HisLogicalstation selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(HisLogicalstation record);

    int updateByPrimaryKeyWithBLOBs(HisLogicalstation record);

    int updateByPrimaryKey(HisLogicalstation record);
}