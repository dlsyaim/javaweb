package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ColumnDomainUsage;

public interface ColumnDomainUsageMapper {
    int insert(ColumnDomainUsage record);

    int insertSelective(ColumnDomainUsage record);
}