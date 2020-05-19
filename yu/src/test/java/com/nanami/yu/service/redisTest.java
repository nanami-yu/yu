package com.nanami.yu.service;

import com.nanami.yu.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class redisTest {

    @Autowired
    RedisUtil redisUtil;

    @Test
    public void teRedis() {
        System.out.println(redisUtil.set("ces1","11",100));
        System.out.println(redisUtil.get("ces"));
        System.out.println(redisUtil.get("ces1"));
    }
}