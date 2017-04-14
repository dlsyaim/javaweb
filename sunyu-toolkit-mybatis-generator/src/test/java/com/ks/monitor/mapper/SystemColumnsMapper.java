package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SystemColumns;

public interface SystemColumnsMapper {
    int insert(SystemColumns record);

    int insertSelective(SystemColumns record);
}