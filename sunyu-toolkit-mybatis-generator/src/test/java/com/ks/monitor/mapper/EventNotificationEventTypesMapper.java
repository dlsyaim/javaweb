package com.ks.monitor.mapper;

import com.ks.monitor.pojo.EventNotificationEventTypes;

public interface EventNotificationEventTypesMapper {
    int insert(EventNotificationEventTypes record);

    int insertSelective(EventNotificationEventTypes record);
}