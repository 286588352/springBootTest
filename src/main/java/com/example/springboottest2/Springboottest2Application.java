package com.example.springboottest2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboottest2.mapper")
public class Springboottest2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboottest2Application.class, args);
    }

}
