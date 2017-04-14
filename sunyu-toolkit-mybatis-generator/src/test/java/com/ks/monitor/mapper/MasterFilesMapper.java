package com.ks.monitor.mapper;

import com.ks.monitor.pojo.MasterFiles;

public interface MasterFilesMapper {
    int insert(MasterFiles record);

    int insertSelective(MasterFiles record);
}