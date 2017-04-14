package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServiceBrokerEndpoints;

public interface ServiceBrokerEndpointsMapper {
    int insert(ServiceBrokerEndpoints record);

    int insertSelective(ServiceBrokerEndpoints record);
}