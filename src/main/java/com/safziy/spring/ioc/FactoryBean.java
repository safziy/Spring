package com.safziy.spring.ioc;

public class FactoryBean {
	private int age;
	
	public static FactoryBean getInstance(){
		FactoryBean bean = new FactoryBean();
		bean.age = 52;
		return bean;
	}
	
	public void display() {
		System.out.println("My age is " + age + ".");
	}
}
