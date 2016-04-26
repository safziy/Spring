package com.safziy.spring.database.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class SpringDataBaseJDBCTemplateTest {

	@Test
	public void testJDBCTemplateInsert() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-database-test.xml");

		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

		jdbcTemplate.update("insert into user_test(name,sex) values(?,?)", "name_Kitty", "W");
	}

	@Test
	public void testJDBCTemplateInsert2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-database-test.xml");

		NamedParameterJdbcTemplate namedParameterJdbcTemplate = (NamedParameterJdbcTemplate) context
				.getBean("namedParameterJdbcTemplate");

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("username", "name_Angle");
		paramMap.put("usersex", "W");
		namedParameterJdbcTemplate.update("insert into user_test(name,sex) values(:username, :usersex)", paramMap);
	}

	@Test
	public void testJDBCTemplateSelect() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-database-test.xml");

		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

		Map<String, Object> map = jdbcTemplate.queryForMap("select * from user_test where id=?", 2);

		int id = (Integer) map.get("id");
		String name = (String) map.get("name");
		String sex = (String) map.get("sex");

		System.out.println("id = " + id + " name = " + name + " sex = " + sex);
	}

}
