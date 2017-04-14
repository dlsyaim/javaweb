package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServiceContractMessageUsages;

public interface ServiceContractMessageUsagesMapper {
    int insert(ServiceContractMessageUsages record);

    int insertSelective(ServiceContractMessageUsages record);
}