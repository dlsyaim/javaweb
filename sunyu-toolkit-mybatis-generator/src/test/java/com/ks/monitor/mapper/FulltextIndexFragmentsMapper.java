package com.ks.monitor.mapper;

import com.ks.monitor.pojo.FulltextIndexFragments;

public interface FulltextIndexFragmentsMapper {
    int insert(FulltextIndexFragments record);

    int insertSelective(FulltextIndexFragments record);
}