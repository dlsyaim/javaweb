package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysiscols;

public interface SysiscolsMapper {
    int insert(Sysiscols record);

    int insertSelective(Sysiscols record);
}