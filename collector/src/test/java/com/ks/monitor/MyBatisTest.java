package com.ks.monitor;
import com.ks.monitor.mapper.KsEquipmentMapper;
import com.ks.monitor.pojo.KsEquipment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by dlsyaim on 2017/4/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-*.xml"})
public class MyBatisTest {

    @Resource(name = "ksEquipmentMapper")
    KsEquipmentMapper ksEquipmentMapper;

    @Test
    public void t1() {
        KsEquipment u = ksEquipmentMapper.selectByPrimaryKey((long) 1);
        System.out.println(u.getEquipMentName());
        System.out.println("111");
    }

}
