package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsSolenoidvalvereal;

public interface KsSolenoidvalverealMapper {
    int deleteByPrimaryKey(Long solenoidValveRealId);

    int insert(KsSolenoidvalvereal record);

    int insertSelective(KsSolenoidvalvereal record);

    KsSolenoidvalvereal selectByPrimaryKey(Long solenoidValveRealId);

    int updateByPrimaryKeySelective(KsSolenoidvalvereal record);

    int updateByPrimaryKey(KsSolenoidvalvereal record);
}