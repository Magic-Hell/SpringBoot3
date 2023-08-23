package com.magichell.boot.config;


import com.alibaba.druid.FastsqlException;
import com.magichell.boot.bean.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@Import(FastsqlException.class)  //给容器中放指定类型的组件，组建的名字默认是全类名
@SpringBootApplication//这是一个配置类
public class AppConfig {



    /**
     * 默认组件是单实例的
     * @return
     */
    @Scope("prototype")  //创建多实例
    @Bean  //相当于替代以前的Bean标签，组件在容器中的名字是方法名
     public User user(){
         var user = new User();
         user.setId(1L);
         user.setName("李四");
         return user;
     }

//     @Bean
//     public FastsqlException fastsqlException(){
//        return new FastsqlException();
//     }


}
