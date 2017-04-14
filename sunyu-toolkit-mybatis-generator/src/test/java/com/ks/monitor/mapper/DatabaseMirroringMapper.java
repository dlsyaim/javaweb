package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DatabaseMirroring;

public interface DatabaseMirroringMapper {
    int insert(DatabaseMirroring record);

    int insertSelective(DatabaseMirroring record);
}