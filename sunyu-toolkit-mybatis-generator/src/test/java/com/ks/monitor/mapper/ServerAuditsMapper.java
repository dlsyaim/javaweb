package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerAudits;

public interface ServerAuditsMapper {
    int insert(ServerAudits record);

    int insertSelective(ServerAudits record);
}