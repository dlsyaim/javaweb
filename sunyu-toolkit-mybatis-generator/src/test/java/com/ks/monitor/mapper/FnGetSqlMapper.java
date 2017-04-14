package com.ks.monitor.mapper;

import com.ks.monitor.pojo.FnGetSql;

public interface FnGetSqlMapper {
    int insert(FnGetSql record);

    int insertSelective(FnGetSql record);
}