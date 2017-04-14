package com.ks.monitor.mapper;

import com.ks.monitor.pojo.CryptographicProviders;

public interface CryptographicProvidersMapper {
    int insert(CryptographicProviders record);

    int insertSelective(CryptographicProviders record);
}