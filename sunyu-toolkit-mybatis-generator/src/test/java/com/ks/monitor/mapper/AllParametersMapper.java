package com.ks.monitor.mapper;

import com.ks.monitor.pojo.AllParameters;

public interface AllParametersMapper {
    int insert(AllParameters record);

    int insertSelective(AllParameters record);
}