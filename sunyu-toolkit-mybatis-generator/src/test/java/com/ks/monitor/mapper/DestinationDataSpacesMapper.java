package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DestinationDataSpaces;

public interface DestinationDataSpacesMapper {
    int insert(DestinationDataSpaces record);

    int insertSelective(DestinationDataSpaces record);
}