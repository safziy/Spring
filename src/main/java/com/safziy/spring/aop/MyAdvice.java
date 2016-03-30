package com.safziy.spring.aop;

public class MyAdvice {

	public void before() {
		System.out.println("MyAdvice before()");
	}
	
	public void after() {
		System.out.println("MyAdvice after()");
	}
	
	public void afterReturning() {
		System.out.println("MyAdvice afterReturning()");
	}
	
	public void afterThrowing() {
		System.out.println("MyAdvice afterThrowing()");
	}
	
	public void around() {
		System.out.println("MyAdvice around()");
	}

}
