package com.safziy.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationAdvice {

	@Before("execution(* com.safziy.spring.servies.BookServies.*(..))")
	public void before() {
		System.out.println("AnnotationAdvice before()");
	}
	
	@After("execution(* com.safziy.spring.servies.BookServies.*(..))")
	public void after() {
		System.out.println("AnnotationAdvice after()");
	}
	
	@AfterReturning("execution(* com.safziy.spring.servies.BookServies.*(..))")
	public void afterReturning() {
		System.out.println("AnnotationAdvice afterReturning()");
	}
	
	@AfterThrowing("execution(* com.safziy.spring.servies.BookServies.*(..))")
	public void afterThrowing() {
		System.out.println("AnnotationAdvice afterThrowing()");
	}
	
	@Around("execution(* com.safziy.spring.servies.BookServies.*(..))")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("AnnotationAdvice around()");
		pjp.proceed();
	}

}
