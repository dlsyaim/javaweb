package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmDbMissingIndexColumns;

public interface DmDbMissingIndexColumnsMapper {
    int insert(DmDbMissingIndexColumns record);

    int insertSelective(DmDbMissingIndexColumns record);
}