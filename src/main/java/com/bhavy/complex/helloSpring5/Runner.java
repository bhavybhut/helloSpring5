package com.bhavy.complex.helloSpring5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhavy.complex.beans.NotificationService;

public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		
		NotificationService notifService = context.getBean(NotificationService.class);
		notifService.sendNotification("bhavybhut@gmail.com", "This is Email Service from Spring 5");
		
		context.close();
	}

}
