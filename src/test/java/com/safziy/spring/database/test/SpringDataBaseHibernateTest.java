package com.safziy.spring.database.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.safziy.spring.model.UserTest;

public class SpringDataBaseHibernateTest {

	@Test
	public void testHibernateSelect() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-database-test.xml");

		SessionFactory sessionFactory = (SessionFactory) context.getBean("localSessionFactory");

		Session session = sessionFactory.openSession();

		UserTest userTest = (UserTest) session.load(UserTest.class, 2);
		System.out.println(userTest);

		session.close();
	}

	@Test
	public void testHibernateInsert() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-database-test.xml");

		SessionFactory sessionFactory = (SessionFactory) context.getBean("localSessionFactory");

		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		UserTest userTest = new UserTest("name_Hony", "W");
		session.save(userTest);
		transaction.commit();
		session.close();

	}
}
