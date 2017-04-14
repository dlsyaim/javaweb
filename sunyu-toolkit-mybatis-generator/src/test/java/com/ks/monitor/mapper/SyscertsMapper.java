package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SyscertsWithBLOBs;

public interface SyscertsMapper {
    int insert(SyscertsWithBLOBs record);

    int insertSelective(SyscertsWithBLOBs record);
}