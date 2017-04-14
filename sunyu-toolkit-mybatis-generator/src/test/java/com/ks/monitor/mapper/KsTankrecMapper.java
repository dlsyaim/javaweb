package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsTankrec;

public interface KsTankrecMapper {
    int deleteByPrimaryKey(Long tankRecID);

    int insert(KsTankrec record);

    int insertSelective(KsTankrec record);

    KsTankrec selectByPrimaryKey(Long tankRecID);

    int updateByPrimaryKeySelective(KsTankrec record);

    int updateByPrimaryKey(KsTankrec record);
}