package com.lhbasura.spring.learn.test;

import com.lhbasura.spring.learn.app.AppConfig;
import com.lhbasura.spring.learn.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = (UserService) context.getBean("userService");
		System.out.println(userService);
	}
}
