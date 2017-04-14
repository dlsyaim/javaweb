package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsDprcarrRelations;

public interface KsDprcarrRelationsMapper {
    int deleteByPrimaryKey(Long relID);

    int insert(KsDprcarrRelations record);

    int insertSelective(KsDprcarrRelations record);

    KsDprcarrRelations selectByPrimaryKey(Long relID);

    int updateByPrimaryKeySelective(KsDprcarrRelations record);

    int updateByPrimaryKey(KsDprcarrRelations record);
}