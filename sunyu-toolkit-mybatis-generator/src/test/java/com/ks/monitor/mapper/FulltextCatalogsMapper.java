package com.ks.monitor.mapper;

import com.ks.monitor.pojo.FulltextCatalogs;

public interface FulltextCatalogsMapper {
    int insert(FulltextCatalogs record);

    int insertSelective(FulltextCatalogs record);
}