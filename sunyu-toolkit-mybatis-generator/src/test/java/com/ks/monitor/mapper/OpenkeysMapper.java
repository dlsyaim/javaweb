package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Openkeys;

public interface OpenkeysMapper {
    int insert(Openkeys record);

    int insertSelective(Openkeys record);
}