package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsLeak;

public interface KsLeakMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(KsLeak record);

    int insertSelective(KsLeak record);

    KsLeak selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(KsLeak record);

    int updateByPrimaryKeyWithBLOBs(KsLeak record);

    int updateByPrimaryKey(KsLeak record);
}