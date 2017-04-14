package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Syscolpars;

public interface SyscolparsMapper {
    int insert(Syscolpars record);

    int insertSelective(Syscolpars record);
}