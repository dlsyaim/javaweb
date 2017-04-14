package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsCitysUsed;

public interface KsCitysUsedMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(KsCitysUsed record);

    int insertSelective(KsCitysUsed record);

    KsCitysUsed selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(KsCitysUsed record);

    int updateByPrimaryKey(KsCitysUsed record);
}