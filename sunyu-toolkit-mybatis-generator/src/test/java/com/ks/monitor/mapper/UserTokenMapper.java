package com.ks.monitor.mapper;

import com.ks.monitor.pojo.UserToken;

public interface UserTokenMapper {
    int insert(UserToken record);

    int insertSelective(UserToken record);
}