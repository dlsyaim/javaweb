package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysconfigures;

public interface SysconfiguresMapper {
    int insert(Sysconfigures record);

    int insertSelective(Sysconfigures record);
}