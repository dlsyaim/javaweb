package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmSqlReferencingEntities;

public interface DmSqlReferencingEntitiesMapper {
    int insert(DmSqlReferencingEntities record);

    int insertSelective(DmSqlReferencingEntities record);
}