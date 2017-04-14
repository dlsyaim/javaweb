package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsProvincesUsed;

public interface KsProvincesUsedMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(KsProvincesUsed record);

    int insertSelective(KsProvincesUsed record);

    KsProvincesUsed selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(KsProvincesUsed record);

    int updateByPrimaryKey(KsProvincesUsed record);
}