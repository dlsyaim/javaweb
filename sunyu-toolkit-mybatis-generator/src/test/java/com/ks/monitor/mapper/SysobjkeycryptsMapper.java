package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SysobjkeycryptsWithBLOBs;

public interface SysobjkeycryptsMapper {
    int insert(SysobjkeycryptsWithBLOBs record);

    int insertSelective(SysobjkeycryptsWithBLOBs record);
}