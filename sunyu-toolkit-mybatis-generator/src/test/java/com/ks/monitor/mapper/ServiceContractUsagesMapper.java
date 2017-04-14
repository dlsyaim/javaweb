package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServiceContractUsages;

public interface ServiceContractUsagesMapper {
    int insert(ServiceContractUsages record);

    int insertSelective(ServiceContractUsages record);
}