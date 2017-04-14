package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Databases;

public interface DatabasesMapper {
    int insert(Databases record);

    int insertSelective(Databases record);
}