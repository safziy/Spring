package com.safziy.spring.ioc;

public class SpELBean {
	private int age;
	private float probability;
	private float capacity;
	private String name;
	private boolean flag;

	private SimpleBean simpleBean;
	private SimpleBean otherBean;

	private String song;

	private float pi;

	private double result;
	private boolean eFlag;

	public void setAge(int age) {
		this.age = age;
	}

	public void setProbability(float probability) {
		this.probability = probability;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public void display() {
		System.out.println(toString());
	}

	public void setSimpleBean(SimpleBean simpleBean) {
		this.simpleBean = simpleBean;
	}

	public void setOtherBean(SimpleBean otherBean) {
		this.otherBean = otherBean;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public void setPi(float pi) {
		this.pi = pi;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public void seteFlag(boolean eFlag) {
		this.eFlag = eFlag;
	}

	@Override
	public String toString() {
		return "SpELBean [age=" + age + ", probability=" + probability + ", capacity=" + capacity + ", name=" + name
				+ ", flag=" + flag + ", simpleBean=" + simpleBean + ", otherBean=" + otherBean + ", song=" + song
				+ ", pi=" + pi + ", result=" + result + ", eFlag=" + eFlag + "]";
	}

}
