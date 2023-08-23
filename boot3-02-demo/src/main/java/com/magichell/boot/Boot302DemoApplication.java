package com.magichell.boot;

import com.alibaba.druid.FastsqlException;
import com.magichell.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot302DemoApplication {

	public static void main(String[] args) {
		var ioc = SpringApplication.run(Boot302DemoApplication.class, args);

//		for (String beanDefinitionName : ioc.getBeanDefinitionNames()) {
//			System.out.println(beanDefinitionName);
//		}

		String[] forType = ioc.getBeanNamesForType(FastsqlException.class);
		for (String s : forType){
			System.out.println(s);
		}


	}

}
