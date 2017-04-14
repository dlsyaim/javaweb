package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmXeSessions;

public interface DmXeSessionsMapper {
    int insert(DmXeSessions record);

    int insertSelective(DmXeSessions record);
}