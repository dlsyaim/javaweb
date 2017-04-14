package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsSoftbuttonrec;

public interface KsSoftbuttonrecMapper {
    int deleteByPrimaryKey(Long softButtonRecId);

    int insert(KsSoftbuttonrec record);

    int insertSelective(KsSoftbuttonrec record);

    KsSoftbuttonrec selectByPrimaryKey(Long softButtonRecId);

    int updateByPrimaryKeySelective(KsSoftbuttonrec record);

    int updateByPrimaryKey(KsSoftbuttonrec record);
}