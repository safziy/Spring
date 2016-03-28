package com.safziy.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author Administrator
 *
 */
public class AutoBean {
	private SimpleBean simpleBean;
	
	@Autowired
	public void setSimpleBean(SimpleBean simpleBean) {
		this.simpleBean = simpleBean;
	}
	
	public void display(){
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "AutoBean [simpleBean=" + simpleBean + "]";
	}
	
}
