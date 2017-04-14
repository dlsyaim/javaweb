package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Endpoints;

public interface EndpointsMapper {
    int insert(Endpoints record);

    int insertSelective(Endpoints record);
}