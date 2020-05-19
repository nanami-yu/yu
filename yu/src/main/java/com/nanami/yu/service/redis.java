package com.nanami.yu.service;

import com.nanami.yu.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: yu
 * @description: redis
 * @author: nanami
 * @create: 2020-05-19 09:58
 **/

public class redis {
    @Autowired
    RedisUtil redisUtil;

    public void teRedis(){
        System.out.println(redisUtil.set("ces","111",1000));
        System.out.println(redisUtil.get("ces"));
    }
}
