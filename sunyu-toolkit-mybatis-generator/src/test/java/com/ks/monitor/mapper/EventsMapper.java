package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Events;

public interface EventsMapper {
    int insert(Events record);

    int insertSelective(Events record);
}