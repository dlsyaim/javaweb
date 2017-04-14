package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerPrincipals;

public interface ServerPrincipalsMapper {
    int insert(ServerPrincipals record);

    int insertSelective(ServerPrincipals record);
}