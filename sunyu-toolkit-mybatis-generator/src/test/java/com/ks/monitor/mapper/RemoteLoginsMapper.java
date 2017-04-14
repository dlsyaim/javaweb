package com.ks.monitor.mapper;

import com.ks.monitor.pojo.RemoteLogins;

public interface RemoteLoginsMapper {
    int insert(RemoteLogins record);

    int insertSelective(RemoteLogins record);
}