package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ExtendedProcedures;

public interface ExtendedProceduresMapper {
    int insert(ExtendedProcedures record);

    int insertSelective(ExtendedProcedures record);
}