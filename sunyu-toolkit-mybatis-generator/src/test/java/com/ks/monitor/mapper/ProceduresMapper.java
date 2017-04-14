package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Procedures;

public interface ProceduresMapper {
    int insert(Procedures record);

    int insertSelective(Procedures record);
}