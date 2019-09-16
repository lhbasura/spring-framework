package com.lhbasura.spring.learn.app;

import com.lhbasura.spring.learn.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(name = "userService")
	public UserService userService() {
		return new UserService("lhbasura", 22);
	}
}
