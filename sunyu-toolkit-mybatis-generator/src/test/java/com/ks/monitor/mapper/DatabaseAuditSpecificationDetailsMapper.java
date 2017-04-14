package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DatabaseAuditSpecificationDetails;

public interface DatabaseAuditSpecificationDetailsMapper {
    int insert(DatabaseAuditSpecificationDetails record);

    int insertSelective(DatabaseAuditSpecificationDetails record);
}