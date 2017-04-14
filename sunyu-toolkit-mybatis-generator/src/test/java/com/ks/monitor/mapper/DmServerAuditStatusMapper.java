package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmServerAuditStatus;

public interface DmServerAuditStatusMapper {
    int insert(DmServerAuditStatus record);

    int insertSelective(DmServerAuditStatus record);
}