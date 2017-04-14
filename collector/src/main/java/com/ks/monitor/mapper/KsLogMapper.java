package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsLog;

public interface KsLogMapper {
    int deleteByPrimaryKey(Long nId);

    int insert(KsLog record);

    int insertSelective(KsLog record);

    KsLog selectByPrimaryKey(Long nId);

    int updateByPrimaryKeySelective(KsLog record);

    int updateByPrimaryKey(KsLog record);
}