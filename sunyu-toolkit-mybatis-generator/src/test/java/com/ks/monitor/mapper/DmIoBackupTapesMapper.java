package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmIoBackupTapes;

public interface DmIoBackupTapesMapper {
    int insert(DmIoBackupTapes record);

    int insertSelective(DmIoBackupTapes record);
}