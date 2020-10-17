package com.zyp;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 此处导的包为tk.mybatis.spring.annotation.MapperScan;
 * 不是org.mybatis.spring.annotation.MapperScan;
 */
@SpringBootApplication
@MapperScan("com.zyp.mapper")
public class SpringbootRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRedisApplication.class, args);
    }

}
