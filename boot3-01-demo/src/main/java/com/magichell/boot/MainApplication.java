package com.magichell.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//启动springboot项目的主入口
@SpringBootApplication //这是一个SpringBoot应用
@ComponentScan("com.magichell") //扫描包
public class MainApplication {
    public static void main(String[] args) {
        //java10： 局部变量类型的自动推断
        var ioc = SpringApplication.run(MainApplication.class, args);
        //1、获取容器中所有组件的名字
        String[] names = ioc.getBeanDefinitionNames();
        //2、挨个遍历：
        // dispatcherServlet、beanNameViewResolver、characterEncodingFilter、multipartResolver
        // SpringBoot把以前配置的核心组件现在都给我们自动配置好了。
        for (String name : names) {
            System.out.println(name);
        }
    }
}