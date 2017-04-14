package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsPrcarrRelations;

public interface KsPrcarrRelationsMapper {
    int deleteByPrimaryKey(Long relID);

    int insert(KsPrcarrRelations record);

    int insertSelective(KsPrcarrRelations record);

    KsPrcarrRelations selectByPrimaryKey(Long relID);

    int updateByPrimaryKeySelective(KsPrcarrRelations record);

    int updateByPrimaryKey(KsPrcarrRelations record);
}