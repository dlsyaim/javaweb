package com.ks.monitor.mapper;

import com.ks.monitor.pojo.HisDivision;

public interface HisDivisionMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(HisDivision record);

    int insertSelective(HisDivision record);

    HisDivision selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(HisDivision record);

    int updateByPrimaryKey(HisDivision record);
}