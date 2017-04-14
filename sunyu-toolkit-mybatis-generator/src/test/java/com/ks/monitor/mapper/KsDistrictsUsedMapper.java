package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsDistrictsUsed;

public interface KsDistrictsUsedMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(KsDistrictsUsed record);

    int insertSelective(KsDistrictsUsed record);

    KsDistrictsUsed selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(KsDistrictsUsed record);

    int updateByPrimaryKey(KsDistrictsUsed record);
}