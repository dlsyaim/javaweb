package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsClass;

public interface KsClassMapper {
    int deleteByPrimaryKey(Long classID);

    int insert(KsClass record);

    int insertSelective(KsClass record);

    KsClass selectByPrimaryKey(Long classID);

    int updateByPrimaryKeySelective(KsClass record);

    int updateByPrimaryKey(KsClass record);
}