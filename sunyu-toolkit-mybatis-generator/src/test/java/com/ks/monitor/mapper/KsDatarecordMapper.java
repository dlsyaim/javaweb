package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsDatarecord;

public interface KsDatarecordMapper {
    int deleteByPrimaryKey(Long recID);

    int insert(KsDatarecord record);

    int insertSelective(KsDatarecord record);

    KsDatarecord selectByPrimaryKey(Long recID);

    int updateByPrimaryKeySelective(KsDatarecord record);

    int updateByPrimaryKey(KsDatarecord record);
}