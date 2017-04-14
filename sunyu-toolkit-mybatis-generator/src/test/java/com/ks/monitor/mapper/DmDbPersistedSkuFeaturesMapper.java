package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmDbPersistedSkuFeatures;

public interface DmDbPersistedSkuFeaturesMapper {
    int insert(DmDbPersistedSkuFeatures record);

    int insertSelective(DmDbPersistedSkuFeatures record);
}