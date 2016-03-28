package com.safziy.spring.ioc;

public class SimpleBean {
	private int age;

	public SimpleBean(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println("My age is " + age + ".");
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getSong(){
		return "abCDefGH";
	}
}
