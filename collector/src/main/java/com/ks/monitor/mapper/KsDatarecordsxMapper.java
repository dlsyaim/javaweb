package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsDatarecordsx;

public interface KsDatarecordsxMapper {
    int deleteByPrimaryKey(Long recID);

    int insert(KsDatarecordsx record);

    int insertSelective(KsDatarecordsx record);

    KsDatarecordsx selectByPrimaryKey(Long recID);

    int updateByPrimaryKeySelective(KsDatarecordsx record);

    int updateByPrimaryKey(KsDatarecordsx record);
}