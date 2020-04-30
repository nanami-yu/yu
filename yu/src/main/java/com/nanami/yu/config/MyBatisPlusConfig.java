package com.nanami.yu.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisPlusConfig {

    /**********************************
     * 用途说明:  开启分页支持
     * 参数说明
     * 返回值说明:
     ***********************************/
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setOverflow(true);// 开启 PageHelper 的支持
        return paginationInterceptor;
    }

}
