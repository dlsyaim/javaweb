package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Stats;

public interface StatsMapper {
    int insert(Stats record);

    int insertSelective(Stats record);
}