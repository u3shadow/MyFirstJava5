package com.example.myfirstjava5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.myfirstjava5.mapper")
@SpringBootApplication
public class MyFirstJava5Application {

    public static void main(String[] args) {
        SpringApplication.run(MyFirstJava5Application.class, args);
    }

}
