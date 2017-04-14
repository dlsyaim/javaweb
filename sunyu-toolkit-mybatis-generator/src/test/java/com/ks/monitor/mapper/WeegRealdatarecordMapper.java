package com.ks.monitor.mapper;

import com.ks.monitor.pojo.WeegRealdatarecord;

public interface WeegRealdatarecordMapper {
    int deleteByPrimaryKey(String devSerial);

    int insert(WeegRealdatarecord record);

    int insertSelective(WeegRealdatarecord record);

    WeegRealdatarecord selectByPrimaryKey(String devSerial);

    int updateByPrimaryKeySelective(WeegRealdatarecord record);

    int updateByPrimaryKey(WeegRealdatarecord record);
}