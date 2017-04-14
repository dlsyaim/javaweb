package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsSolenoidvalverec;

public interface KsSolenoidvalverecMapper {
    int deleteByPrimaryKey(Long solenoidValveRecId);

    int insert(KsSolenoidvalverec record);

    int insertSelective(KsSolenoidvalverec record);

    KsSolenoidvalverec selectByPrimaryKey(Long solenoidValveRecId);

    int updateByPrimaryKeySelective(KsSolenoidvalverec record);

    int updateByPrimaryKey(KsSolenoidvalverec record);
}