package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ViewKsDatarecord;

public interface ViewKsDatarecordMapper {
    int insert(ViewKsDatarecord record);

    int insertSelective(ViewKsDatarecord record);
}