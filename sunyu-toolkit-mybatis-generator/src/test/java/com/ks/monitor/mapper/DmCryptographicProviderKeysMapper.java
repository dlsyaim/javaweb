package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmCryptographicProviderKeys;

public interface DmCryptographicProviderKeysMapper {
    int insert(DmCryptographicProviderKeys record);

    int insertSelective(DmCryptographicProviderKeys record);
}