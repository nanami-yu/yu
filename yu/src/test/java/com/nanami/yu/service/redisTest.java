package com.nanami.yu.service;

import com.nanami.yu.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class redisTest {

    @Autowired
    RedisUtil redisUtil;

    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    @Test
    public void teRedis() {
        Map a = new HashMap<>();
        a.put("name","111");
        a.put("name1","222");
        redisTemplate.opsForHash().put("myhash","user:0001",a);
        //redisTemplate.opsForSet().add("myset",1,2,4);
        //System.out.println();
        //System.out.println(redisTemplate.opsForSet().isMember("myset",4));
        //System.out.println(redisTemplate.opsForSet().isMember("myset",5));
        //System.out.println(redisTemplate.opsForSet().members("myset"));
        System.out.println(redisTemplate.opsForHash().get("myhash","user:0001"));
    }

}