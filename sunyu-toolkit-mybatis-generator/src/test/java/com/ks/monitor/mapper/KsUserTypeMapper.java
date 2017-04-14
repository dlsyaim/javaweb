package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsUserType;

public interface KsUserTypeMapper {
    int deleteByPrimaryKey(Long userTypeID);

    int insert(KsUserType record);

    int insertSelective(KsUserType record);

    KsUserType selectByPrimaryKey(Long userTypeID);

    int updateByPrimaryKeySelective(KsUserType record);

    int updateByPrimaryKey(KsUserType record);
}