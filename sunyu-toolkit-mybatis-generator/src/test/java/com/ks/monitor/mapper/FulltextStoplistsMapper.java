package com.ks.monitor.mapper;

import com.ks.monitor.pojo.FulltextStoplists;

public interface FulltextStoplistsMapper {
    int insert(FulltextStoplists record);

    int insertSelective(FulltextStoplists record);
}