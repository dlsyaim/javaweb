package com.ks.monitor.mapper;

import com.ks.monitor.pojo.BackupDevices;

public interface BackupDevicesMapper {
    int insert(BackupDevices record);

    int insertSelective(BackupDevices record);
}