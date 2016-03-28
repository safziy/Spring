package com.safziy.spring.ioc;

public class SetBean {

	private int age;
	private SimpleBean otherBean;

	public void setAge(int age) {
		this.age = age;
	}

	public void setOtherBean(SimpleBean otherBean) {
		this.otherBean = otherBean;
	}
	
	public SimpleBean getOtherBean() {
		return otherBean;
	}

	public void display() {
		System.out.println("age = " + age + "  otherBean = " + otherBean);
	}

}
