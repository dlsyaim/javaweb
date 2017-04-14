package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsDatarecordsx01;

public interface KsDatarecordsx01Mapper {
    int deleteByPrimaryKey(Long recID);

    int insert(KsDatarecordsx01 record);

    int insertSelective(KsDatarecordsx01 record);

    KsDatarecordsx01 selectByPrimaryKey(Long recID);

    int updateByPrimaryKeySelective(KsDatarecordsx01 record);

    int updateByPrimaryKey(KsDatarecordsx01 record);
}