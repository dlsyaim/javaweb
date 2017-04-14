package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsRole;

public interface KsRoleMapper {
    int deleteByPrimaryKey(Long roleID);

    int insert(KsRole record);

    int insertSelective(KsRole record);

    KsRole selectByPrimaryKey(Long roleID);

    int updateByPrimaryKeySelective(KsRole record);

    int updateByPrimaryKey(KsRole record);
}