package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Systypes;

public interface SystypesMapper {
    int insert(Systypes record);

    int insertSelective(Systypes record);
}