package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerAuditSpecifications;

public interface ServerAuditSpecificationsMapper {
    int insert(ServerAuditSpecifications record);

    int insertSelective(ServerAuditSpecifications record);
}