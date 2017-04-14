package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsEquipreal;

public interface KsEquiprealMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(KsEquipreal record);

    int insertSelective(KsEquipreal record);

    KsEquipreal selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(KsEquipreal record);

    int updateByPrimaryKey(KsEquipreal record);
}