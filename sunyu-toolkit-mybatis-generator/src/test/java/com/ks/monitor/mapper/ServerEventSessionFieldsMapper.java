package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerEventSessionFields;

public interface ServerEventSessionFieldsMapper {
    int insert(ServerEventSessionFields record);

    int insertSelective(ServerEventSessionFields record);
}