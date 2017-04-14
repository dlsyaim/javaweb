package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Types;

public interface TypesMapper {
    int insert(Types record);

    int insertSelective(Types record);
}