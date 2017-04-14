package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsBlazereal;

public interface KsBlazerealMapper {
    int deleteByPrimaryKey(Long blazeRealId);

    int insert(KsBlazereal record);

    int insertSelective(KsBlazereal record);

    KsBlazereal selectByPrimaryKey(Long blazeRealId);

    int updateByPrimaryKeySelective(KsBlazereal record);

    int updateByPrimaryKey(KsBlazereal record);
}