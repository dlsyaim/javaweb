package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmBrokerForwardedMessages;

public interface DmBrokerForwardedMessagesMapper {
    int insert(DmBrokerForwardedMessages record);

    int insertSelective(DmBrokerForwardedMessages record);
}