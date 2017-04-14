package com.ks.monitor.mapper;

import com.ks.monitor.pojo.EventNotifications;

public interface EventNotificationsMapper {
    int insert(EventNotifications record);

    int insertSelective(EventNotifications record);
}