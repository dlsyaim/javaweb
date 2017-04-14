package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmQnSubscriptions;

public interface DmQnSubscriptionsMapper {
    int insert(DmQnSubscriptions record);

    int insertSelective(DmQnSubscriptions record);
}