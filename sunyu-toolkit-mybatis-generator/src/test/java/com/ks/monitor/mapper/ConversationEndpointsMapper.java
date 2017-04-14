package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ConversationEndpoints;

public interface ConversationEndpointsMapper {
    int insert(ConversationEndpoints record);

    int insertSelective(ConversationEndpoints record);
}