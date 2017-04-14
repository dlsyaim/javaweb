package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsDeviceaddress;

public interface KsDeviceaddressMapper {
    int deleteByPrimaryKey(Long deviceAddressID);

    int insert(KsDeviceaddress record);

    int insertSelective(KsDeviceaddress record);

    KsDeviceaddress selectByPrimaryKey(Long deviceAddressID);

    int updateByPrimaryKeySelective(KsDeviceaddress record);

    int updateByPrimaryKey(KsDeviceaddress record);
}