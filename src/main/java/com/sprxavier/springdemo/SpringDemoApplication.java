package com.sprxavier.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 1. SpringBoot在pom文件-->springboot-dependencies中定义了一系列的属性用于存放版本信息
 * 之后又定义了一个版本管理属性，引用了上述的版本信息 封装好了一套成熟稳定的版本引用
 *
 * 2. 项目的pom文件中继承了parent
 */
@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
