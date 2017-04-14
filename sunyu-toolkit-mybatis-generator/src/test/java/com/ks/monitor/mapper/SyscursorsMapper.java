package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Syscursors;

public interface SyscursorsMapper {
    int insert(Syscursors record);

    int insertSelective(Syscursors record);
}