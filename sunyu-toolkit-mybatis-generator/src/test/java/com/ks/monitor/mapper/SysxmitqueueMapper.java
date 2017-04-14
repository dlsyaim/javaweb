package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysxmitqueue;

public interface SysxmitqueueMapper {
    int insert(Sysxmitqueue record);

    int insertSelective(Sysxmitqueue record);
}