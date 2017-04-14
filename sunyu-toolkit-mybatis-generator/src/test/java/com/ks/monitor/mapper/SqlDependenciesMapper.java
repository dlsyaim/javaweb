package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SqlDependencies;

public interface SqlDependenciesMapper {
    int insert(SqlDependencies record);

    int insertSelective(SqlDependencies record);
}