package com.safziy.spring.annotation;


public class DisplayBeanA implements Display {

	@Override
	public void display() {
		System.out.println(this);
	}

}
