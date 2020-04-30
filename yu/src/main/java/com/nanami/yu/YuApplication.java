package com.nanami.yu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nanami.yu.mapper") //mybatisPlus注解扫描位置
public class YuApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuApplication.class, args);
    }

}
