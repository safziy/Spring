package com.safziy.spring.ioc;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
	private List<String> list;
	private Set<SimpleBean> set;
	private Map<String, SimpleBean> map;
	// Properties装载非基本类型时 会强制转换
	private Properties pro;

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setSet(Set<SimpleBean> set) {
		this.set = set;
	}

	public void setMap(Map<String, SimpleBean> map) {
		this.map = map;
	}

	public void setPro(Properties pro) {
		this.pro = pro;
	}

	public void display() {
		System.out.println(toString());
		System.out.println(list.getClass());
		System.out.println(set.getClass());
		System.out.println(map.getClass());
		System.out.println(pro.getClass());
		System.out.println(pro.get("aaa"));
	}

	@Override
	public String toString() {
		return "CollectionBean [list=" + list + ", set=" + set + ", map=" + map + ", pro=" + pro + "]";
	}

}
