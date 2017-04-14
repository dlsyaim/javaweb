package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsDatarecordrealsx;

public interface KsDatarecordrealsxMapper {
    int deleteByPrimaryKey(Long recID);

    int insert(KsDatarecordrealsx record);

    int insertSelective(KsDatarecordrealsx record);

    KsDatarecordrealsx selectByPrimaryKey(Long recID);

    int updateByPrimaryKeySelective(KsDatarecordrealsx record);

    int updateByPrimaryKey(KsDatarecordrealsx record);
}