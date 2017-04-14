package com.ks.monitor.mapper;

import com.ks.monitor.pojo.AllObjects;

public interface AllObjectsMapper {
    int insert(AllObjects record);

    int insertSelective(AllObjects record);
}