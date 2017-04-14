package com.ks.monitor.mapper;

import com.ks.monitor.pojo.FulltextIndexes;

public interface FulltextIndexesMapper {
    int insert(FulltextIndexes record);

    int insertSelective(FulltextIndexes record);
}