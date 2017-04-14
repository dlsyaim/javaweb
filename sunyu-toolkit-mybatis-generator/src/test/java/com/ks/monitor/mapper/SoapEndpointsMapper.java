package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SoapEndpoints;

public interface SoapEndpointsMapper {
    int insert(SoapEndpoints record);

    int insertSelective(SoapEndpoints record);
}