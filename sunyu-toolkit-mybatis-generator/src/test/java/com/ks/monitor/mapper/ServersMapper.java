package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Servers;

public interface ServersMapper {
    int insert(Servers record);

    int insertSelective(Servers record);
}