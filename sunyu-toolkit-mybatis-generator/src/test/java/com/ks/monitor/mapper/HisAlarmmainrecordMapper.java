package com.ks.monitor.mapper;

import com.ks.monitor.pojo.HisAlarmmainrecord;

public interface HisAlarmmainrecordMapper {
    int deleteByPrimaryKey(String ID);

    int insert(HisAlarmmainrecord record);

    int insertSelective(HisAlarmmainrecord record);

    HisAlarmmainrecord selectByPrimaryKey(String ID);

    int updateByPrimaryKeySelective(HisAlarmmainrecord record);

    int updateByPrimaryKeyWithBLOBs(HisAlarmmainrecord record);

    int updateByPrimaryKey(HisAlarmmainrecord record);
}