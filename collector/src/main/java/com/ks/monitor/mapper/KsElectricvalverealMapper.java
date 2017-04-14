package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsElectricvalvereal;

public interface KsElectricvalverealMapper {
    int deleteByPrimaryKey(Long electricValveRealId);

    int insert(KsElectricvalvereal record);

    int insertSelective(KsElectricvalvereal record);

    KsElectricvalvereal selectByPrimaryKey(Long electricValveRealId);

    int updateByPrimaryKeySelective(KsElectricvalvereal record);

    int updateByPrimaryKey(KsElectricvalvereal record);
}