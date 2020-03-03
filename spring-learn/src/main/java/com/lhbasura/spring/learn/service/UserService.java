package com.lhbasura.spring.learn.service;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("c")
public class UserService {
	private String name;
	private int age;

	public UserService(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public UserService(){}


	@Override
	public String toString() {
		return "UserService{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
