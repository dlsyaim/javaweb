package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Syscomments;

public interface SyscommentsMapper {
    int insert(Syscomments record);

    int insertSelective(Syscomments record);
}