package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmCryptographicProviderSessions;

public interface DmCryptographicProviderSessionsMapper {
    int insert(DmCryptographicProviderSessions record);

    int insertSelective(DmCryptographicProviderSessions record);
}