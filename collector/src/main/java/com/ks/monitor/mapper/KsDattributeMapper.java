package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsDattribute;

public interface KsDattributeMapper {
    int deleteByPrimaryKey(Long attrID);

    int insert(KsDattribute record);

    int insertSelective(KsDattribute record);

    KsDattribute selectByPrimaryKey(Long attrID);

    int updateByPrimaryKeySelective(KsDattribute record);

    int updateByPrimaryKey(KsDattribute record);
}