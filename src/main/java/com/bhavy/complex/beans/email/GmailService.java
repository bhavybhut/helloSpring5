package com.bhavy.complex.beans.email;

import org.springframework.stereotype.Component;

@Component("gmailService")
public class GmailService implements EmailService {

	public GmailService() {
		System.out.println("Gmail Constructor");
	}

	@Override
	public void sendEmail(String toAddress, String messageBody) {
		System.out.println("-------------------- Gmail Service --------------------");
		System.out.println("Email to"+ toAddress);
		System.out.println("Email message"+ messageBody);
		System.out.println("-------------------------------------------------------");
	}

}
