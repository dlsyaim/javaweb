package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Syslogins;

public interface SysloginsMapper {
    int insert(Syslogins record);

    int insertSelective(Syslogins record);
}