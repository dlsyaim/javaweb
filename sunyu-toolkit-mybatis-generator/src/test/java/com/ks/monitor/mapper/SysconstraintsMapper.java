package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysconstraints;

public interface SysconstraintsMapper {
    int insert(Sysconstraints record);

    int insertSelective(Sysconstraints record);
}