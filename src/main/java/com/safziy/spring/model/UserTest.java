package com.safziy.spring.model;

public class UserTest {
	private int id;
	private String name;
	private String sex;

	public UserTest() {
	}

	public UserTest(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "UserTest [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}

}
