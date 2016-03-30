package com.safziy.spring.proxy;

import java.lang.reflect.Proxy;

public class MainClass {
	public static void main(String[] args) throws Exception {
		Object objTarget = Class.forName("com.safziy.spring.proxy.FooImpl").newInstance();
		FooImpl foo = (FooImpl) Proxy.newProxyInstance(Foo.class.getClassLoader(),
				objTarget.getClass().getInterfaces(), new MyInvocationHandler(objTarget));
		foo.speak();
	}
}
