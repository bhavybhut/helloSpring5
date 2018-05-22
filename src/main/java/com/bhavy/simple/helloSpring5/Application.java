package com.bhavy.simple.helloSpring5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bhavy.simple.beans")
public class Application {
	//1. one way to create beans
	//	@Bean
	//	public HelloWorld bean_HelloWorld() {
	//		return new HelloWorld();
	//	}
}
