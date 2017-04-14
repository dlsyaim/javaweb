package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmDbMissingIndexDetails;

public interface DmDbMissingIndexDetailsMapper {
    int insert(DmDbMissingIndexDetails record);

    int insertSelective(DmDbMissingIndexDetails record);
}