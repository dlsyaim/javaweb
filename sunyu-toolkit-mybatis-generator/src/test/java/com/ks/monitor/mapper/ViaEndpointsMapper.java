package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ViaEndpoints;

public interface ViaEndpointsMapper {
    int insert(ViaEndpoints record);

    int insertSelective(ViaEndpoints record);
}