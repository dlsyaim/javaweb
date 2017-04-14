package com.ks.monitor.mapper;

import com.ks.monitor.pojo.WeegStationdatarecord;

public interface WeegStationdatarecordMapper {
    int deleteByPrimaryKey(Long recID);

    int insert(WeegStationdatarecord record);

    int insertSelective(WeegStationdatarecord record);

    WeegStationdatarecord selectByPrimaryKey(Long recID);

    int updateByPrimaryKeySelective(WeegStationdatarecord record);

    int updateByPrimaryKey(WeegStationdatarecord record);
}