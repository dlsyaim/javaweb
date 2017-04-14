package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ViewAlarm;

public interface ViewAlarmMapper {
    int insert(ViewAlarm record);

    int insertSelective(ViewAlarm record);
}