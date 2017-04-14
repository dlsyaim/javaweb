package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsDosingcontorllerrec;

public interface KsDosingcontorllerrecMapper {
    int deleteByPrimaryKey(Long dosingControllerRecId);

    int insert(KsDosingcontorllerrec record);

    int insertSelective(KsDosingcontorllerrec record);

    KsDosingcontorllerrec selectByPrimaryKey(Long dosingControllerRecId);

    int updateByPrimaryKeySelective(KsDosingcontorllerrec record);

    int updateByPrimaryKey(KsDosingcontorllerrec record);
}