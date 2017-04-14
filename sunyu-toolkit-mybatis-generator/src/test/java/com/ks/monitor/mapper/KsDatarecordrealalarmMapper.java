package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsDatarecordrealalarm;

public interface KsDatarecordrealalarmMapper {
    int deleteByPrimaryKey(Long recID);

    int insert(KsDatarecordrealalarm record);

    int insertSelective(KsDatarecordrealalarm record);

    KsDatarecordrealalarm selectByPrimaryKey(Long recID);

    int updateByPrimaryKeySelective(KsDatarecordrealalarm record);

    int updateByPrimaryKey(KsDatarecordrealalarm record);
}