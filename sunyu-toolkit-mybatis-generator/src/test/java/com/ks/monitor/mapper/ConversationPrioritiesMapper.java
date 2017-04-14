package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ConversationPriorities;

public interface ConversationPrioritiesMapper {
    int insert(ConversationPriorities record);

    int insertSelective(ConversationPriorities record);
}