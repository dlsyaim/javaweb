package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SqlExpressionDependencies;

public interface SqlExpressionDependenciesMapper {
    int insert(SqlExpressionDependencies record);

    int insertSelective(SqlExpressionDependencies record);
}