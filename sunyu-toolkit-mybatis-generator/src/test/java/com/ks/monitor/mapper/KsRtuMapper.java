package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsRtu;

public interface KsRtuMapper {
    int deleteByPrimaryKey(Long rtuID);

    int insert(KsRtu record);

    int insertSelective(KsRtu record);

    KsRtu selectByPrimaryKey(Long rtuID);

    int updateByPrimaryKeySelective(KsRtu record);

    int updateByPrimaryKey(KsRtu record);
}