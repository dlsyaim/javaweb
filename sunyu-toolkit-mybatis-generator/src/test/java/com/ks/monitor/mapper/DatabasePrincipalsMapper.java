package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DatabasePrincipals;

public interface DatabasePrincipalsMapper {
    int insert(DatabasePrincipals record);

    int insertSelective(DatabasePrincipals record);
}