package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Credentials;

public interface CredentialsMapper {
    int insert(Credentials record);

    int insertSelective(Credentials record);
}