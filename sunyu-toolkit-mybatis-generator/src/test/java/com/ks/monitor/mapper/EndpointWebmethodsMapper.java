package com.ks.monitor.mapper;

import com.ks.monitor.pojo.EndpointWebmethods;

public interface EndpointWebmethodsMapper {
    int insert(EndpointWebmethods record);

    int insertSelective(EndpointWebmethods record);
}