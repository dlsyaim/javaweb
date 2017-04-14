package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsFlow;

public interface KsFlowMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(KsFlow record);

    int insertSelective(KsFlow record);

    KsFlow selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(KsFlow record);

    int updateByPrimaryKeyWithBLOBs(KsFlow record);

    int updateByPrimaryKey(KsFlow record);
}