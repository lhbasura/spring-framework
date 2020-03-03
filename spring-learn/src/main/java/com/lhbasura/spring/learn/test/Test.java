package com.lhbasura.spring.learn.test;

import com.lhbasura.spring.learn.app.AppConfig;
import com.lhbasura.spring.learn.service.Fruit;
import com.lhbasura.spring.learn.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Fruit fruit = context.getBean(Fruit.class);
		System.out.println(fruit);
	}
}
