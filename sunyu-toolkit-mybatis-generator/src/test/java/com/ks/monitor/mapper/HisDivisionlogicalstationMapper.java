package com.ks.monitor.mapper;

import com.ks.monitor.pojo.HisDivisionlogicalstation;

public interface HisDivisionlogicalstationMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(HisDivisionlogicalstation record);

    int insertSelective(HisDivisionlogicalstation record);

    HisDivisionlogicalstation selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(HisDivisionlogicalstation record);

    int updateByPrimaryKey(HisDivisionlogicalstation record);
}