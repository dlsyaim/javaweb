package com.ks.monitor.mapper;

import com.ks.monitor.pojo.NumberedProcedureParameters;

public interface NumberedProcedureParametersMapper {
    int insert(NumberedProcedureParameters record);

    int insertSelective(NumberedProcedureParameters record);
}