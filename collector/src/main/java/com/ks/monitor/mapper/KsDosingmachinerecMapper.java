package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsDosingmachinerec;

public interface KsDosingmachinerecMapper {
    int deleteByPrimaryKey(Long dosingMachineRecId);

    int insert(KsDosingmachinerec record);

    int insertSelective(KsDosingmachinerec record);

    KsDosingmachinerec selectByPrimaryKey(Long dosingMachineRecId);

    int updateByPrimaryKeySelective(KsDosingmachinerec record);

    int updateByPrimaryKey(KsDosingmachinerec record);
}