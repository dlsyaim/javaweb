package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SyslockinfoWithBLOBs;

public interface SyslockinfoMapper {
    int insert(SyslockinfoWithBLOBs record);

    int insertSelective(SyslockinfoWithBLOBs record);
}