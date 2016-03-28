package com.safziy.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");

		DisplayBeanA beanA = context.getBean(DisplayBeanA.class);
		beanA.display();

		DisplayBeanB beanB = context.getBean(DisplayBeanB.class);
		beanB.display();
		
	}

}
