package com.ks.monitor.mapper;

import com.ks.monitor.pojo.WeegStationrealdatarecord;

public interface WeegStationrealdatarecordMapper {
    int deleteByPrimaryKey(String devSerial);

    int insert(WeegStationrealdatarecord record);

    int insertSelective(WeegStationrealdatarecord record);

    WeegStationrealdatarecord selectByPrimaryKey(String devSerial);

    int updateByPrimaryKeySelective(WeegStationrealdatarecord record);

    int updateByPrimaryKey(WeegStationrealdatarecord record);
}