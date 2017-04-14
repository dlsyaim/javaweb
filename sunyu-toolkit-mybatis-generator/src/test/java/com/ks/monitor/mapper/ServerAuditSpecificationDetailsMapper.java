package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerAuditSpecificationDetails;

public interface ServerAuditSpecificationDetailsMapper {
    int insert(ServerAuditSpecificationDetails record);

    int insertSelective(ServerAuditSpecificationDetails record);
}