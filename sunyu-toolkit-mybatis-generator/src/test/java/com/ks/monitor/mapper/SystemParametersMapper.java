package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SystemParameters;

public interface SystemParametersMapper {
    int insert(SystemParameters record);

    int insertSelective(SystemParameters record);
}