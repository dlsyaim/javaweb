package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DefaultConstraints;

public interface DefaultConstraintsMapper {
    int insert(DefaultConstraints record);

    int insertSelective(DefaultConstraints record);
}