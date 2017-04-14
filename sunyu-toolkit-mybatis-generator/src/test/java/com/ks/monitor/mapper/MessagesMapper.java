package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Messages;

public interface MessagesMapper {
    int insert(Messages record);

    int insertSelective(Messages record);
}