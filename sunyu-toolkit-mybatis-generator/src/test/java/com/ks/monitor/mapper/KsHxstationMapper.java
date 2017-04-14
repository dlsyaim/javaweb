package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsHxstation;

public interface KsHxstationMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(KsHxstation record);

    int insertSelective(KsHxstation record);

    KsHxstation selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(KsHxstation record);

    int updateByPrimaryKeyWithBLOBs(KsHxstation record);

    int updateByPrimaryKey(KsHxstation record);
}