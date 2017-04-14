package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmSqlReferencedEntities;

public interface DmSqlReferencedEntitiesMapper {
    int insert(DmSqlReferencedEntities record);

    int insertSelective(DmSqlReferencedEntities record);
}