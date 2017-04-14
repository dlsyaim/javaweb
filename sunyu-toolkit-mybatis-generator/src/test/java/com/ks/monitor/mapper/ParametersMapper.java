package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Parameters;

public interface ParametersMapper {
    int insert(Parameters record);

    int insertSelective(Parameters record);
}