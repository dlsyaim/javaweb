package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Objects;

public interface ObjectsMapper {
    int insert(Objects record);

    int insertSelective(Objects record);
}