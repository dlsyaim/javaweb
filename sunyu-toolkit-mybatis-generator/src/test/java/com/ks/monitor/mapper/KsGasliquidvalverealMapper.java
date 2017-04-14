package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsGasliquidvalvereal;

public interface KsGasliquidvalverealMapper {
    int deleteByPrimaryKey(Long gasLiquidValveRealId);

    int insert(KsGasliquidvalvereal record);

    int insertSelective(KsGasliquidvalvereal record);

    KsGasliquidvalvereal selectByPrimaryKey(Long gasLiquidValveRealId);

    int updateByPrimaryKeySelective(KsGasliquidvalvereal record);

    int updateByPrimaryKey(KsGasliquidvalvereal record);
}