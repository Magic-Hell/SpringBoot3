package com.magichell.boot;

import com.magichell.boot.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Boot302DemoApplication {

	public static void main(String[] args) {
		var ioc = SpringApplication.run(Boot302DemoApplication.class, args);

//		for (String beanDefinitionName : ioc.getBeanDefinitionNames()) {
//			System.out.println(beanDefinitionName);
//		}

//		String[] forType = ioc.getBeanNamesForType(FastsqlException.class);
//		for (String s : forType){
//			System.out.println(s);
//		}

		for (String s : ioc.getBeanNamesForType(Cat.class)) {
			System.out.println("cat:" + s);
		}

		for (String s : ioc.getBeanNamesForType(Dog.class)) {
			System.out.println("dog:" + s);
		}

		Pig pig = ioc.getBean(Pig.class);
		System.out.println(pig);
		

	}

}
