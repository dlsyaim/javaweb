package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsUserrole;

public interface KsUserroleMapper {
    int deleteByPrimaryKey(Long roleID);

    int insert(KsUserrole record);

    int insertSelective(KsUserrole record);

    KsUserrole selectByPrimaryKey(Long roleID);

    int updateByPrimaryKeySelective(KsUserrole record);

    int updateByPrimaryKey(KsUserrole record);
}