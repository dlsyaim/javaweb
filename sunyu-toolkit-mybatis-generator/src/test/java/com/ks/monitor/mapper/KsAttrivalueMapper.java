package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsAttrivalue;

public interface KsAttrivalueMapper {
    int deleteByPrimaryKey(Long attrValID);

    int insert(KsAttrivalue record);

    int insertSelective(KsAttrivalue record);

    KsAttrivalue selectByPrimaryKey(Long attrValID);

    int updateByPrimaryKeySelective(KsAttrivalue record);

    int updateByPrimaryKey(KsAttrivalue record);
}