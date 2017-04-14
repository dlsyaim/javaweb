package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsSoftbuttonreal;

public interface KsSoftbuttonrealMapper {
    int deleteByPrimaryKey(Long softButtonRealId);

    int insert(KsSoftbuttonreal record);

    int insertSelective(KsSoftbuttonreal record);

    KsSoftbuttonreal selectByPrimaryKey(Long softButtonRealId);

    int updateByPrimaryKeySelective(KsSoftbuttonreal record);

    int updateByPrimaryKey(KsSoftbuttonreal record);
}