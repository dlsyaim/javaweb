package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ViewTableUsage;

public interface ViewTableUsageMapper {
    int insert(ViewTableUsage record);

    int insertSelective(ViewTableUsage record);
}