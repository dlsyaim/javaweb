package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DatabaseRoleMembers;

public interface DatabaseRoleMembersMapper {
    int insert(DatabaseRoleMembers record);

    int insertSelective(DatabaseRoleMembers record);
}