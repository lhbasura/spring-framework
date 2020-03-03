package com.lhbasura.spring.learn.service;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author lhb
 * @version Fruit, v 1.0 2020/2/26 10:01 下午
 * @desc
 */
public class Fruit {
	private float price=100f;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Fruit(){
		System.out.println("object fruit is init");
	}

	@Override
	public String toString() {
		return "Fruit{" +
				"price=" + price +
				'}';
	}
}
