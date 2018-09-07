package com.silvertb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.silvertb.mapper")
@SpringBootApplication
public class SilvertbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SilvertbApplication.class, args);
    }
}
