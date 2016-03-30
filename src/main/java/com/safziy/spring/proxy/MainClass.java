package com.safziy.spring.proxy;

import java.lang.reflect.Proxy;

public class MainClass {
	public static void main(String[] args) throws Exception {
		FooImpl target = (FooImpl)Class.forName("com.safziy.spring.proxy.FooImpl").newInstance();
		Foo foo = (Foo)Proxy.newProxyInstance(FooImpl.class.getClassLoader(),
				target.getClass().getInterfaces(), new MyInvocationHandler(target));
		foo.speak();
	}
}
