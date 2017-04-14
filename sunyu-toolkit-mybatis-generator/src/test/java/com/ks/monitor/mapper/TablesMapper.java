package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Tables;

public interface TablesMapper {
    int insert(Tables record);

    int insertSelective(Tables record);
}