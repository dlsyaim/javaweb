package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerRoleMembers;

public interface ServerRoleMembersMapper {
    int insert(ServerRoleMembers record);

    int insertSelective(ServerRoleMembers record);
}