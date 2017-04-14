package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysqnames;

public interface SysqnamesMapper {
    int insert(Sysqnames record);

    int insertSelective(Sysqnames record);
}