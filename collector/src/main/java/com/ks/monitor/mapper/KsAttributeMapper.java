package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsAttribute;

public interface KsAttributeMapper {
    int deleteByPrimaryKey(Long attrID);

    int insert(KsAttribute record);

    int insertSelective(KsAttribute record);

    KsAttribute selectByPrimaryKey(Long attrID);

    int updateByPrimaryKeySelective(KsAttribute record);

    int updateByPrimaryKey(KsAttribute record);
}