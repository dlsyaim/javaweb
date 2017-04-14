package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsUserstation;

public interface KsUserstationMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(KsUserstation record);

    int insertSelective(KsUserstation record);

    KsUserstation selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(KsUserstation record);

    int updateByPrimaryKeyWithBLOBs(KsUserstation record);

    int updateByPrimaryKey(KsUserstation record);
}