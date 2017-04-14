package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Schemas;

public interface SchemasMapper {
    int insert(Schemas record);

    int insertSelective(Schemas record);
}