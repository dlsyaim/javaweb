package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsElectricheatreal;

public interface KsElectricheatrealMapper {
    int deleteByPrimaryKey(Long electricHeatRealId);

    int insert(KsElectricheatreal record);

    int insertSelective(KsElectricheatreal record);

    KsElectricheatreal selectByPrimaryKey(Long electricHeatRealId);

    int updateByPrimaryKeySelective(KsElectricheatreal record);

    int updateByPrimaryKey(KsElectricheatreal record);
}