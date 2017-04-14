package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsPressureadjustvalvereal;

public interface KsPressureadjustvalverealMapper {
    int deleteByPrimaryKey(Long pressureAdjustValveRealId);

    int insert(KsPressureadjustvalvereal record);

    int insertSelective(KsPressureadjustvalvereal record);

    KsPressureadjustvalvereal selectByPrimaryKey(Long pressureAdjustValveRealId);

    int updateByPrimaryKeySelective(KsPressureadjustvalvereal record);

    int updateByPrimaryKey(KsPressureadjustvalvereal record);
}