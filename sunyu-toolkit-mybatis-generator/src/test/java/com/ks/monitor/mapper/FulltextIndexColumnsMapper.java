package com.ks.monitor.mapper;

import com.ks.monitor.pojo.FulltextIndexColumns;

public interface FulltextIndexColumnsMapper {
    int insert(FulltextIndexColumns record);

    int insertSelective(FulltextIndexColumns record);
}