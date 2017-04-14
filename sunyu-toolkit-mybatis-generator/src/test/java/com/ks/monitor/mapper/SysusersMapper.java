package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SysusersWithBLOBs;

public interface SysusersMapper {
    int insert(SysusersWithBLOBs record);

    int insertSelective(SysusersWithBLOBs record);
}