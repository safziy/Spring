package com.safziy.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	
	Object foo;
	
	public MyInvocationHandler(Object foo) {
		this.foo = foo;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("MyInvocationHandler invoke");
		return method.invoke(foo, args);
	}

}
