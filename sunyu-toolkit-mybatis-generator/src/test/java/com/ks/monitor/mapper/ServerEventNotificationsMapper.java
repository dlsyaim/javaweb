package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerEventNotifications;

public interface ServerEventNotificationsMapper {
    int insert(ServerEventNotifications record);

    int insertSelective(ServerEventNotifications record);
}