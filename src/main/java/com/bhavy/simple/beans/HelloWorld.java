package com.bhavy.simple.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld //implements InitializingBean, DisposableBean
{
	public HelloWorld() {
		System.out.println("Inside Bean Constructor");
	}
	
	public void sayHello() {
		System.out.println("Hello World from Spring 5 Application");
	}
	
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Inside destroy method");
	}
	
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside post construct method");
	}
	
	
}
