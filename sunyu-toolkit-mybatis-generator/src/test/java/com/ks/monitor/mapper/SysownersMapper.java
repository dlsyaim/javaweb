package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SysownersWithBLOBs;

public interface SysownersMapper {
    int insert(SysownersWithBLOBs record);

    int insertSelective(SysownersWithBLOBs record);
}