package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsChunanPermissions;

public interface KsChunanPermissionsMapper {
    int deleteByPrimaryKey(Long PID);

    int insert(KsChunanPermissions record);

    int insertSelective(KsChunanPermissions record);

    KsChunanPermissions selectByPrimaryKey(Long PID);

    int updateByPrimaryKeySelective(KsChunanPermissions record);

    int updateByPrimaryKey(KsChunanPermissions record);
}