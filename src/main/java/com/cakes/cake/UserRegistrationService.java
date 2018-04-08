package com.cakes.cake;

import java.util.Iterator;
import java.util.Set; 
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class UserRegistrationService {

	private MailSender mailSender;
	private Set userEmailIds;

	public Set getUserEmailIds() {
		return userEmailIds;
	}

	public void setUserEmailIds(Set userEmailIds) {
		this.userEmailIds = userEmailIds;
	}

	public MailSender getMailSender() {
		return mailSender;
	}

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void uponSuccessfulRegistration(){

		SimpleMailMessage[] mailMessageArray = new SimpleMailMessage[userEmailIds.size()];
		Iterator iterator = userEmailIds.iterator();
		for (int desserts = 0; iterator.hasNext(); desserts ++){

			SimpleMailMessage message = new SimpleMailMessage();

			String toAddress = (String) iterator.next();
			message.setTo(toAddress);
			message.setSubject("User Registration successful");
			message.setText("The user '" + toAddress + "' is successfully registered");
			mailMessageArray[desserts] = message;
		}
		System.out.println("Sending email ....");
		mailSender.send(mailMessageArray);
	}
}
