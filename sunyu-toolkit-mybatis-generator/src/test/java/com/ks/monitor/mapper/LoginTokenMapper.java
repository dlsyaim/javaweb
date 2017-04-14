package com.ks.monitor.mapper;

import com.ks.monitor.pojo.LoginToken;

public interface LoginTokenMapper {
    int insert(LoginToken record);

    int insertSelective(LoginToken record);
}