package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServiceContracts;

public interface ServiceContractsMapper {
    int insert(ServiceContracts record);

    int insertSelective(ServiceContracts record);
}