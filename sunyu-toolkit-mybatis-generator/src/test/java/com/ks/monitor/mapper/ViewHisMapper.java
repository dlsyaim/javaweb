package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ViewHis;

public interface ViewHisMapper {
    int insert(ViewHis record);

    int insertSelective(ViewHis record);
}