package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerPrincipalCredentials;

public interface ServerPrincipalCredentialsMapper {
    int insert(ServerPrincipalCredentials record);

    int insertSelective(ServerPrincipalCredentials record);
}