package com.ks.monitor.mapper;

import com.ks.monitor.pojo.IdentityColumns;

public interface IdentityColumnsMapper {
    int insert(IdentityColumns record);

    int insertSelective(IdentityColumns record);
}