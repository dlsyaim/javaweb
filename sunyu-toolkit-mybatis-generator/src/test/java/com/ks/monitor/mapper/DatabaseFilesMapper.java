package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DatabaseFiles;

public interface DatabaseFilesMapper {
    int insert(DatabaseFiles record);

    int insertSelective(DatabaseFiles record);
}