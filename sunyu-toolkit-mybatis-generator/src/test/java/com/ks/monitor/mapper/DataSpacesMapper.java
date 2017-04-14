package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DataSpaces;

public interface DataSpacesMapper {
    int insert(DataSpaces record);

    int insertSelective(DataSpaces record);
}