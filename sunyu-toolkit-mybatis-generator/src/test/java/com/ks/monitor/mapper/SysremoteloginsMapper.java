package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysremotelogins;

public interface SysremoteloginsMapper {
    int insert(Sysremotelogins record);

    int insertSelective(Sysremotelogins record);
}