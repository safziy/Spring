package com.safziy.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.safziy.spring.annotation.DisplayBeanA;
import com.safziy.spring.annotation.DisplayBeanB;
import com.safziy.spring.ioc.AutoBean;
import com.safziy.spring.ioc.CollectionBean;
import com.safziy.spring.ioc.FactoryBean;
import com.safziy.spring.ioc.NullBean;
import com.safziy.spring.ioc.PrototypeBean;
import com.safziy.spring.ioc.SetBean;
import com.safziy.spring.ioc.SimpleBean;
import com.safziy.spring.ioc.SingletonBean;
import com.safziy.spring.ioc.SpELBean;

public class SpringIocTest {
	
	@Test
	public void testBean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
		// 获取bean
		SimpleBean bean = (SimpleBean) context.getBean("simpleBean");
		bean.display();
		bean.setAge(20);
		System.out.println("bean ...  " + bean);

		// 获取的bean默认是单例模式
		SimpleBean bean1 = (SimpleBean) context.getBean("simpleBean");
		bean1.display();

		System.out.println("bean1 ...  " + bean1);

		// 利用静态工厂来初始化bean
		FactoryBean bean2 = (FactoryBean) context.getBean("factoryBean");
		bean2.display();

		// Bean的作用域 (默认是单例singleton prototype则每次都会新建一个)
		PrototypeBean bean3 = (PrototypeBean) context.getBean("prototypeBean");
		System.out.println("bean3 ...  " + bean3);
		PrototypeBean bean4 = (PrototypeBean) context.getBean("prototypeBean");
		System.out.println("bean4 ...  " + bean4);

		SingletonBean bean5 = (SingletonBean) context.getBean("singletonBean");
		System.out.println("bean5 ...  " + bean5);
		SingletonBean bean6 = (SingletonBean) context.getBean("singletonBean1");
		System.out.println("bean6 ...  " + bean6);

		// set方法注入
		SetBean bean7 = (SetBean) context.getBean("setBean");
		bean7.display();

		// 内部bean
		SetBean bean8 = (SetBean) context.getBean("setBean1");
		bean8.display();

		// p标签
		SetBean bean9 = (SetBean) context.getBean("setBean2");
		bean9.display();

		// bean装载集合
		CollectionBean bean10 = (CollectionBean) context.getBean("collectionBean");
		bean10.display();

		// 装载null
		NullBean bean11 = (NullBean) context.getBean("nullBean");
		bean11.display();

		// SpEL 表达式
		SpELBean bean12 = (SpELBean) context.getBean("spELBean");
		bean12.display();

		// 装载null
		AutoBean bean13 = (AutoBean) context.getBean("autoBean");
		bean13.display();
	}

	@Test
	public void testAnnotation(){
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");

		DisplayBeanA beanA = context.getBean(DisplayBeanA.class);
		beanA.display();

		DisplayBeanB beanB = context.getBean(DisplayBeanB.class);
		beanB.display();
	}
	
}
