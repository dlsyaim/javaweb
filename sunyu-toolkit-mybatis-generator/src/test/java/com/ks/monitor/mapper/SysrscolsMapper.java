package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysrscols;

public interface SysrscolsMapper {
    int insert(Sysrscols record);

    int insertSelective(Sysrscols record);
}