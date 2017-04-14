package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsEquipment;

public interface KsEquipmentMapper {
    int deleteByPrimaryKey(Long equipMentID);

    int insert(KsEquipment record);

    int insertSelective(KsEquipment record);

    KsEquipment selectByPrimaryKey(Long equipMentID);

    int updateByPrimaryKeySelective(KsEquipment record);

    int updateByPrimaryKey(KsEquipment record);
}