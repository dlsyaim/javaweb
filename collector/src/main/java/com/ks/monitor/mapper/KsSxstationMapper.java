package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsSxstation;

public interface KsSxstationMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(KsSxstation record);

    int insertSelective(KsSxstation record);

    KsSxstation selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(KsSxstation record);

    int updateByPrimaryKeyWithBLOBs(KsSxstation record);

    int updateByPrimaryKey(KsSxstation record);
}