package com.bhavy.complex.beans.email;

import org.springframework.stereotype.Component;

@Component("awsService")
public class AWSEmailService implements EmailService{
	
	public AWSEmailService() {
		System.out.println("AWS Constructor");
	}

	@Override
	public void sendEmail(String toAddress, String messageBody) {
		System.out.println("-------------------- AWS Email Service --------------------");
		System.out.println("Email to"+ toAddress);
		System.out.println("Email message"+ messageBody);
		System.out.println("-----------------------------------------------------------");
	}

}
