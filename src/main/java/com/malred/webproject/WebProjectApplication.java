package com.malred.webproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@SpringBootApplication
public class WebProjectApplication {
    //这是启动类,默认扫描同级及下级目录
    public static void main(String[] args) {
        SpringApplication.run(WebProjectApplication.class, args);
    }

}
