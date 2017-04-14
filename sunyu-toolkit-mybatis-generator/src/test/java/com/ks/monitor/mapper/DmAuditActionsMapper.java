package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmAuditActions;

public interface DmAuditActionsMapper {
    int insert(DmAuditActions record);

    int insertSelective(DmAuditActions record);
}