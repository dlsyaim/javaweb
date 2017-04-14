package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServiceMessageTypes;

public interface ServiceMessageTypesMapper {
    int insert(ServiceMessageTypes record);

    int insertSelective(ServiceMessageTypes record);
}