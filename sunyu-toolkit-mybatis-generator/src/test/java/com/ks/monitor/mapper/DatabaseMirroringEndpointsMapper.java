package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DatabaseMirroringEndpoints;

public interface DatabaseMirroringEndpointsMapper {
    int insert(DatabaseMirroringEndpoints record);

    int insertSelective(DatabaseMirroringEndpoints record);
}