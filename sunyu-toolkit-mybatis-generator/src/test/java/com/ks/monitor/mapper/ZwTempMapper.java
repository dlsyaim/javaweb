package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ZwTemp;

public interface ZwTempMapper {
    int insert(ZwTemp record);

    int insertSelective(ZwTemp record);
}