package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DatabasePrincipalAliases;

public interface DatabasePrincipalAliasesMapper {
    int insert(DatabasePrincipalAliases record);

    int insertSelective(DatabasePrincipalAliases record);
}