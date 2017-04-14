package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsDosingcontrollerreal;

public interface KsDosingcontrollerrealMapper {
    int deleteByPrimaryKey(Long dosingControllerRealId);

    int insert(KsDosingcontrollerreal record);

    int insertSelective(KsDosingcontrollerreal record);

    KsDosingcontrollerreal selectByPrimaryKey(Long dosingControllerRealId);

    int updateByPrimaryKeySelective(KsDosingcontrollerreal record);

    int updateByPrimaryKey(KsDosingcontrollerreal record);
}