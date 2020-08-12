package com.lgd.gmall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.lgd.gmall.user.mapper.UserMapper")
public class GmallUserApplication {

    public static void main(String[] args) {

        System.out.println("sssss");
        SpringApplication.run(GmallUserApplication.class, args);

    }

}
