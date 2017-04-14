package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsBlazerec;

public interface KsBlazerecMapper {
    int deleteByPrimaryKey(Long blazeRecId);

    int insert(KsBlazerec record);

    int insertSelective(KsBlazerec record);

    KsBlazerec selectByPrimaryKey(Long blazeRecId);

    int updateByPrimaryKeySelective(KsBlazerec record);

    int updateByPrimaryKey(KsBlazerec record);
}