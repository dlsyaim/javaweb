package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DatabaseAuditSpecifications;

public interface DatabaseAuditSpecificationsMapper {
    int insert(DatabaseAuditSpecifications record);

    int insertSelective(DatabaseAuditSpecifications record);
}