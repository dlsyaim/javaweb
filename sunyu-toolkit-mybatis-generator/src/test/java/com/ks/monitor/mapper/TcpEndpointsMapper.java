package com.ks.monitor.mapper;

import com.ks.monitor.pojo.TcpEndpoints;

public interface TcpEndpointsMapper {
    int insert(TcpEndpoints record);

    int insertSelective(TcpEndpoints record);
}