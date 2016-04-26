package com.safziy.spring.database.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDataBaseJDBCTest {

	@Test
	public void testJDBCInsert() throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-database-test.xml");

		DataSource datasource = (DataSource) context.getBean("datasource");
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = datasource.getConnection();

			ps = conn.prepareStatement("insert into user_test(name,sex) values(?,?)");
			ps.setString(1, "name_Jom");
			ps.setString(2, "M");
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			}
		}
	}

	@Test
	public void testJDBCSelect() throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-database-test.xml");

		DataSource datasource = (DataSource) context.getBean("datasource");
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = datasource.getConnection();

			ps = conn.prepareStatement("select * from user_test where id=?");
			ps.setInt(1, 1);
			rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String sex = rs.getString("sex");

				System.out.println("id = " + id + " name = " + name + " sex = " + sex);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				rs.close();
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			}
		}
	}

}
