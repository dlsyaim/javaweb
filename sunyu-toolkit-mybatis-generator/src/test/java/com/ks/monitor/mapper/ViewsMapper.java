package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Views;

public interface ViewsMapper {
    int insert(Views record);

    int insertSelective(Views record);
}