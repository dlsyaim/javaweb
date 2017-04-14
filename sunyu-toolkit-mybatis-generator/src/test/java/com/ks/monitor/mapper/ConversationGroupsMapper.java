package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ConversationGroups;

public interface ConversationGroupsMapper {
    int insert(ConversationGroups record);

    int insertSelective(ConversationGroups record);
}