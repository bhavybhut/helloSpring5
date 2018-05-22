package com.bhavy.complex.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.bhavy.complex.beans.email.EmailService;

@Component
public class NotificationService {
	
	//property based DI
	@Autowired
	@Qualifier("awsService")
	private EmailService emailService;
	
	//constructor based DI
	//@Autowired - removed after Spring 4 : No need to define for constructors
	/*public NotificationService(EmailService emailService) {
		//this.emailService = new EmailService(); //tight coupling - Don't ever do this please!
		this.emailService = emailService;
	}*/
	
	public void sendNotification(String to, String message) {
		this.emailService.sendEmail(to, message);
	}
	
	//Third type of DI - setter based DI
	//used when we have cyclic dependency
	//Class A depend on Class B and Class B depend on Class A
	//in this situation use third type of DI
	//@Autowired
	/*public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}*/
}
