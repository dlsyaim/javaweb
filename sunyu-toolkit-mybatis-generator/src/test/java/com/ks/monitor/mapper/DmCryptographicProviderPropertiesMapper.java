package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmCryptographicProviderProperties;

public interface DmCryptographicProviderPropertiesMapper {
    int insert(DmCryptographicProviderProperties record);

    int insertSelective(DmCryptographicProviderProperties record);
}