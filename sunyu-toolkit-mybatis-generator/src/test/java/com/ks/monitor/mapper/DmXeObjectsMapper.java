package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmXeObjects;

public interface DmXeObjectsMapper {
    int insert(DmXeObjects record);

    int insertSelective(DmXeObjects record);
}