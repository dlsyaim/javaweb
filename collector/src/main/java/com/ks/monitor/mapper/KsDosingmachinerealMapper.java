package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsDosingmachinereal;

public interface KsDosingmachinerealMapper {
    int deleteByPrimaryKey(Long dosingMachineRealId);

    int insert(KsDosingmachinereal record);

    int insertSelective(KsDosingmachinereal record);

    KsDosingmachinereal selectByPrimaryKey(Long dosingMachineRealId);

    int updateByPrimaryKeySelective(KsDosingmachinereal record);

    int updateByPrimaryKey(KsDosingmachinereal record);
}