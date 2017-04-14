package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmDbMirroringPastActions;

public interface DmDbMirroringPastActionsMapper {
    int insert(DmDbMirroringPastActions record);

    int insertSelective(DmDbMirroringPastActions record);
}