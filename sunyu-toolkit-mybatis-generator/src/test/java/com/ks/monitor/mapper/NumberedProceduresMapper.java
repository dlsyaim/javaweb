package com.ks.monitor.mapper;

import com.ks.monitor.pojo.NumberedProcedures;

public interface NumberedProceduresMapper {
    int insert(NumberedProcedures record);

    int insertSelective(NumberedProcedures record);
}