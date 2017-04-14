package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SystemObjects;

public interface SystemObjectsMapper {
    int insert(SystemObjects record);

    int insertSelective(SystemObjects record);
}