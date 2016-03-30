package com.safziy.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.safziy.spring.servies.BookServies;
import com.safziy.spring.servies.UserServies;

public class SpringAopTest {

	@Test
	public void testAop() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");

		UserServies userServies = (UserServies) context.getBean("userServies");
		userServies.speak("Hello Spring aop");

		BookServies bookServies = (BookServies) context.getBean("bookServies");
		bookServies.speak("Hello Spring aop");

	}

}
