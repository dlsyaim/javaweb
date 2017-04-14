package com.ks.monitor.mapper;

import com.ks.monitor.pojo.HttpEndpoints;

public interface HttpEndpointsMapper {
    int insert(HttpEndpoints record);

    int insertSelective(HttpEndpoints record);
}