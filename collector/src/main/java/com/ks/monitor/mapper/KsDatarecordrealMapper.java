package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsDatarecordreal;

public interface KsDatarecordrealMapper {
    int deleteByPrimaryKey(Long recID);

    int insert(KsDatarecordreal record);

    int insertSelective(KsDatarecordreal record);

    KsDatarecordreal selectByPrimaryKey(Long recID);

    int updateByPrimaryKeySelective(KsDatarecordreal record);

    int updateByPrimaryKey(KsDatarecordreal record);
}