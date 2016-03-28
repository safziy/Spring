package com.safziy.spring.ioc;

public class NullBean {
	private String name;

	
	public void display() {
		System.out.println("My name is " + name + ".");
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
