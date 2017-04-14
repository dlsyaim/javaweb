package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsEquipmentManager;

public interface KsEquipmentManagerMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(KsEquipmentManager record);

    int insertSelective(KsEquipmentManager record);

    KsEquipmentManager selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(KsEquipmentManager record);

    int updateByPrimaryKey(KsEquipmentManager record);
}