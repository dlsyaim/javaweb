package com.ks.monitor.mapper;

import com.ks.monitor.pojo.FulltextIndexCatalogUsages;

public interface FulltextIndexCatalogUsagesMapper {
    int insert(FulltextIndexCatalogUsages record);

    int insertSelective(FulltextIndexCatalogUsages record);
}