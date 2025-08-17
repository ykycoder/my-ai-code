package com.yky.myaicode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yky.myaicode.mapper")
public class MyAiCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyAiCodeApplication.class, args);
    }

}
