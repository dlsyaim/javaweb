package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsTableaddress;

public interface KsTableaddressMapper {
    int deleteByPrimaryKey(Long tableAddressID);

    int insert(KsTableaddress record);

    int insertSelective(KsTableaddress record);

    KsTableaddress selectByPrimaryKey(Long tableAddressID);

    int updateByPrimaryKeySelective(KsTableaddress record);

    int updateByPrimaryKey(KsTableaddress record);
}