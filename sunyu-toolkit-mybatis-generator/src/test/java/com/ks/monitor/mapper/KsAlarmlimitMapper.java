package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsAlarmlimit;

public interface KsAlarmlimitMapper {
    int deleteByPrimaryKey(Long alarmID);

    int insert(KsAlarmlimit record);

    int insertSelective(KsAlarmlimit record);

    KsAlarmlimit selectByPrimaryKey(Long alarmID);

    int updateByPrimaryKeySelective(KsAlarmlimit record);

    int updateByPrimaryKey(KsAlarmlimit record);
}