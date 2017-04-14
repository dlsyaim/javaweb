package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsSolenpassword;

public interface KsSolenpasswordMapper {
    int deleteByPrimaryKey(Integer solenID);

    int insert(KsSolenpassword record);

    int insertSelective(KsSolenpassword record);

    KsSolenpassword selectByPrimaryKey(Integer solenID);

    int updateByPrimaryKeySelective(KsSolenpassword record);

    int updateByPrimaryKey(KsSolenpassword record);
}