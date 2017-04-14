package com.ks.monitor.mapper;

import com.ks.monitor.pojo.WeegDatarecord;

public interface WeegDatarecordMapper {
    int deleteByPrimaryKey(Long recID);

    int insert(WeegDatarecord record);

    int insertSelective(WeegDatarecord record);

    WeegDatarecord selectByPrimaryKey(Long recID);

    int updateByPrimaryKeySelective(WeegDatarecord record);

    int updateByPrimaryKey(WeegDatarecord record);
}