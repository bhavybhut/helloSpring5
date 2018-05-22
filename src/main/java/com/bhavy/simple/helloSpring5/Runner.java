package com.bhavy.simple.helloSpring5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhavy.simple.beans.HelloWorld;

public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		
		HelloWorld hello = context.getBean(HelloWorld.class);
		hello.sayHello();
		System.out.println("Before context close");
		context.close();
		System.out.println("After context close");
	}

}
