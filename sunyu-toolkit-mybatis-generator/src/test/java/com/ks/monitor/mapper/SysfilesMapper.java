package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysfiles;

public interface SysfilesMapper {
    int insert(Sysfiles record);

    int insertSelective(Sysfiles record);
}