package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SecurableClasses;

public interface SecurableClassesMapper {
    int insert(SecurableClasses record);

    int insertSelective(SecurableClasses record);
}