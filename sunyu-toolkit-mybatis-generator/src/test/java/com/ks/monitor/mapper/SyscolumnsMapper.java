package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SyscolumnsWithBLOBs;

public interface SyscolumnsMapper {
    int insert(SyscolumnsWithBLOBs record);

    int insertSelective(SyscolumnsWithBLOBs record);
}